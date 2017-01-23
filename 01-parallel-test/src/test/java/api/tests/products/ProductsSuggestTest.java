package api.tests.products;

import org.junit.Test;

import api.tests.ApiTest;
import api.utils.SessionId;

public class ProductsSuggestTest extends ApiTest {
	private void printSessionId() {
		log("session id: " + SessionId.abcUser);
	}
	
	@Test public void test1() {
		printSessionId();
		sleep();
	}
	
	@Test public void test2() {
		printSessionId();
		sleep();
	}
	
	@Test public void test3() {
		printSessionId();
		sleep();
	}
	
	@Test public void test4() {
		printSessionId();
		sleep();
	}
	
	@Test public void test5() {
		printSessionId();
		sleep();
	}
}
