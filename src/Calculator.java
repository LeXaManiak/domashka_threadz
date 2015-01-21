public class Calculator extends Thread {
	private int counter = 0;
	private int maxnumber;
	private int threadnumber;
       Dispatcher disp;
    
	public Calculator(int maxnumber,int threadnumber, Dispatcher disp) {

		this.maxnumber = maxnumber;
		this.threadnumber = threadnumber;
		this.disp=disp;
		
		
	}

	public void run() {

		do {
			counter++;
			
			disp.monitor (threadnumber,counter);
			
			
			
			
		} while (counter < maxnumber);

	}

	int getCounter() {
		return counter;
	}

	
	
	
}
