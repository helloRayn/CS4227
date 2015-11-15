package UI;

import java.io.File;
import java.io.IOException;
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
			File logFile = new File(filename);
			if(!logFile.exists()) {
	    		logFile.createNewFile();
	    	}
	    	output = new PrintWriter(logFile);
		} catch (Exception e) {
			System.err.println("Error printing to log file. Please verify that files can be created.");
		}
	}

	public static void log(String action) {
		try {
			output.println(action);
		} catch (Exception e) {
			System.err.println("Error printing to log file. Please verify that file exists or can be created.");
		}
	}

	public void close() {
		output.close();
	}
}