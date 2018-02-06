package dstcalc;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		new Controller();
	}

	Controller() {
		// Displays a menu of options
		System.out.println("Distance Speed Time calculator");
		System.out.println("------------------------------");
		System.out.println("Select the value you wish to caluclate:");
		System.out.println("1. Distance");
		System.out.println("2. Speed");
		System.out.println("3. Time");
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextInt()) {
			int input = scan.nextInt();
			// Calls a different function based on what option was picked
			switch (input) {
			case 1:
				// Calculates the distance and outputs it
				double distance = calcDistance();
				System.out.println("The distance is: " + distance + " miles");
				break;
			case 2:
				// Calculates the speed and outputs it
				double speed = calcSpeed();
				System.out.println("The speed is: " + speed + " mph");
				break;
			case 3:
				// Calculates the time and outputs it
				double time = calcTime();
				System.out.println("The time is: " + time);
				break;
			default:
				// Displays an error message on invalid input
				System.out.println("Invalid Input");
			}
		} else {
			// Displays an error message on invalid input
			System.out.println("Invalid Input");
		}
		scan.close();
	}

	// Handles calculating the distance
	public double calcDistance() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double distance = 0;
		double speed = 0;
		double time = 0;
		// Prompts the user for the speed
		System.out.println("Enter the Speed (mph)");
		speed = scan.nextDouble();
		// Prompts the user for the time
		System.out.println("Enter the Time (H.MM)");
		time = scan.nextDouble();
		// Calculates and returns the distance
		distance = speed * time;
		return distance;
	}

	// Handles calculating the distance
	public double calcSpeed() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double distance = 0;
		double speed = 0;
		double time = 0;
		// Prompts the user for the distance
		System.out.println("Enter the Distance (miles)");
		distance = scan.nextDouble();
		// Prompts the user for the time
		System.out.println("Enter the Time (H.MM)");
		time = scan.nextDouble();
		// Calculates and returns the speed
		speed = distance / time;
		return speed;
	}

	// Handles calculating the distance
	public double calcTime() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double distance = 0;
		double speed = 0;
		double time = 0;
		// Prompts the user for the distance
		System.out.println("Enter the Distance (miles)");
		distance = scan.nextDouble();
		// Prompts the user for the speed
		System.out.println("Enter the Speed (mph)");
		speed = scan.nextDouble();
		// Calculates and returns the time
		time = distance / speed;
		return time;
	}
}
