/**
 * 
 */

/**
 * @author User
 *
 */
public class TestTypeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Accept a double from command line
		
		
		Double salaryDbl = new Double(args[0]);
		double salary = salaryDbl.doubleValue(args[0]);
		if(Double.isNaN(args[0]))	{
			System.out.println("Salary is not valid: );" + salaryDbl;
			System.out,println
		}
		
		
		//convert salary to a string = use value method
		String salaryStr = String.valueOf(salary);
		
		System.out.println(salaryStr); 		//the wrapper classes
		
	}

}
