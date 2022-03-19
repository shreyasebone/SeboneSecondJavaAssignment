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

import com.sebone.java.basic.PrimeNumber;

/**
 * @author Shreya Paliwal
 *
 */
public class PrimeNumberTest {

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
	 * Test method for {@link com.sebone.java.basic.PrimeNumber#isPrime(int)}.
	 */
	@Test
	public void testIsPrime1() {
		PrimeNumber primeNumber=new PrimeNumber();
		assertEquals(false,primeNumber.isPrime(1));
		
		
	}

	@Test
	public void testIsPrime2() {
		PrimeNumber primeNumber=new PrimeNumber();
		assertEquals(true,primeNumber.isPrime(5));
		
		
	}
	@Test
	public void testIsPrime3() {
		PrimeNumber primeNumber=new PrimeNumber();
		assertEquals(true,primeNumber.isPrime(7));
		
		
	}
}
