package com.sebone.java.sortlist;

import java.util.Comparator;

public class SortByName implements Comparator<UserData>{
	@Override
	public int compare(UserData userData1, UserData userData2) {
		// TODO Auto-generated method stub
		return userData1.userName.compareTo(userData2.userName);
	}

	

}
