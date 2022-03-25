package com.sebone.java.sortlist;
import java.util.Collections;
import java.util.LinkedList;

public class SortUserDataImpl implements SortUserData {
	@Override
	public LinkedList<UserData> SortUserDataByAge(LinkedList<UserData> userDataList) {
		// TODO Auto-generated method stub
		Collections.sort(userDataList, new SortByAge());
		return userDataList;
	}
	@Override
	public LinkedList<UserData> SortUserDataByName(LinkedList<UserData> userDataList) {
		// TODO Auto-generated method stub
		Collections.sort(userDataList, new SortByName());
		return userDataList;
	}
	@Override
	public LinkedList<UserData> SortUserDataByRollNumber(LinkedList<UserData> userDataList) {
		// TODO Auto-generated method stub
		Collections.sort(userDataList, new SortByRollNumber());
		return userDataList;
	}
	
}


