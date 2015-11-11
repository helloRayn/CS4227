package main;


import UI.UserInterface;
import roomConstructor.NormalRoom;
import roomConstructor.Room;
import characterStructure.Player;
import characterStructure.GameCharacter;


public class Game {

	//This class will be using Facade pattern.
	private UserInterface ui;
	
	public Game(UserInterface ui) {
		setUI(ui);
	}
	
	public void play() {
		//Generate all Characters and items
		initiateObjects();
		
		ui.display("Test");

	}
	
	public void initiateObjects() {
		// This will be the main method
		Room startRoom = new NormalRoom();
		GameCharacter playerCharacter = new Player(startRoom);
	}
	
	public void setUI(UserInterface ui) {
		this.ui = ui;
	}
	public UserInterface getUI() {
		return ui;
	}

}
