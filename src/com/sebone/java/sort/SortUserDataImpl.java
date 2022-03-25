package com.sebone.java.sort;
import java.util.ArrayList;
import java.util.Collections;

public class SortUserDataImpl implements SortUserData {
	
	@Override
	public ArrayList<UserDataS> sortUserDataByAge(ArrayList<UserDataS> userDatalist) {
		// TODO Auto-generated method stub
		Collections.sort(userDatalist, new SortByAge());
		return userDatalist;	
	}
	@Override
	public ArrayList<UserDataS> sortUserDataByName(ArrayList<UserDataS> userDatalist) {
		// TODO Auto-generated method stub
		Collections.sort(userDatalist, new SortByName());
		return userDatalist;
	}
	@Override
	public ArrayList<UserDataS> sortUserDataByRollNumber(ArrayList<UserDataS> userDatalist) {
		// TODO Auto-generated method stub
		Collections.sort(userDatalist, new SortByRollNumber());
		return userDatalist;
	}
	
}
