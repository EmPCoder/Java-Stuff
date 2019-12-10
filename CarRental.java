import java.util.Scanner;

class CarRental {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter the type of car you would like to rent ");

		String carType = scnr.next();

		switch (carType) {
		case "sports":
			System.out.println("You have chosen to rent a Sports car!");
			break;
		case "luxury":
			System.out.println("You have chosen to rent a Luxry car!");
			break;
		case "exotic":
			System.out.println("You have chosen to rent a Exotic car!");
			break;
		default:
			System.out.println("please choose one of the above options");
			break;

		}

		System.out.println("How many days would you like to rent your " + carType + " car for?");

		int days = scnr.nextInt();

		System.out.println("you have chosen to rent a " + carType + " car for " + days + " days");

		final double sportsInsurance = 24.99 * days;
		final double luxuryInsurance = 19.99 * days;
		final double exoticInsurance = 34.99 * days;

		switch (carType) {
		case "sports":
			double sportsPrice = days * 143 + sportsInsurance;
			System.out.println("That will be => $" + sportsPrice);
			break;
		case "luxury":
			double luxuryPrice = days * 115 + luxuryInsurance;
			System.out.println("That will be => $" + luxuryPrice);
			break;
		case "exotic":
			double exoticPrice = days * 179 + exoticInsurance;
			System.out.println("That will be => $" + exoticPrice);
			break;
		default:
			System.out.println("Please choose one ofthe above options");
			break;
		}

	}
}
