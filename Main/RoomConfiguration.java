package main;


public abstract class RoomConfiguration {

	private DefaultListModel<Room> listOfRooms;

	public RoomConfiguration() {
		listOfRooms = new DefaultListModel<Room> ();
	}

	public void connectRooms(Room origination, Room destination, Door connector) {
		//Checks if door already exists in the room
		if (!origination.addDoor(connector) {
			connector.setRoom(destination);
		}
	}

	public DefaultListModel<Room> getRooms() {
		return listOfRooms;
	}

	public void addRoom(Room aRoom) {
		listOfRooms.addElement(aRoom);
	}
}