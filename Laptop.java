package project4;

//Laptop class extending ElectronicGadget
class Laptop extends ElectronicGadget {
	public Laptop(String name, double price) {
		super(name, price);
	}

	@Override
	public void displayInfo() {
		System.out.println("Laptop: " + name);
	}

	@Override
	public double getPrice() {
		return price;
	}
}