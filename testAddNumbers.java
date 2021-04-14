package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() 
	{
		jUnitFunctions jUnitFunctions = new jUnitFunctions();
		int result = jUnitFunctions.addNumbers(100, 235);
		assertEquals(335, result);
	}

}
