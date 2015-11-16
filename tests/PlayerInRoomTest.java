package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import characterStructure.GameCharacter;
import characterStructure.Player;
import roomConstructor.NormalRoom;
import roomConstructor.Room;

public class PlayerInRoomTest {

	@Test
	public void test() {
		Room R = new NormalRoom();
		GameCharacter P = new Player(R);
		R.enterRoom(P);
		GameCharacter results = (R.getWhoIsInRoom()).get(0);
		assertEquals(P, results);
	}

}
