package main;

import UI.UIFactory;
import UI.UserInterface;

public class MazeGenerator {

	//main class to run program
	public static void main(String[] args) {

		//Factory method to make UI
		UIFactory factory = new UIFactory();
		UserInterface ui = factory.makeGraphicUserInterface();

		Game game = new Game(ui);

		game.play();
	}
}