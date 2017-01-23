package api.tests;

import java.util.Random;

import org.junit.Rule;
import org.junit.rules.TestName;

public abstract class ApiTest {
	private static Random random = new Random();
	
	@Rule
	public TestName testName = new TestName();
	
	/**
	 * Log
	 * 
	 * @param message
	 */
	protected void log(String message) {
		System.out.println(testName.getClass().getSimpleName() + "#" + testName.getMethodName() + " " + message);
	}
	
	/**
	 * Sleep for default period
	 */
	protected void sleep() {
		this.sleep(1000, 500);
	}
	
	/**
	 * Sleep
	 */
	protected void sleep(int base, int randomWidth) {
		int period = base + random.nextInt(randomWidth) - randomWidth / 2;
		
		if (period < 1) {
			period = 1;
		}
		
		log("sleep: " + period);
		
		try {
			Thread.sleep(period);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
