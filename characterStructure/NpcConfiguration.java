package characterStructure;

import roomConstructor.I_RoomFactory;
import roomConstructor.NormalRoomFactory;
import roomConstructor.Room;

public abstract class NpcConfiguration {

	protected I_RoomFactory roomBuilder;
	protected Room npcRoom;

	public NpcConfiguration() {
		roomBuilder = new NormalRoomFactory();
		npcRoom = roomBuilder.buildRoom();
	}


	//For extension
	public abstract void startUp();

	public void setRoomBuilder(I_RoomFactory rBuilder) 	{ roomBuilder = rBuilder;	}
	public I_RoomFactory getRoomBuilder() 				{ return roomBuilder;	}

	//Setter and getter for Room that stores NPCs
	public void setNpcRoom(Room npcRoom) 	{ this.npcRoom = npcRoom;	}
	public Room getNpcRoom() 				{ return npcRoom;	}

}