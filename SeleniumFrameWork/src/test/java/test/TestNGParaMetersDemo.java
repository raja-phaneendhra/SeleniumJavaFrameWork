package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParaMetersDemo {
	
	@Test
	@Parameters("MyName")
	public void Test1(String name)
	{
		System.out.println("Name is :"+ name);
	}

}
