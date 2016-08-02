package com;

public class Main {

	public static void main(String[] args) {
		
		Good[] goods = {
						new Good("tomatoe", 35.5f, 2.0f),
						new Good("cheese", 80.0f, 0.350f),
						new Good("potato", 7.5f, 7.0f)
					};
		
		ShopingCart sc = new ShopingCart(goods);
		sc.display();
		sc.add(new Good("carrot", 13f,3.5f));
		sc.display();
		
		

	}

}
