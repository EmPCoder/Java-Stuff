/*******
 * @author Matthew Hudock
 * This program utilizes a method defined as tipCalc and allows for
 * user input and then determines the amount of tip that should be 
 * left based on the amount of the total bill
 * 
 * It then displays the amount of the bill, the total bill, as well
 * as the amount that was paid in the tip.
 */

import java.util.*;
import java.math.*;

public class TipCalc {

	public static void main(String[] args) {

		tipCalc(0, 0);//Calling tipCalc method
	}

	public static double tipCalc(double price, double taxRate) {

		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter the cost of your bill =>");
		double billPrice = scnr.nextDouble();
		double totalPrice;
		/****
		 * If else block to determine the amount to tip 
		 * based on the price of the bill
		 */
		if (billPrice <= 50) {
			totalPrice = billPrice * 1.15;
		} else if (price >= 50 && price <= 150) {
			totalPrice = billPrice * 1.20;
		} else {
			totalPrice = billPrice * 1.10;
		}

		System.out.println("You're total bill will be => " + totalPrice);
		System.out.println("The bill itself was => " + billPrice);
		System.out.println("The tax on the bill was => " + (totalPrice - billPrice));

		return totalPrice;
	}

}
