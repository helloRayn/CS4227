package roomConstructor;

import javax.swing.DefaultListModel;

import characterStructure.Player;
import decorator.Door;
import decorator.Items;

public abstract class Room {
	/*
	 * This was originally an interface
	 * I switched it to an abstract class to reduce code duplication
	 * I don't think it makes too much of a difference but I could be wrong
	 */
	
	private DefaultListModel<Player> whoIsInRoom;
	private DefaultListModel<Items> whatIsInRoom;
	private Door[] doorsFromRoom;
	
	
	//Constructor
	public Room() {
		whoIsInRoom = new DefaultListModel<Player>();
		whatIsInRoom = new DefaultListModel<Items>();
		doorsFromRoom = new Door[4];
	}
	
	
	//Returns list of people in room
	public DefaultListModel<Player> getWhoIsInRoom() {
		return whoIsInRoom;
	}//Returns list of items (eg. Doors) in room
	public DefaultListModel<Items> getLayout() {
		return whatIsInRoom;
	}
	public Door[] getExits() {
		return doorsFromRoom;
	}
	
	//For adding/removing players in room
	public boolean enterRoom(Player player) {
		if (whoIsInRoom.contains(player))
			return false;
		whoIsInRoom.addElement(player);
		return true;
	}
	public boolean exitRoom(Player player) {
		if (!whoIsInRoom.contains(player))
			return false;
		whoIsInRoom.removeElement(player);
		return true;
	}
	
	//For adding and removing items in room
	public boolean addItem(Items item) {
		if (whatIsInRoom.contains(item))
			return false;
		whatIsInRoom.addElement(item);
		return true;
	}
	public boolean removeItem(Items item) {
		if (!whatIsInRoom.contains(item))
			return false;
		whatIsInRoom.removeElement(item);
		return true;
	}

	//For adding and removing exits from
	public boolean setDoor(Door door, int index) {
		if (index < 0 || index > 3)
			return false;
		doorsFromRoom[index] = door;
		return true;
	}
	public boolean removeDoor(Door door) {
		for(int i = 0; i < 4; i++) {
			if (doorsFromRoom[i] == door) {
				doorsFromRoom[i] = null;
				return true;
			}
		}
		return false;
	}
}
