/**
 * Homework
Implement a computation that increments an integer counter 10 million times.  Implement it first in single thread and make sure in a test case(with assert statement) that counter value is 10 million.

Then introduce 10 helper methods that will increment a counter 1 million time, wait with join for the threads to complete and do the assert again.
With proper synchronization counter should be equal to 10 million still.
 */

/**
 * @author LeXa
 *
 */
public class Master {

	
	static int i = 0;

	public static void main(String[] args) {
		Dispatcher disp=new Dispatcher();
		Calculator calcs [] = new Calculator [10];
			
		
		
		
		for (int n=0;n<10;n++){
			
			System.out.println("initializing calculator number "+n);
			calcs [n] = new Calculator(10000000, n, disp);
		
		}
		
		for (int n=0;n<10;n++){
			System.out.println("starting calculator number "+n);
			calcs [n].start();
		
		}
		
		
	/*	try {
			Thread.sleep(1L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			for (int n=0;n<10;n++){			
				calcs [n].join();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int n=0;n<10;n++){
			System.out.println("calculator number "+n+" calculated to "+calcs [n].getCounter());
	
		}

	}

}
