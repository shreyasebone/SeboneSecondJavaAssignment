package com.sebone.java.sort;

import java.util.Comparator;

public class SortByAge implements Comparator<UserDataS> {

	@Override
	public int compare(UserDataS userData1, UserDataS userData2) {
		// TODO Auto-generated method stub
		return userData1.userAge-userData2.userAge;
	}

}
