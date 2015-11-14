package roomConstructor;
import java.util.ArrayList;

import characterStructure.Player;
import decorator.Items;

public abstract class Room {
	/*
	 * This was originally an interface
	 * I switched it to an abstract class to reduce code duplication
	 * I don't think it makes too much of a difference but I could be wrong
	 */
	
	private ArrayList<Player> whoIsInRoom;
	private ArrayList<Items> whatIsInRoom;
	private Door[] doorsFromRoom;
	
	
	//Returns list of people in room
	public ArrayList<Player> getWhoIsInRoom() {
		return whoIsInRoom;
	}//Returns list of items (eg. Doors) in room
	public ArrayList<Items> getLayout() {
		return whatIsInRoom;
	}
	public Door[] getExits() {
		return doorsFromRoom;
	}
	
	//For adding/removing players in room
	public boolean enterRoom(Player player) {
		if (whoIsInRoom.contains(player))
			return false;
		whoIsInRoom.add(player);
		return true;
	}
	public boolean exitRoom(Player player) {
		if (!whoIsInRoom.contains(player))
			return false;
		whoIsInRoom.remove(player);
		return true;
	}
	
	//For adding and removing items in room
	public boolean addItem(Items item) {
		if (whatIsInRoom.contains(item))
			return false;
		whatIsInRoom.add(item);
		return true;
	}
	public boolean removeItem(Items item) {
		if (!whatIsInRoom.contains(item))
			return false;
		whatIsInRoom.remove(item);
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
		if (index < 0 || index > 3)
			return false;
		doorsFromRoom[index] = null;
		return true;
	}
}
