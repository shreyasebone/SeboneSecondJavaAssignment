package com.sebone.java.sortlist;

import java.util.Comparator;

public class SortByAge implements Comparator<UserData>{

	@Override
	public int compare(UserData userData1, UserData userData2) {
		// TODO Auto-generated method stub
		return userData1.userAge-userData2.userAge;
	}
	

}
