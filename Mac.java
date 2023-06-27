package project4;

//Mac class extending Laptop
class Mac extends Laptop {
	public Mac(String name, double price) {
		super(name, price);
	}

	@Override
	public void displayInfo() {
		System.out.println("Mac: " + name);
	}
}
