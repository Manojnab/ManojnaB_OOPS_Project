package vendingMachine;

public class Products {
	private String pName;
	private int price;
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Products(String pName, int price) {
		super();
		this.pName = pName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [pName=" + pName + ", price=" + price + "]";
	}
	
}
