package carsPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// using validator class to check if a number is entered.
		int userNum = Validator.getInt(scan, "How many cars would you like to enter? ");
		int counter = 1;
		ArrayList<Car> carList = new ArrayList<>();

		for (int i = 0; i < userNum; i++) {
			String make = Validator.getString(scan, "Enter car #" + counter + " Make: ");
			String model = Validator.getString(scan, "Enter car #" + counter + " Model: ");
			int year = Validator.getInt(scan, "Enter car #" + counter + " Year: ");
			double price = Validator.getDouble(scan, "Enter car #" + counter + " Price: ");
			carList.add(new Car(make, model, year, price));
			counter++;
		}
		System.out.println("Current Inventory: ");
		for (Car c : carList) {
			System.out.println(c);
		}
	}

}
