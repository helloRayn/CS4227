package UI;

import java.io.File;
import java.io.PrintWriter;



public class InputLogger {

	//Necessary for interceptor pattern

	private static PrintWriter output;
	

	public InputLogger() {
		initiate("log.txt");
	}
	public InputLogger(String anotherFile) {
		initiate(anotherFile);
	}

	public void initiate(String filename) {
		try {
			//Checks for file and creates if it doesn't exist.
			File logFile = new File(filename);
			if(!logFile.exists()) {
	    		if(!logFile.createNewFile())
	    			System.err.println("Error creating log file. Please verify that files can be created.");
	    	}
			
			//Starts output
	    	output = new PrintWriter(logFile);
	    	log("===Start of input===");
		} 
		catch (Exception e) {
			System.err.println("Error accessing log file. Please verify that files can be created.");
		}
	}

	public static void log(String action) {
		
		try {
			output.println(action);
		} catch (Exception e) {
			e.printStackTrace(System.out);
			System.err.println("Error printing to log file. Please verify that file exists or can be created.");
		}
	}

	public static void close() {
		output.close();
	}
}