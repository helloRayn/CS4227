package roomConstructor;

public class RoomFactory {

	//Declare room to be returned. This will be overwritten each time.
	private Room theRoom;
	
	//returns NormalRoom, but classified as Room
	public Room buildNormalRoom() {
		theRoom = new NormalRoom();
		return theRoom;
	}
	
	//returns MagicalRoom, but classified as Room
	public Room buildMagicalRoom() {
		theRoom = new NormalRoom();
		return theRoom;
	}
}
