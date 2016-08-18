package com;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart {

	// fields
	List<Good> goods;
	GoodsDB database = new GoodsDB();

	// constructors
	public ShopingCart() {
	};

	public ShopingCart(Good... goods) {
		this.goods = new ArrayList<>();
		for (Good good : goods) {
			this.goods.add(good);
			this.database.insert(good.getName(), good.getPrice(), good.getWeight());
		}

	}

	// methods
	public void add(Good good) {
		this.goods.add(good);
		database.insert(good.getName(), good.getPrice(), good.getWeight());
	}

	public void add(Good... goods) {
		for (Good good : goods) {
			this.goods.add(good);
			database.insert(good.getName(), good.getPrice(),good.getWeight());
		}
	}

	public void display() {
		database.print();
	}

}
