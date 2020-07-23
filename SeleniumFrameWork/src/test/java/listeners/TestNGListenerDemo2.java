package listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)

public class TestNGListenerDemo2 {

@Test	
public void test4()
{
	System.out.println("I am inside test4");
}
	@Test
public void test5()
{
	System.out.println("I am inside test5");
	//AssertJUnit.assertTrue(false);
}
	@Test
public void test6()
{
	System.out.println("I am inside test6");
}
	
	
}
