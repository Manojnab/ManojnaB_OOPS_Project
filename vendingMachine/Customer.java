package vendingMachine;

public class Customer {
	private String name;
	private String Id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public Customer(String name, String id) {
		super();
		this.name = name;
		Id = id;
	}
	public int getTotalAmount(int n,int qty) {
		return n*qty;
	}
}
