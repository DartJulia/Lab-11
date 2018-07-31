package carsPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class NewUsedCarApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput3 = null;
		ArrayList<Car> cars = new ArrayList<>();
		// calling inventory
		inventory(cars);

		do {
			// displaying the car inventory from the array
			int counter = 1;
			System.out.println("New and Used Car Inventory: ");
			for (Car c : cars) {
				System.out.println(counter + ". " + c);
				counter++;
			}
			System.out.println("0. Quit");

			int userInput = Validator.getInt(scan, "Which car would you like? ");
			if (userInput == 0) {
				System.out.println("Have a great day! ");
				break;
			}
			// Accessing and displaying the selected car
			System.out.println(cars.get(userInput - 1));

			String userInput2 = Validator.getString(scan, "Would you like to buy this car? (yes/no) ");

			if (userInput2.equals("yes")) {

				System.out.println("Excellent, our finance department will be in contact with you shortly. ");
				System.out.println("");
				cars.remove(userInput - 1);
				userInput3 = "yes";

			} else {
				userInput3 = Validator.getString(scan,
						"No problem, would you like to select a different car? (yes/no) ");
			}

		} while (userInput3.equals("yes"));

	}

	// Populating array of cars
	public static void inventory(ArrayList<Car> cars) {

		cars.add(new UsedCar("Ford", "Mustang", 2014, 20000.0, 40500.0));
		cars.add(new Car("Toyota", "Prius", 2018, 24000.0));
		cars.add(new UsedCar("Chevy", "Cruze", 2012, 17000.0, 30915.0));
		cars.add(new Car("Honda", "Accord", 2018, 26000.0));
		cars.add(new UsedCar("Chevy", "Camaro", 2016, 32000.0, 10000.0));
		cars.add(new Car("Honda", "CR-V", 2018, 30000.0));



	}

}
