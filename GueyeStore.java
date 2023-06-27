package project4;

import java.util.Scanner;

public class GueyeStore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Array to store the selected items
		ElectronicGadget[] selectedItems = new ElectronicGadget[100];
		int selectedItemCount = 0;

		// Create instances of available items
		ElectronicGadget[] availableItems = { new Mac("MacBook Air", 1000), new Mac("MacBook Pro", 1500),
				new Mac("MacBook M1", 1200), new HP("HP i7", 900), new HP("HP i5", 700), new HP("HP i3", 500),
				new Items("External Mouse", 50), new Items("Keyboard", 80), new Items("Webcam", 100),
				new Accessories("Cooling pad", 30), new Accessories("HDMI cable", 20), new Accessories("USB cable", 10),
				new Accessories("Adapter", 15) };

		double totalCost = 0.0;

		System.out.println("Welcome to the Online Store!");

		while (true) {
			System.out.println("Choose an option:");
			System.out.println("1. Buy an item");
			System.out.println("2. View selected items");
			System.out.println("3. Checkout");
			System.out.println("4. Exit");

			int option = scanner.nextInt();

			if (option == 1) {
				System.out.println("Available items:");
				for (int i = 0; i < availableItems.length; i++) {
					System.out.println((i + 1) + ". " + availableItems[i].name + " - $" + availableItems[i].price);
				}

				System.out.println("Enter the item number to buy:");
				int itemNumber = scanner.nextInt();
				if (itemNumber >= 1 && itemNumber <= availableItems.length) {
					ElectronicGadget selected = availableItems[itemNumber - 1];
					selectedItems[selectedItemCount] = selected;
					selectedItemCount++;
					totalCost += selected.getPrice();
					System.out.println("Item added to the cart.");
				} else {
					System.out.println("Invalid item number.");
				}
			} else if (option == 2) {
				System.out.println("Selected items:");
				for (int i = 0; i < selectedItemCount; i++) {
					System.out.println((i + 1) + ". " + selectedItems[i].name + " - $" + selectedItems[i].price);
				}
			} else if (option == 3) {
				System.out.println("------------Receipt---------");
				// System.out.println("----------------------------");
				System.out.println("Item(s)             Price");
				System.out.println("----------------------------");

				for (int i = 0; i < selectedItemCount; i++) {
					System.out.printf("%-18s $%.2f%n", selectedItems[i].name, selectedItems[i].price);
				}

				System.out.println("----------------------------");
				System.out.println("Total item(s): " + selectedItemCount);
				System.out.printf("Total price: $%.2f%n", totalCost);

				if (totalCost > 500) {
					System.out.println("You have a gift card of $500.");
					double remainingAmount = totalCost - 500;
					System.out.printf("Remaining amount paid: $%.2f%n", remainingAmount);
				} else {
					System.out.printf("Total amount: $%.2f%n", totalCost);
				}

				// break;
				System.out.println("-----------------------");
			} else if (option == 4) {
				System.out.println("Thank you for shopping with Gueye Store. Goodbye!");
				break;
			} else {
				System.out.println("Invalid option. Please choose a valid option.");
			}
		}

		scanner.close();
	}
}
