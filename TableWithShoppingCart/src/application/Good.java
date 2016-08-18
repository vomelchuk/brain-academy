package application;

public class Good {
	// fields
			private String name;
			private float price;
			private float quantity;

			// constructor
			public Good(String name, float price, float quantity) {
				super();
				this.name = name;
				this.price = price;
				this.quantity = quantity;
			}

			// accessors
			public String getName() {
				return name;
			}

			public float getPrice() {
				return price;
			}

			public float getQuantity() {
				return quantity;
			}

			public void setName(String name) {
				this.name = name;
			}

			public void setPrice(float price) {
				this.price = price;
			}

			public void setQuantity(float quantity) {
				this.quantity = quantity;
			}

			// methods
			@Override
			public String toString() {
				return "Good [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
			}
}
