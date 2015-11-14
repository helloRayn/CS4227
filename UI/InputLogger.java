

public class InputLogger {

	//Necessary for interceptor pattern

	private PrintWriter output;

	public InputLogger() {
		initiate("log.txt");
	}
	public InputLogger(String anotherFile) {
		initiate(anotherFile);
	}

	public void initiate(String filename) {

		File logFile = new File(filename);
		if(!logFile.exists()) {
    		logFile.createNewFile();
    	}
    	output = new Printwriter(logFile);
	}

	public void log(String action) {
		try {
			output.println(action);
		} catch (Exception e) {
			System.err.println("Error printing to log file. Please verify that file exists or can be created.");
		}
	}

	public void close() {
		output.close;
	}
}