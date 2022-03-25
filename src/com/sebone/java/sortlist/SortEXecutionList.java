package com.sebone.java.sortlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class SortEXecutionList {
	public UserData getUserData(int rollNumber,String userName,int userAge){
		UserData userData=new UserData();
		userData.setRollNumber(rollNumber);
		userData.setUserAge(userAge);
		userData.setUserName(userName);
		return userData;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortEXecutionList  sortEXecutionList =new  SortEXecutionList();
		LinkedList<UserData> LinkedList =new LinkedList<UserData>();
		LinkedList.add(sortEXecutionList.getUserData(101, "ram", 21));
		LinkedList.add(sortEXecutionList.getUserData(105, "heena", 23));
		LinkedList.add(sortEXecutionList.getUserData(104, "deepu", 25));
		LinkedList.add(sortEXecutionList.getUserData(103, "vk", 22));
		LinkedList.add(sortEXecutionList.getUserData(102, "shyam", 24));
		SortUserDataImpl sortUserDataImpl=new SortUserDataImpl();
		LinkedList<UserData> sortLinkedList=new LinkedList<UserData>();
		sortLinkedList=sortUserDataImpl.SortUserDataByAge(LinkedList);
		for(int i=0;i<sortLinkedList.size();i++) {
		System.out.println(" "+sortLinkedList.get(i).getRollNumber()+" "+sortLinkedList.get(i).getUserAge()+" "+sortLinkedList.get(i).getUserName());	
		}
		sortLinkedList=sortUserDataImpl.SortUserDataByName(LinkedList);
		for(int i=0;i<sortLinkedList.size();i++) {
		System.out.println(" "+sortLinkedList.get(i).getRollNumber()+" "+sortLinkedList.get(i).getUserAge()+" "+sortLinkedList.get(i).getUserName());	
		}
		sortLinkedList=sortUserDataImpl.SortUserDataByRollNumber(LinkedList);
		for(int i=0;i<sortLinkedList.size();i++) {
		System.out.println(" "+sortLinkedList.get(i).getRollNumber()+" "+sortLinkedList.get(i).getUserAge()+" "+sortLinkedList.get(i).getUserName());	
		}
	}

}
