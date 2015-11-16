package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import decorator.Items;
import decorator.Box;

public class ItemTest {

	@Test
	public void test() {
		Items I = new Box();
		assertEquals("Box", I.getName());
	}

}
