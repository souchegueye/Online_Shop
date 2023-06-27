package project4;

//Items class extending ElectronicGadget
class Items extends ElectronicGadget {
 public Items(String name, double price) {
     super(name, price);
 }

 @Override
 public void displayInfo() {
     System.out.println("Item: " + name);
 }

 @Override
 public double getPrice() {
     return price;
 }
}