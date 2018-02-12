/*Create a StringBuilder with "I am Studying Java"
 * Print first 3 characters
 * Print last 3 characters
 * Extract Studying and print
 */

/**
 * @author User
 *
 */
public class MyStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
/* this is set by nadiha
	StringBuilder sb = new StringBuilder ("I am Studying Java");
*/

//Initialising the StringBuilder class with string passed via Command Line (turored by sir)
	StringBuilder sb = new StringBuilder (args[0]);
	String constant = "Studying";
	System.out.println("Given String:" + sb + "wiht length :" + sb.length());
	System.out.println("First three is :" + sb.substring(0,3));
	System.out.println("Last three is :" + sb.substring(sb.length()-3));
	int startOfConstant = sb.indexOf(constant);
	int endOfConstant = startOfConstant + constant.length();
	System.out.println("Print Studying :" + sb.substring(startOfConstant,endOfConstant));
	
	//Insert <space your name> after "am"
	sb.insert((sb.indexOf("am") + 2), " kwang");
	System.out.println("After insert :" + sb);
	sb.delete(sb.indexOf("am"),sb.indexOf("am")+2);
	System.out.println("After delete :" + sb);
	
	//reverse
	//equality
	
	StringBuilder sb2 = new StringBuilder (args[0]);
	System.out.println(sb == sb2);
	StringBuilder sb3 = (sb.insert((sb.indexOf("am")+2),  " kwang"));
	System.out.println(sb == sb3);
	
	sb = null;	//always practice to set null so that the jvm will know it is no longer needed
	sb2 = null;
	sb3 = null;
	
	
	System.out.println("sb:" + sb);
	System.out.println("sb3:" + sb3);
	}

}
