package com.sebone.java.sort.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.java.sort.SortUserDataImpl;
import com.sebone.java.sort.UserDataS;

public class SortUserDataImplByAgeTest {

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
	public void testSortUserDataByAge() {
		SortUserDataImpl sortUserDataImpl=new SortUserDataImpl();
		UserDataS userData1=new UserDataS();
		userData1.setRollNumber(101);
		userData1.setUserName("ram");
		userData1.setUserAge(21);
		
		UserDataS userData2=new UserDataS();
		userData2.setRollNumber(104);
		userData2.setUserName("shreya");
		userData2.setUserAge(11);
		
		UserDataS userData3=new UserDataS();
		userData3.setRollNumber(103);
		userData3.setUserName("bhanu");
		userData3.setUserAge(20);
		
		UserDataS userData4=new UserDataS();
		userData4.setRollNumber(102);
		userData4.setUserName("shraddha");
		userData4.setUserAge(19);
		
		ArrayList<UserDataS> userDataTest=new ArrayList<UserDataS>();
		userDataTest.add(userData1);
		userDataTest.add(userData2);
		userDataTest.add(userData3);
		userDataTest.add(userData4);
		
		ArrayList<UserDataS> userDataTest2=new ArrayList<UserDataS>();
		userDataTest2.add(userData2);
		userDataTest2.add(userData4);
		userDataTest2.add(userData3);
		userDataTest2.add(userData1);
		
		assertEquals(userDataTest2,sortUserDataImpl.sortUserDataByAge(userDataTest));
	}

}
