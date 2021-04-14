package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunctions jUnitString = new jUnitFunctions();
		String resultString = jUnitString.addStrings("Capstone", " Project");
		assertEquals("Capstone Project", resultString);
	}

}
