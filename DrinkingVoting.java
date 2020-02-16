import java.util.Scanner;

public class DrinkingVoting {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter your current age =>");

		int age = scnr.nextInt();
		
		if (age <= 18 && age <= 21) {
			System.out.println("You cannot vote or drink");
		}

		else if (age >= 18 && age <= 21) {
			System.out.println("Congrats you can vote!, however you cannot drink");
		}
		
		else {
			System.out.println("You can vote and Drink!");
		}

	}

}

