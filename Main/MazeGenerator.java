package main;

import UI.InputLogger;
import UI.UIFactory;
import UI.UserInterface;

public class MazeGenerator {

	//main class to run program
	public static void main(String[] args) {

		//Factory method to make UI
		UIFactory factory = new UIFactory();
		UserInterface ui = factory.makeGraphicUserInterface();
		
		InputLogger LOGGER = new InputLogger();

		TestConfiguration testLayout = new TestConfiguration();
		testLayout.layoutOne();

		Game game = new Game(ui);
		game.setLayout(testLayout);

		game.play();
	}
}