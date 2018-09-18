

/////////////////////////////////////////////
//Author:					Brandon Edelman
//Creation Date:			9/8/18
//Due Date:					9/18/18
//Class:					CSC243- Java
//Professor: 				Demarco
//Purpose:					This project
//is designed to take in 2 inputs from 
//the user and find out the assessment
//value and the property tax on the
//amount of acres owned and its actual
//value.
////////////////////////////////////////////

import java.util.Scanner;
import java.text.DecimalFormat;

public class Retirement {

	public static void main(String[] args) {
		double retire;
		double amMon;
		 // Scanner used to read inputs
		Scanner rec = new Scanner(System.in);

		 
		do {
			// Get the number of years until retirement from the user
			System.out.print("Please enter the number of years until you retire- ");
			retire = rec.nextDouble();
			// Get the amount of money the user can save each year
			System.out.print("Please enter the amount of money you can save every year $");
			amMon = rec.nextDouble();

			// Check if the user inputs are valid
			if ((retire > 0 && retire < 120) && amMon > 0) {
				System.out.println("You can retire in " + retire + " year(s).");
				System.out.println("You can save $" + amMon + " each year.");

				// Find the interest and print
				DecimalFormat dec = new DecimalFormat("#.00");
				double interest;
				final double IN_RATE = .05;
				interest = (amMon * IN_RATE) * retire;
				System.out.println(
						"You will pay $" + dec.format(interest) + " in interest.");

				// Print the total amount of money the user will have for retirement
				double totalSav;
				totalSav = (amMon * retire) - interest;
				System.out.println("The total amount of money saved before you retire is $" + dec.format(totalSav));
				System.out.println("  ");
				break;

				
			} else {
				// If the inputs are invalid, report invalid
				System.out.println("Sorry those are invalid Entries. There must be a value thats greater than 0.");
				System.out.println("  ");
			}

			// Loop until the user provides valid inputs
		} while (true);

	}

}