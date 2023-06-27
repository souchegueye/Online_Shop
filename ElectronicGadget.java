package project4;

//Abstract class for electronic gadgets
abstract class ElectronicGadget {
 protected String name;
 protected double price;

 public ElectronicGadget(String name, double price) {
     this.name = name;
     this.price = price;
 }

 public abstract void displayInfo();
 public abstract double getPrice();
}
