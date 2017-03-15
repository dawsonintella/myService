package MyServiceTest.MyServiceTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyServiceTest {
	
	MyService myService;
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void test() {
		myService = new MyService();
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
