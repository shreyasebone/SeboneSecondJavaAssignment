package com.sebone.java.basic.test;

import static org.junit.Assert.*;
import com.sebone.java.basic.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReverseStringTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReturnString() {
		ReverseString reverseString=new ReverseString();
		assertEquals("ayerhs",reverseString.returnString("shreya"));
	}

}
