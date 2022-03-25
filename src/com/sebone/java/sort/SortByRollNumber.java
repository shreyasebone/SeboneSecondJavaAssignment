package com.sebone.java.sort;
import java.util.Comparator;

public class SortByRollNumber implements Comparator<UserDataS>{
	public int compare(UserDataS userData1, UserDataS userData2) {
		// TODO Auto-generated method stub
		return userData1.rollNumber-userData2.rollNumber;
	}


}
