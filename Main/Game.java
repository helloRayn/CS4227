package main;

import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import UI.MainWindow;
import UI.CLInterface;
import UI.UserInterface;
import roomConstructor.NormalRoom;
import roomConstructor.Room;
import characterStructure.Player;
import characterStructure.GameCharacter;


public class Game {

	//This class will be using Facade pattern.
	
	public void play() {
		//Generate the UI
		initiateUI();
		//Generate all Characters and items
		initiateObjects();

	}
	
	//For testing and alternate UIs
	public void play(String[] args) {
		if(args.length == 0)
			play();
		else if(args.length >= 1) {
			Scanner input;
			if(args[0].equalsIgnoreCase("test")) {
				try {
					File testFile = new File(args[2]);
					if (testFile.exists()) {
						input = new Scanner(testFile);
					}
					else
						throw new IOException();
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Error reading file. Initiating standard boot-up.");
				}
			}
			else if(args[0].equalsIgnoreCase("ui")) {
				input = new Scanner(System.in);
			}
		}
	}
	
	public void initiateObjects() {
		// This will be the main method
		Room startRoom = new NormalRoom();
		GameCharacter playerCharacter = new Player(startRoom);
		
		//UI will be started here when Emmylou completes it.
		//For now we will use a CLI
		UserInterface CLI = new CLInterface();
	}
	
	//Launch the UI
	//Done by Emmylou
	public void initiateUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
