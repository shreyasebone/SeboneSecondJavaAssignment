package com.sebone.java.sortlist;

import java.util.Comparator;

public class SortByRollNumber implements Comparator<UserData>
{
	public int compare(UserData userData1, UserData userData2) {
		// TODO Auto-generated method stub
		return userData1.rollNumber-userData2.rollNumber;
	}
}
