package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestIfDivisionWorks {

	@Test
	public void divisionTest() {

		assertEquals(4, main.Main.divide(8, 2));
		assertEquals(0, main.Main.divide(0, 2));
		assertEquals(2, main.Main.divide(6, 3));
	}
}
