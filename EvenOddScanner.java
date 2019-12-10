import java.util.Scanner;

public class EvenOddScanner {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in); // Scanner to be used to allow user input

		System.out.println("Please enter a number => ");

		int num = scnr.nextInt();// int to hold user inputed number

		if (num % 2 == 0) {// if statement to determine if even or odd
			System.out.println(num + " => Even");
		} else {
			System.out.println(num + " => Odd");
		}

	}

}
