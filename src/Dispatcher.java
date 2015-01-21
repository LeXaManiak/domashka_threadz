
public class Dispatcher {
String tabs;
	int threadnumber=0;
	
	
	public Dispatcher() {
		
	}
	
	public synchronized void monitor(int threadnumber, int counter)
	{
		
		
	if (this.threadnumber!=threadnumber) {
	
	this.threadnumber=threadnumber;
	
	StringBuilder sb=new StringBuilder();
	for (int n=0;n<threadnumber;n++){			
		sb.append("\t");
	}
	tabs=sb.toString();
	
	
	
	System.out.println(threadnumber+" "+System.currentTimeMillis()+tabs+"thread "+threadnumber+" counted to "+counter);
	}
	
	}
	
	
	

}
