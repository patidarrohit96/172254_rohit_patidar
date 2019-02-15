package test;

import service.DateDifferenceProvider;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import service.support.MyDate;


public class TestUnit {
	
	DateDifferenceProvider d;
	
	@Before
	public void init()
	{
		d= new DateDifferenceProvider();
		
	}
	@Test
	public void test1()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 04, 2011), new MyDate(06, 04, 2011));
		assertEquals(result,0);
	}
	@Test
	public void test2()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 04, 2011), new MyDate(18, 04, 2011));
		assertEquals(result,12);
	}
	@Test
	public void test3()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 04, 2011), new MyDate(18, 05, 2011));
		assertEquals(result,42);
	}
	@Test
	public void test4()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 04, 2011), new MyDate(18, 06, 2011));
		assertEquals(result,73);
	}
	@Test
	public void test5()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 04, 2011), new MyDate(18, 12, 2011));
		assertEquals(result,256);
	}
	@Test
	public void test6()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 04, 2011), new MyDate(18, 12, 2012));
		assertEquals(result,622);
	}
	@Test
	public void test7()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 04, 2011), new MyDate(18, 12, 2013));
		assertEquals(result,987);
	}
	@Test
	public void test8()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 04, 2011), new MyDate(18, 12, 2113));
		assertEquals(result,37511);
	}
	@Test
	public void test9()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 04, 2011), new MyDate(18, 12, 2413));
		assertEquals(result,147084);
	}
	@Test
	public void test10()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 04, 2011), new MyDate(18, 12, 2813));
		assertEquals(result,293181);
	}
	@Test
	public void test11()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 01, 2011), new MyDate(06, 03, 2011));
		assertEquals(result,59);
	}
	@Test
	public void test12()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 01, 2012), new MyDate(06, 03, 2012));
		assertEquals(result,60);
	}
	@Test
	public void test13()
	{
		long result = DateDifferenceProvider.getDateDifference( new MyDate(06, 02, 2012), new MyDate(06, 03, 2012));
		assertEquals(result,29);
	}
}

	
	