// Oscar Ortiz
// Test 2
// 5/4/2016

import java.util.Scanner;

public class Test
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		
		// Construct three automobiles
		Automobile truck = new Automobile("F150", 3);
		Automobile van = new Automobile("Transit-350", 4);
		Automobile sportsCar = new Automobile("Mustang", 6);
		
		truck.drive(1);
		van.drive(1);
		sportsCar.drive(1);
		
		System.out.printf("Distance traveled by the truck is: %.2f %s.", truck.getDistanceTraveled(), "miles");
		System.out.printf("\nDistance traveled by the van is: %.2f %s.", van.getDistanceTraveled(), "miles");
		System.out.printf("\nDistance traveled by the sports car is: %.2f %s.\n", sportsCar.getDistanceTraveled(), "miles");
		
		// Get number of dices
		System.out.print("\nEnter number of dices: ");
		int diceNumber = input.nextInt();
		
		// Roll dice
		int diceRoll1 = Automobile.throwDice(diceNumber);
		int diceRoll2 = Automobile.throwDice(diceNumber);
		int diceRoll3 = Automobile.throwDice(diceNumber);
		
		// Drive vehicles
		truck.drive(diceRoll1);
		van.drive(diceRoll2);
		sportsCar.drive(diceRoll3);
		
		// Display vehicle status
		System.out.printf("\nVehicle make: %s \nVehicle model: %s \nVehicle color: %s "
				+ "\nDistance traveled: %.2f %s. \nNumber of gears: %d\n",
				truck.getMake(), truck.getModel(), truck.getColor(), truck.getDistanceTraveled(),
				"miles", truck.getNumberOfGears());
		
		System.out.printf("\nVehicle make: %s \nVehicle model: %s \nVehicle color: %s "
				+ "\nDistance traveled: %.2f %s. \nNumber of gears: %d\n",
				van.getMake(), van.getModel(), van.getColor(), van.getDistanceTraveled(),
				"miles", van.getNumberOfGears());
		
		System.out.printf("\nVehicle make: %s \nVehicle model: %s \nVehicle color: %s "
				+ "\nDistance traveled: %.2f %s. \nNumber of gears: %d\n",
				sportsCar.getMake(), sportsCar.getModel(), sportsCar.getColor(), sportsCar.getDistanceTraveled(),
				"miles", sportsCar.getNumberOfGears());
		
	}
}


// I don't see the Automobile.java, Oscar
