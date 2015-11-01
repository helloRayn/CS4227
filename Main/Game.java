package main;

import UI.CLInterface;
import UI.UserInterface;
import roomConstructor.NormalRoom;
import roomConstructor.Room;
import characterStructure.Player;
import characterStructure.Character;


public class Game {

	//This class will be using Facade pattern.
	//Or alternately in can simply instantiate an instance of the class using facade
	
	public static void main(String[] args) {
		// This will be the main method
		Room startRoom = new NormalRoom();
		Character playerCharacter = new Player(startRoom);
		
		//UI will be started here when Emmylou completes it.
		//For now we will use a CLI
		UserInterface CLI = new CLInterface();
	}

}
