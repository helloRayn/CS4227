package UI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UIFactory {
	//All methods will return type UserInterface

	//Factory method for Command Line interface
	public UserInterface makeCLInterface() {
		return new CLInterface();
	}

	//For testing with a text file
	public UserInterface makeTestInterface(String textFile) throws FileNotFoundException {
		File theFile = new File(textFile);
		//Just sends to overloaded method
		return makeTestInterface(theFile);
	}
	public UserInterface makeTestInterface(File theFile) throws FileNotFoundException {
		if(theFile.exists()) {
			return new CLInterface(new Scanner(theFile));
		}
		else 
			return null;
	}

	//For using a GUI
	public UserInterface makeGraphicUserInterface() {
		try {
			GraphicUserInterface frame = new GraphicUserInterface();
			frame.setVisible(true);
			return frame;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}