package main;


import javax.swing.DefaultListModel;

import UI.UserInterface;
import roomConstructor.NormalRoom;
import roomConstructor.Room;
import roomConstructor.RoomConfiguration;
import characterStructure.NpcConfiguration;
import characterStructure.ObserverOfCharacter;
import characterStructure.Player;
import characterStructure.GameCharacter;
import decorator.Door;


public class Game {

	//This class will be using Facade pattern.
	private static UserInterface ui;
	private RoomConfiguration layout;
	private static Player playerCharacter;
	private NpcConfiguration npcs;
	
	private boolean threadfaster = false;
	private boolean threadslower = false;
	
	public Game(UserInterface ui) {
		setUI(ui);
	}
	
	public void play() {
		//Generate all Characters and items
		initiateObjects();
		createNPCs();
		
		ui.display("You are in a room with 4 doors");
		changeRoom(layout.setUp());

	}
	
	//Instantiates the player and the starting room
	public void initiateObjects() {
		// This will be the main method
		Room startRoom = new NormalRoom();
		playerCharacter = new Player(startRoom);
	}
	
	//Instantiates all of the NPC GameCharacters
	public void createNPCs() {
		npcs.startUp();
		playerCharacter.setObservers(npcs.getNpcList());
	}

	public static void changeRoom(Door exit) {
		playerCharacter.setRoomIamIn(exit.getRoom());
		
		//checkTiming();		
		playerCharacter.threadedNotifyAll(); // THREADED

		//Reset ui accordingly
		Door[] doors = playerCharacter.getRoomIamIn().getExits();
		ui.showDoors(doors[0], doors[1], doors[2], doors[3]);
	}

	public static void display(String toDisplay) {
		ui.display(toDisplay);
	}

	
	public static void checkTiming() {
		//For checking timing
		long startTime = System.currentTimeMillis();
		//playerCharacter.sequentialNotifyAll(); // SEQUENTIAL
		playerCharacter.threadedNotifyAll(); // THREADED
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		display("Notification time taken: \t" + totalTime);
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
	//Setters and getters for NPCs
	public void setNPC(NpcConfiguration npcs) {
		this.npcs = npcs;
	}
	public NpcConfiguration getNPC() {
		return npcs;
	}

}
