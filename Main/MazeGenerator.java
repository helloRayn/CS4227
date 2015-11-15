package main;

import java.io.FileNotFoundException;

import characterStructure.NpcConfiguration;
import characterStructure.TestNpcConfiguration;
import roomConstructor.TestRoomConfiguration;
import UI.InputLogger;
import UI.UIFactory;
import UI.UserInterface;

public class MazeGenerator {

	//main class to run program
	public static void main(String[] args) throws FileNotFoundException {

		//Factory method to make UI
		UIFactory factory = new UIFactory();
		UserInterface ui = factory.makeGraphicUserInterface();
		
		InputLogger LOGGER = new InputLogger();

		TestRoomConfiguration roomLayout = new TestRoomConfiguration();
		roomLayout.layoutOne();
		
		NpcConfiguration npcLayout = new TestNpcConfiguration();

		Game game = new Game(ui);
		
		game.setLayout(roomLayout);
		game.setNPC(npcLayout);

		game.play();
	}
}