package main;


import UI.UserInterface;
import roomConstructor.NormalRoom;
import roomConstructor.Room;
import characterStructure.Player;
import characterStructure.GameCharacter;


public class Game {

	//This class will be using Facade pattern.
	private UserInterface ui;
	private RoomConfiguration layout;
	private Room currentRoom;
	
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

	public void changeRoom(Door exit) {
		currentRoom = exit.getRoom();

		//Reset ui accordingly
		Door[] doors = currentRoom.getExits();
		ui.showDoors(doors[0], doors[1], doors[2], doors[3]);
	}








	
	//Setters and getters for changing UI
	public void setUI(UserInterface ui) {
		this.ui = ui;
	}
	public UserInterface getUI() {
		return ui;
	}
	//Setters and getters for changing layout
	public void setLayout(RoomConfiguration layout) {
		this.layout = layout;
	}
	public RoomConfiguration getLayout() {
		return layout;
	}

}
