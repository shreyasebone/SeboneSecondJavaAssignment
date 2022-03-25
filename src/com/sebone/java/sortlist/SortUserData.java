package com.sebone.java.sortlist;

import java.util.LinkedList;

public interface SortUserData {
	public LinkedList<UserData> SortUserDataByAge(LinkedList<UserData> userDataList);
	public LinkedList<UserData> SortUserDataByName(LinkedList<UserData> userDataList);
	public LinkedList<UserData> SortUserDataByRollNumber(LinkedList<UserData> userDataList);
	
}
