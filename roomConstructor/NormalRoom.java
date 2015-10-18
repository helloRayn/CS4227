package roomConstructor;

import java.util.ArrayList;

import characterStructure.Player;
import decorator.Items;

public class NormalRoom implements Room {
	
	private ArrayList<Player> whoIsInRoom;
	private ArrayList<Items> whatIsInRoom;
	
	
	//Returns list of people in room
	public ArrayList<Player> getWhoIsInRoom() {
		return whoIsInRoom;
	}//Returns list of items (eg. Doors) in room
	public ArrayList<Items> getLayout() {
		return whatIsInRoom;
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
}
