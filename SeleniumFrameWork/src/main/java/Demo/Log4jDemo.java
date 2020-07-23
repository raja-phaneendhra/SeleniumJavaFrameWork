package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import jdk.internal.org.jline.utils.Log;

public class Log4jDemo {
	
	private static Logger logger =  (Logger) LogManager.getLogger(Log4jDemo.class);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n Hello Owrld.....\n");
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");
		System.out.println("Completed");

	}

}
