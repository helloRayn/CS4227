package roomConstructor;

public class MagicalRoomFactory implements I_RoomFactory{

	//Declare room to be returned. This will be overwritten each time.
	private Room theRoom;
	
	//returns MagicalRoom, but classified as Room
	public Room buildRoom() {
		theRoom = new MagicalRoom();
		return theRoom;
	}
}
