import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestThreadRunnable implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("This is currently running on the main thread, " +
					"the id is: " + Thread.currentThread().getId());
		TestThreadRunnable worker = new TestThreadRunnable();
		Thread thread = new Thread(worker);
		thread.start();
		Thread t2 = new Thread(worker);
		t2.start();
		Thread t3 = new Thread(worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.start();
		
		ldt = LocalDateTime.now();
		
		System.out.println(ldt + ":Main finished running");
		
	}

	/* the output as below (1)
	@Override
	public void run()
	{
		System.out.println("This is currently running on a separate thread, " + "the is id: " + Thread.currentThread().getId());
	

		This is currently running on the main thread, the id is: 1
		This is currently running on a separate thread, the is id: 10
		This is currently running on a separate thread, the is id: 12
		This is currently running on a separate thread, the is id: 11
		This is currently running on a separate thread, the is id: 13
		*/

		@Override
		public void run ()
		{
			LocalDateTime ldt = LocalDateTime.now();
			System.out.println(ldt + "This is currently running on a separate thread, " + "the is id: " + Thread.currentThread().getId());
	}
}
