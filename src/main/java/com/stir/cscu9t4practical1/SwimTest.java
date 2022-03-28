package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwimTest {
	
	public SwimTest()
	{
		
	}
	
	@BeforeAll
	public static void setUpClass()
	{
		
	}

	@AfterAll
	public static void tearDownClass()
	{
		
	}
	
	@BeforeEach
	public void setUp()
	{
		
	}
	
	@AfterEach
	public void teardown()
	{
		
	}
	
	@Test
	public void testGetName()
	{
		System.out.println("getName");
		Entry instance = new Swim("Bob", 1, 2, 2003, 0, 4, 10, 20, "Swim", true);
		String expResult = "Bob";
		String result = instance.getName();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testGetDay()
	{
		System.out.println("getDay");
		Entry instance = new Swim("Bob", 1, 2, 2003, 0, 4, 10, 20, "Swim", true);
		int expResult = 1;
		int result = instance.getDay();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testGetMonth()
	{
		System.out.println("getMonth");
		Entry instance = new Swim("Bob", 1, 2, 2003, 0, 4, 10, 20, "Swim", true);
		int expResult = 2;
		int result = instance.getMonth();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testGetYear()
	{
		System.out.println("getYear");
		Entry instance = new Swim("Bob", 1, 2, 2003, 0, 4, 10, 20, "Swim", true);
		int expResult = 2003;
		int result = instance.getYear();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testGetHour()
	{
		System.out.println("getHour");
		Entry instance = new Swim("Bob", 1, 2, 2003, 0, 4, 10, 20, "Swim", true);
		int expResult = 0;
		int result = instance.getHour();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testGetMin()
	{
		System.out.println("getMin");
		Entry instance = new Swim("Bob", 1, 2, 2003, 0, 4, 10, 20, "Swim", true);
		int expResult = 4;
		int result = instance.getMin();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testGetSec()
	{
		System.out.println("getSec");
		Entry instance = new Swim("Bob", 1, 2, 2003, 0, 4, 10, 20, "Swim", true);
		int expResult = 10;
		int result = instance.getSec();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testGetDistance()
	{
		System.out.println("getDistance");
		Entry instance = new Swim("Bob", 1, 2, 2003, 0, 4, 10, 20, "Swim", true);
		float expResult = 20;
		float result = instance.getDistance();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testGetActivity()
	{
		System.out.println("getActivity");
		Entry instance = new Swim("Bob", 1, 2, 2003, 0, 4, 10, 20, "Swim", true);
		String expResult = "Swim";
		String result = ((Swim) instance).getActivity();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testisOutdoors()
	{
		System.out.println("isOutdoors");
		Entry instance = new Swim("Bob", 1, 2, 2003, 0, 4, 10, 20, "Cycle", true);
		boolean expResult = true;
		boolean result = ((Swim) instance).isOutdoors();
		assertEquals(expResult, result);
		
	}
}
