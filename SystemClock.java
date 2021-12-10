//package clockOS;

public class SystemClock {
	
	private long start_time;
	

	
	public void start() {
		
		start_time = System.currentTimeMillis();	
	}
	
	public long endAndCalc() {	
		
		return System.currentTimeMillis() - start_time;
	}
	

}
