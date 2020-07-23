package test;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	
	@Test
	public void Test1()
	{
		System.out.println("This is test1");
		
	}
	@Test
	public void Test2()
	{
		System.out.println("This is test2");
		
	}
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void Test3()
	{
		System.out.println("This is test3");
		Assert.assertTrue(0>1);
		
	}

}
