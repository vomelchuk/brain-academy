package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Main extends Application {
	// fields
	private TableView<Good> table = new TableView<>();
	private final ObservableList<Good> data = FXCollections.observableArrayList(GoodsDB.select());
	private final HBox hb = new HBox();
	private final HBox hbe = new HBox();
	private final VBox vbox = new VBox();

	// methods
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {

		Scene scene = new Scene(new Group());
		stage.setTitle("Table with goods");
		stage.setWidth(600);
		stage.setHeight(400);

		final Label label = new Label("Shopping cart");
		label.setFont(new Font("Ubuntu", 20));

		table.setEditable(true);
		table.setMaxHeight(250);

		TableColumn<Good, String> nameCol = new TableColumn<>("Name");
		nameCol.setMinWidth(300);
		nameCol.setCellValueFactory(new PropertyValueFactory<Good, String>("name"));
		nameCol.setSortType(TableColumn.SortType.ASCENDING);
		TableColumn<Good, String> priceCol = new TableColumn<>("Price");
		priceCol.setMinWidth(130);
		priceCol.setCellValueFactory(new PropertyValueFactory<Good, String>("price"));
		TableColumn<Good, String> quantityCol = new TableColumn<>("Quantity");
		quantityCol.setMinWidth(130);
		quantityCol.setCellValueFactory(new PropertyValueFactory<Good, String>("quantity"));

		table.setItems(data);
		table.getColumns().addAll(nameCol, priceCol, quantityCol);

		Label entire = new Label("Sum:");
		Label sum = new Label(Float.toString(getSum(data)));

		final TextField addName = new TextField();
		addName.setPromptText("Name");
		addName.setMaxWidth(nameCol.getPrefWidth());
		final TextField addPrice = new TextField();
		addPrice.setPromptText("Price");
		addPrice.setMaxWidth(priceCol.getPrefWidth());
		final TextField addQuantity = new TextField();
		addQuantity.setPromptText("Quantity");
		addQuantity.setMaxWidth(quantityCol.getPrefWidth());

		final Button addButton = new Button("Add");
		addButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				data.add(new Good(addName.getText(), Float.valueOf(addPrice.getText()),
						Float.valueOf(addQuantity.getText())));
				addName.clear();
				addPrice.clear();
				addQuantity.clear();
				sum.setText(Float.toString(getSum(data)));
			}
		});

		final Button saveToDBButton = new Button("Export to DB");
		saveToDBButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				saveToDBButton.setUnderline(true);
				GoodsDB.delete();
				for (Good good : data) {
					GoodsDB.insert(good.getName(), good.getPrice(), good.getQuantity());
				}
				saveToDBButton.setUnderline(false);
			}

		});

		hbe.getChildren().addAll(entire, sum, saveToDBButton);
		hbe.setSpacing(20);

		hb.getChildren().addAll(addName, addPrice, addQuantity, addButton);
		hb.setSpacing(20);

		vbox.setSpacing(5);
		vbox.setPadding(new Insets(10, 0, 0, 10));
		vbox.getChildren().addAll(label, hb, table, hbe);

		((Group) scene.getRoot()).getChildren().addAll(vbox);
		stage.setScene(scene);
		stage.show();
	}

	private static float getSum(ObservableList<Good> data) {
		float sum = 0;
		for (Good good : data) {
			sum += good.getPrice() * good.getQuantity();
		}
		return sum;
	}

}
