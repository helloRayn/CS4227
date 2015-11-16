package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import decorator.Box;
import decorator.Items;
import roomConstructor.NormalRoom;
import roomConstructor.Room;

public class RoomTest {

	@Test
	public void test() {
		Room R = new NormalRoom();
		Items I = new Box();
		R.addItem(I);
		String results = (R.getLayout()).get(0).getName();
		assertEquals("Box", results);
	}

}
