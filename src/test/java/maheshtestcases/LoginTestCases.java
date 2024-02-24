package maheshtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCases {

	@Test(groups = {"smoke"}, invocationCount = 3)
	public void testCase_001() {
		
		System.out.println("This is testcase 001");
		Assert.assertTrue(true, "TestCase_001 failed..!");
	}
	
	@Test(groups = {"regression"})
	public void testCase_002() {
		
		System.out.println("This is testcase 002");
		Assert.assertTrue(false, "TestCase_002 failed..!");
	}
	
	@Test(groups = {"regression"})
	public void testCase_003() {
		
		System.out.println("This is testcase 003");
		Assert.assertTrue(true, "TestCase_003 failed..!");
	}
	
}
