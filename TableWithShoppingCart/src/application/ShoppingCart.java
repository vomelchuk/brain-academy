package application;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	// fields
	List<Good> goods;
	GoodsDB db;

	// constructor
	public ShoppingCart() {
		goods = new ArrayList<>();
	}

	// methods
	public void add(Good... goods) {
		for (Good good : goods) {
			this.goods.add(good);
			GoodsDB.insert(good.getName(),good.getPrice(), good.getQuantity());
		}
	}

	public void remove(Good... goods) {
		for (Good good : goods) {
			this.goods.remove(good);
		}
	}
	
	public List<Good> get(){
		return GoodsDB.select();
	}

	public void display() {
		int count = 1;
		for (Good good : goods) {
			System.out.println(count++ + ": " + good);
		}
	}

}
