package helloWorld;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTest1 {

	@BeforeTest
	public void test0()
	{
		System.out.println("Hello Test 0");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Hello Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Hello Test 2");
	}
	
	@AfterTest
	public void test3()
	{
		System.out.println("Hello Test 3");
	}
	
}
