package roomConstructor;

import roomConstructor.NormalRoomFactory;
import roomConstructor.Room;
import decorator.Door;
import decorator.NormalDoor;


public class TestRoomConfiguration extends RoomConfiguration {

/*	inherited from parent
 * private DefaultListModel<Room> listOfRooms;
 * private I_RoomFactory roomBuilder;
 * private ItemDecorator itemBuilder;
 * private Room startRoom;
 */

	

	public TestRoomConfiguration() {
		roomBuilder = new NormalRoomFactory();
	}

	public void layoutOne() {
		setStart(roomBuilder.buildRoom());

		//Instantiate doors and rooms
		Room[] rooms = new Room[5];
		for(int i = 0; i < rooms.length; i++) {
			rooms[i] = roomBuilder.buildRoom();
		}
		Door[] doors = new Door[10];
		for(int i = 0; i < doors.length; i++) {
			doors[i] = new NormalDoor();
			//Decorator? How does it work?
		}
		/*
		[ ]	[0]<[1]
			 |	 ^
		[4]-[s]-[2]
			 |
		[ ]	[3]	[ ]
		
		0 = north
		1 = east
		2 = west
		3 = south
		*/
		connectRooms(startRoom, rooms[0], doors[0], 0);
		connectRooms(rooms[0], startRoom, doors[1], 3);

		connectRooms(startRoom, rooms[2], doors[2], 1);
		connectRooms(rooms[2], startRoom, doors[3], 2);

		connectRooms(startRoom, rooms[3], doors[4], 3);
		connectRooms(rooms[3], startRoom, doors[5], 0);

		connectRooms(startRoom, rooms[4], doors[6], 2);
		connectRooms(rooms[4], startRoom, doors[7], 1);

		connectRooms(rooms[2], rooms[1], doors[8], 0);
		connectRooms(rooms[1], rooms[0], doors[9], 2);

	}

}