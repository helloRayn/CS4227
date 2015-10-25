package roomConstructor;

public class NormalRoomFactory implements I_RoomFactory{

	//Declare room to be returned. This will be overwritten each time.
	private Room theRoom;
	
	//returns NormalRoom, but classified as Room
	public Room buildRoom() {
		theRoom = new NormalRoom();
		return theRoom;
	}
}
