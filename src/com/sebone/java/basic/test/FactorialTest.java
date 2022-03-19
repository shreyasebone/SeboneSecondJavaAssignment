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

import com.sebone.java.basic.Factorial;

/**
 * @author Shreya Paliwal
 *
 */
public class FactorialTest {

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
	 * Test method for {@link com.sebone.java.basic.Factorial#returnFactorial(int)}.
	 */
	@Test
	public void testReturnFactorial() {
		Factorial factorial=new Factorial();
		assertEquals(120,factorial.returnFactorial(5));
	}

}
