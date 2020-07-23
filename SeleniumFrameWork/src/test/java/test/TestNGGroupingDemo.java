package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


@Test(groups = {"AllClassGroups"})
public class TestNGGroupingDemo {

	@Test(groups = {"sanity"})
	public void test1()
	{

		System.out.println(" This is test1");
	}
	@Test(groups = {"sanity","smoke"})
	public void test2()
	{

		System.out.println(" This is test2");
	}
	@Test(groups = {"smoke","regression"})
	public void test3()
	{

		System.out.println(" This is test3");
	}
	@Test
	public void test4()
	{

		System.out.println(" This is test4");
	}

}
