package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {

	@Test(groups = {"smoke"})
	public void testCase_004() {
		
		System.out.println("This is testcase 004");
		Assert.assertTrue(true, "TestCase_004 failed..!");
	}
	
	@Test(groups = {"regression"})
	public void testCase_005() {
		
		System.out.println("This is testcase 005");
		Assert.assertTrue(true, "TestCase_005 failed..!");
	}
	
	@Test(groups = {"smoke"})
	public void testCase_006() {
		
		System.out.println("This is testcase 006");
		Assert.assertTrue(true, "TestCase_006 failed..!");
	}
	
	
}
