package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.Test1_GoogleSearch2TestNGDemo;

public class propertiesFile {
	
	static Properties prop = new Properties();
	static String ProjectPath= System.getProperty("user.dir");

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		getProperties();
		SetProperties();
		

	}
	public static void getProperties() throws FileNotFoundException
	{
		try
		{
			Properties prop = new Properties();
			
			
			//InputStream input = new FileInputStream(ProjectPath+"/src/test/java/config/config.properties");
			InputStream input = new FileInputStream("/Users/Raja/eclipse-workspace/SeleniumFrameWork/src/test"
					+ "/java/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			Test1_GoogleSearch2TestNGDemo.browserName= browser;
			
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	public static void SetProperties()
	{
		try
		{
			
			//OutputStream output = new FileOutputStream(ProjectPath+"/src/test/java/config/config.properties\"");
			
			OutputStream output = new FileOutputStream("/Users/Raja/eclipse-workspace/SeleniumFrameWork/src/test"
					+ "/java/config/config.properties");			
			prop.setProperty("browser", "chrome");
			//prop.setProperty("URL", "https://google.com");
			prop.setProperty("Result", "Pass");
			prop.store(output, null);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

}
