package project4;

//Accessories class extending ElectronicGadget
class Accessories extends ElectronicGadget {
	public Accessories(String name, double price) {
		super(name, price);
	}

	@Override
	public void displayInfo() {
		System.out.println("Accessory: " + name);
	}

	@Override
	public double getPrice() {
		return price;
	}
}
