import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestThreadThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("This is currently running on the main thread, " +
					"the id is: " + Thread.currentThread().getId());
		
		//Create and initialize threads
		TestThreadThread worker = new TestThreadThread();
		Thread thread = new Thread(worker);
		thread.start();
		Thread t2 = new Thread(worker);
		t2.setName("T2");
		t2.setPriority(MIN_PRIORITY);
		Thread t3 = new Thread(worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.setName("T2");
		t4.setPriority(MAX_PRIORITY);
		Thread t5 = new Thread(worker);
		t5.start();
		Thread t6 = new Thread(worker);
		t6.start();
		Thread t7 = new Thread(worker);
		t7.start();
		
		ldt = LocalDateTime.now();
		
		System.out.println(ldt + ":Main finished running");
		
		//Start thread
			t2.start();
			t3.start();
			t4.start();
			t5.start();
		
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
			System.out.println(ldt + "This is currently running on a separate thread, " + "the is id: " 
			+ Thread.currentThread().getId() + ", with Name :" + Thread.currentThread().getName() + 
			", with Priority :" + Thread.currentThread().getPriority() );
	}
}
