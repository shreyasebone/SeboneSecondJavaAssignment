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

import com.sebone.java.basic.CountNoOfDigit;

/**
 * @author Shreya Paliwal
 *
 */
public class CountNoOfDigitTest {

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
	 * Test method for {@link com.sebone.java.basic.CountNoOfDigit#returnCount(int)}.
	 */
	@Test
	public void testReturnCount() {
		CountNoOfDigit countNoOfDigit=new CountNoOfDigit();
		assertEquals(3,countNoOfDigit.returnCount(123));
	}

}
