package main;

import javax.swing.DefaultListModel;

import roomConstructor.I_RoomFactory;
import roomConstructor.Room;
import decorator.Door;
import decorator.ItemDecorator;
import decorator.NormalDoor;


public abstract class RoomConfiguration {

	protected DefaultListModel<Room> listOfRooms;
	protected I_RoomFactory roomBuilder;
	protected ItemDecorator itemBuilder;
	protected Room startRoom;
	protected Door entrance;

	public RoomConfiguration() {
		listOfRooms = new DefaultListModel<Room> ();
		entrance = new NormalDoor();
	}

	public void connectRooms(Room origination, Room destination, Door connector, int position) {
		//Checks if door already exists in the room
		if (!origination.setDoor(connector, position)) {
			connector.setRoom(destination);
		}
	}

	public DefaultListModel<Room> getRooms() {
		return listOfRooms;
	}

	public void addRoom(Room aRoom) {
		listOfRooms.addElement(aRoom);
	}
	
	public Door setUp() {
		return entrance;
	}
	

	//Setters and getters for all variables
	public void setRoomBuilder(I_RoomFactory rBuilder) 	{ roomBuilder = rBuilder;	}
	public I_RoomFactory getRoomBuilder() 				{ return roomBuilder;	}
	public void setItemBuilder(ItemDecorator iBuilder) 	{ itemBuilder = iBuilder;	}
	public ItemDecorator getItemBuilder() 				{ return itemBuilder;	}
	public Room getStart() 				{ return startRoom;	}
	public void setStart(Room newStart) { 
		//Sets the start room
		startRoom = newStart;
		//Used to move the player into the start room
		entrance.setRoom(newStart);
	}
}