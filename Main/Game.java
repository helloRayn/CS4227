package main;


import UI.UserInterface;
import roomConstructor.NormalRoom;
import roomConstructor.Room;
import characterStructure.Player;
import characterStructure.GameCharacter;
import decorator.Door;


public class Game {

	//This class will be using Facade pattern.
	private static UserInterface ui;
	private RoomConfiguration layout;
	private static Room currentRoom;
	private GameCharacter playerCharacter;
	
	public Game(UserInterface ui) {
		setUI(ui);
	}
	
	public void play() {
		//Generate all Characters and items
		initiateObjects();
		
		ui.display("You are in a room with 4 doors");
		changeRoom(layout.setUp());

	}
	
	public void initiateObjects() {
		// This will be the main method
		Room startRoom = new NormalRoom();
		playerCharacter = new Player(startRoom);
	}

	public static void changeRoom(Door exit) {
		currentRoom = exit.getRoom();

		//Reset ui accordingly
		Door[] doors = currentRoom.getExits();
		ui.showDoors(doors[0], doors[1], doors[2], doors[3]);
	}

	public static void display(String toDisplay) {
		ui.display(toDisplay);
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
