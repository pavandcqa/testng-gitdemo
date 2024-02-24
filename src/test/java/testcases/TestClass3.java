package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass3 {

	@Test(groups = {"smoke"})
	public void testCase_007() {
		
		System.out.println("This is testcase 007");
		Assert.assertTrue(true, "TestCase_007 failed..!");
	}
	
	@Test(groups = {"regression"})
	public void testCase_008() {
		
		System.out.println("This is testcase 008");
		Assert.assertTrue(true, "TestCase_008 failed..!");
	}
	
	@Test(groups = {"regression"})
	public void testCase_009() {
		
		System.out.println("This is testcase 009");
		Assert.assertTrue(true, "TestCase_009 failed..!");
	}
	
}
