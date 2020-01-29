import java.util.*;
import java.io.*;

/**
 * This is the class that defines the Employee Menu that will use the Singly
 * Linked List to pass in an Employee object and display there data and what the
 * user will be interacting with
 * 
 * @author Matthew Hudock
 *
 */
public class EmpMenu {

	private SLList<Employee> list = new SLList<Employee>();

	Scanner inFile = null;

	public EmpMenu() {

		try {

			inFile = new Scanner(new File("employee.txt"));
		}

		catch (FileNotFoundException e) {

			System.err.println("File format error");
			System.exit(1);
		}

		String temp = null;
		String[] tokens = new String[4];

		while (inFile.hasNext()) {

			temp = inFile.nextLine();

			tokens = temp.split(",[ ]*");

			list.add(new Employee(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3])));

		}

	}

	/**
	 * This is the method that will be displaying the menu and prompt the user to
	 * enter a number from 0-3 for which specific operation they would like to
	 * perform.
	 */
	public void display() {

		int option = displayMenu();

		while (option != 0) {

			switch (option) {

			case 1:
				printEmployees();
				break;

			case 2:
				addEmployee();
				break;

			case 3:
				findEmployee();
				break;

			default:
				System.out.println("Invalid Selection");
			}

			option = displayMenu();
		}

		System.out.println("Done");
	}

	/**
	 * This is how the Menu will be displayed when prompting the user for input it
	 * users a scanner input to do this
	 * 
	 * @return input.nextInt;
	 */
	public int displayMenu() {

		System.out.println("\n\nEmployee Menu");
		System.out.println("-------------");
		System.out.println("1. Display employees");
		System.out.println("2. Add employee");
		System.out.println("3. Find employee");
		System.out.println("0. Exit\n");
		System.out.print("Please Enter a number => ");
		Scanner input = new Scanner(System.in);

		return input.nextInt();

	}

	/**
	 * This method prints out the employees in the array and configures the
	 * formatting for how there data will be displayed.
	 */
	private void printEmployees() {

		System.out.printf("\n%-11s    %-11s     %-11s            %5s\n\n", "Employee ID", "First Name", "Last Name",
				"Salary");

		for (int i = 0; i < list.size(); i++) {

			Employee temp = list.get(i);

			System.out.printf("%-10s     %-10s      %-11s      %,13.2f\n", temp.getEmpID(), temp.getfName(),
					temp.getlName(), temp.getSalary());

		}

	}

	/**
	 * This is the method that will be called when the user wishes to input a new
	 * employee into the array by asking for An ID, First Name, Last Name, and
	 * Salary
	 */
	private void addEmployee() {

		Scanner input = new Scanner(System.in);

		String[] temp = new String[4];

		System.out.print("\nEnter Employee ID => ");

		temp[0] = input.next();

		System.out.print("\nEnter Employee First Name => ");

		temp[1] = input.next();

		System.out.print("\nEnter Employee Last Name => ");

		temp[2] = input.next();

		System.out.print("\nEnter Employee Salary => ");

		temp[3] = input.next();

		list.add(new Employee(temp[0], temp[1], temp[2], Double.parseDouble(temp[3])));

	}

	/**
	 * This is the method that will be used to find an employee in the list and
	 * formats how the employees information will be displayed.
	 */
	private void findEmployee() {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Employee ID => ");

		String empID = input.next();

		Employee target = new Employee(empID);

		int index = list.indexOf(target);

		if (index >= 0) {

			System.out.printf("\n%-15s%-12s", "First Name =>  ", list.get(index).getfName());
			System.out.printf("\n%-15s%-12s", "Last Name =>  ", list.get(index).getlName());
			System.out.printf("\n%-15s%,-12.2f", "Salary =>  ", list.get(index).getSalary());
		}

		else {

			System.out.println("\n" + empID + "Employee was not found");
		}

	}

}
