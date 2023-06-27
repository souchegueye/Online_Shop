package project4;

//HP class extending Laptop
class HP extends Laptop {
 public HP(String name, double price) {
     super(name, price);
 }

 @Override
 public void displayInfo() {
     System.out.println("HP: " + name);
 }
}