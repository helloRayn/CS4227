package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import decorator.Box;
import decorator.Shiny_Decorator;
import decorator.Items;

public class DecoratorTest {

	@Test
	public void test() {
		Items I = new Shiny_Decorator(new Box());
		assertEquals("This is a Box that is shiny", I.getDesc());
	}

}
