package roomConstructor;
import java.util.ArrayList;

import characterStructure.Player;
import decorator.Items;

public interface Room {
	
	//returns the contents of the room
	public ArrayList<Player> getWhoIsInRoom();
	public ArrayList<Items> getLayout();
	
	//For adding/removing players in room
	public boolean enterRoom(Player player);
	public boolean exitRoom(Player player);
	
	//FOr adding and removing items in room
	public boolean addItem(Items item);
	public boolean removeItem(Items item);
}
