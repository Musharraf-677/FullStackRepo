package com.nit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nit.service.Arithematic;

public class AppTest 
{
	@Test
	public void testWithPositvies()
	{
		Arithematic ar = new Arithematic();
		int expected = 50;
		int actual = ar.sum(25,25);
		assertEquals(expected, actual);
		
	}

}
