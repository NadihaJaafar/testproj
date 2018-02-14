/**
 * 
 */
import java.util.Calendar;
import java.util.Date;
//import java.time; 

/**
 * @author User
 *
 */
public class UtilTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* (1)
		Date dt = new Date ();
		System.out.println("Current date is :" + dt);
		
		// output= Current date is :Tue Feb 13 09:37:59 SGT 2018
		 * 
		 */
		
		/*
		//(2)
		Date dt = new Date ();
		String currentDate = String.valueOf(dt.getDate());
		String currentDay = String.valueOf(dt.getDay());
		System.out.println("Current Date is :" + currentDate);
		System.out.println("Current Day is :" + currentDay);
		System.out.println("Current Time is :" + dt.getTime());
		
		Calendar cal = Calendar.getInstance();
		String currentCalDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1)
				+ "/" + cal.get(Calendar.YEAR) + " " + cal.get(Calendar.DATE) + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + cal.get(Calendar.SECOND) + " " + cal.getTimeZone().getDisplayName();
		System.out.println("Current Date is :" + currentCalDate); 

		
		//output= Current Date is :13
		Current Day is :2
		Current Time is :1518487296199
		Current Date is :13/2/2018 1310:136 Singapore Time
		*/

		//class name must be dynamic by setting command parameter
		
		Date dt = new Date ();
		String currentDate = String.valueOf(dt.getDate());
		String currentDay = String.valueOf(dt.getDay());
		System.out.println("Current Date is :" + currentDate);
		System.out.println("Current Day is :" + currentDay);
		System.out.println("Current Time is :" + dt.getTime());
		
		
	}

}
