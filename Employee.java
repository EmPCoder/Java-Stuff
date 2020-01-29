/**
 * 
 * @author Matthew Hudock This class defines an Employee Object while
 *         implementing the Comparable interface, it also defines all the data
 *         types that will be used in the employee object as well as generating
 *         the constructors and get methods that will be used.
 */
public class Employee implements Comparable {

	private String empID;
	private String fName;
	private String lName;
	private double salary;

	/**
	 * This is the employee constructor.
	 * 
	 * @param empID
	 * @param fName
	 * @param lName
	 * @param salary
	 */
	public Employee(String empID, String fName, String lName, double salary) {
		super();
		this.empID = empID;
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}

	/**
	 * This is the employeeID constructor
	 * 
	 * @param empID
	 */
	public Employee(String empID) {

		super();
		this.empID = empID;

	}

	/**
	 * This is the get method for getting the employeeID
	 * 
	 * @return empID
	 */
	public String getEmpID() {
		return empID;
	}

	/**
	 * This is the get method for getting the employees First Name
	 * 
	 * @returnfName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * This is the get method for getting the employees Last Name
	 * 
	 * @return
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * This is the get method for getting the employees Salary
	 * 
	 * @return salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * This is the method that will be used to compare the different Employees using
	 * there Employee ID
	 */
	@Override
	public int compareTo(Object arg) {

		return this.empID.compareTo(((Employee) arg).getEmpID());

	}

}
