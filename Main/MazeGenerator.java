package main;

import java.io.FileNotFoundException;

import UI.InputLogger;
import UI.UIFactory;
import UI.UserInterface;

public class MazeGenerator {

	//main class to run program
	public static void main(String[] args) throws FileNotFoundException {

		//Factory method to make UI
		UIFactory factory = new UIFactory();
		UserInterface ui = factory.makeTestInterface("test.txt");
		
		InputLogger LOGGER = new InputLogger();

		TestConfiguration testLayout = new TestConfiguration();
		testLayout.layoutOne();

		Game game = new Game(ui);
		game.setLayout(testLayout);

		game.play();
	}
}