package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.Model.Calculator;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

	@FXML
	Model.Calculator model;

	@FXML
	Label result;
	@FXML
	TextField value1;
	@FXML
	TextField value2;

	@FXML
	Button addition;
	@FXML
	Button subtraction;
	@FXML
	Button multiplicity;
	@FXML
	Button division;

	public void additionOnAction() {
		if (value1.getText().length() > 0 && value1.getText().length() > 0) {
			int result = model.add.execute(Integer.valueOf(value1.getText()), Integer.valueOf(value2.getText()));
			this.result.setText(String.valueOf(result));
		}
	}

	public void subtractionOnAction() {
		if (value1.getText().length() > 0 && value1.getText().length() > 0) {
			int result = model.subtraction.execute(Integer.valueOf(value1.getText()),
					Integer.valueOf(value2.getText()));
			this.result.setText(String.valueOf(result));
		}
	}

	public void multiplyOnAction() {
		if (value1.getText().length() > 0 && value1.getText().length() > 0) {
			int result = model.multiply.execute(Integer.valueOf(value1.getText()), Integer.valueOf(value2.getText()));
			this.result.setText(String.valueOf(result));
		}
	}

	public void divisionOnAction() {
		if (value1.getText().length() > 0 && value1.getText().length() > 0) {
			int result = model.division.execute(Integer.valueOf(value1.getText()), Integer.valueOf(value2.getText()));
			this.result.setText(String.valueOf(result));
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		model = new Calculator();
	}

}
