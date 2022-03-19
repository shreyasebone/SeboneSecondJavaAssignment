/**
 * 
 */
package com.sebone.java.basic.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.java.basic.SumOfNumber;

/**
 * @author Shreya Paliwal
 *
 */
public class SumOfNumberTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sebone.java.basic.SumOfNumber#returnSum(int)}.
	 */
	@Test
	public void testReturnSum() {
		SumOfNumber sumOfNumber=new SumOfNumber();
		assertEquals(6,sumOfNumber.returnSum(3));
	}

}
