package clockOS;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		SystemClock clock = new SystemClock();
		Thread thread = new Thread();
		
		
		
		clock.start();
		
		TimeUnit.SECONDS.sleep(10);
		
		long result = clock.endAndCalc();
		
		System.out.println(result);
		
				
		

	}

}
