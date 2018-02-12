import java.util.ArrayList;

//error the whole data

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList ();		//<String> means all the objects must be string
				
		for (String str:args)  {
			al.add(str);
		
		}
		System.out.println("Array list is empty:" + al.isEmpty());
		System.out.println("Array List size is:" + al.size());
		
		//al.add(new Integer(10));
		//al.add(Boolean.TRUE);
		
		System.out.println("Original" + al);
		al.remove("two");
		System.out.println("Now:" + al);
		al.set(1, "New");	
		System.out.println("Now:" + al);
		
		Object ar[]= al.toArray();
		System.out.println(al);
		}
	}

	


