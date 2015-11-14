package main;


public class TestConfiguration extends RoomConfiguration {

//private DefaultListModel<Room> listOfRooms; (inherited)

	private I_RoomFactory roomBuilder;
	private ItemDecorator itemBuilder;
	private Room startRoom;

	public TestConfiguration() {
		roomBuilder = normalRoomFactory();
	}

	public void layoutOne() {
		setStart(roomBuilder.buildRoom());

		//Instantiate doors and rooms
		Room[] rooms = new Rooms[5];
		for(int i = 0; i < rooms.length; i++) {
			rooms[i] = roomBuilder.buildRoom();
		}
		Door[] doors = new Doors[10];
		for(int i = 0; i < doors.length; i++) {
			doors[i] = new Door();
			//Decorator? How does it work?
		}
		/*
		[ ]	[0]<[1]
			 |	 ^
		[4]-[s]-[2]
			 |
		[ ]	[3]	[ ]
		*/
		connectRooms(startRoom, rooms[0], doors[0]);
		connectRooms(rooms[0], startRoom, doors[1]);

		connectRooms(startRoom, rooms[2], doors[2]);
		connectRooms(rooms[2], startRoom, doors[3]);

		connectRooms(startRoom, rooms[3], doors[4]);
		connectRooms(rooms[3], startRoom, doors[5]);

		connectRooms(startRoom, rooms[4], doors[6]);
		connectRooms(rooms[4], startRoom, doors[7]);

		connectRooms(rooms[2], rooms[1], doors[8]);
		connectRooms(rooms[1], rooms[0], doors[9]);

	}

	//Setters and getters for all variables
	public void setRoomBuilder(I_RoomFactory rBuilder) 	{ roomBuilder = rBuilder;	}
	public I_RoomFactory getRoomBuilder() 				{ return roomBuilder	}
	public void setItemBuilder(ItemDecorator iBuilder) 	{ itemBuilder = iBuilder:	}
	public ItemDecorator getItemBuilder() 				{ return itemBuilder;	}
	public void setStart(Room newStart) { startRoom = newStart;	}
	public Room getStart() 				{ return startRoom;	}
}