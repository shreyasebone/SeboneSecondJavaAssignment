package com.sebone.java.sort;
import java.util.ArrayList;


public class SortingExecution {
	public UserDataS getUserData(int rollNumber,String name,int age) {
		UserDataS userData=new UserDataS();
        userData.setRollNumber(rollNumber);
        userData.setUserName(name);
        userData.setUserAge(age);
        return userData;     
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// creating object of SortingExecution
		SortingExecution sortingExecution= new SortingExecution();
        ArrayList<UserDataS> userDataList = new ArrayList<UserDataS>();     
        //user input
        userDataList.add(sortingExecution.getUserData(101,"ram",21));
        userDataList.add(sortingExecution.getUserData(103,"shraddha",22));
        userDataList.add(sortingExecution.getUserData(102,"shreya",19));
        userDataList.add(sortingExecution.getUserData(104,"bhanu",20));
        userDataList.add(sortingExecution.getUserData(105,"aayush",26));
        //creating object of SortUserDataImpl class
        SortUserDataImpl sortUserDataImpl = new SortUserDataImpl();
        //creating array list
        ArrayList<UserDataS> sortUserDataList =new ArrayList<UserDataS>();
        //calling sortUserDataByAge method
        sortUserDataList= sortUserDataImpl.sortUserDataByAge(userDataList);
        System.out.println("Sort by Age");
        for(int i=0;i<sortUserDataList.size();i++) {
        	System.out.print(" "+sortUserDataList.get(i).getUserAge());
        	System.out.print(" "+sortUserDataList.get(i).getUserName());
        	System.out.print(" "+sortUserDataList.get(i).getRollNumber());
        	System.out.println();
         }
        //calling sortUserDataByName method
        sortUserDataList= sortUserDataImpl.sortUserDataByName(userDataList);
        System.out.println("Sort by Name");
        for(int i=0;i<sortUserDataList.size();i++) {
        	System.out.print(" "+sortUserDataList.get(i).getUserAge());
        	System.out.print(" "+sortUserDataList.get(i).getUserName());
        	System.out.print(" "+sortUserDataList.get(i).getRollNumber());
        	System.out.println();
         }
      //calling sortUserDataByRollNumber method
        sortUserDataList= sortUserDataImpl.sortUserDataByRollNumber(userDataList);
        System.out.println("Sort by Roll Number");
        for(int i=0;i<sortUserDataList.size();i++) {
        	System.out.print(" "+sortUserDataList.get(i).getUserAge());
        	System.out.print(" "+sortUserDataList.get(i).getUserName());
        	System.out.print(" "+sortUserDataList.get(i).getRollNumber());
        	System.out.println();
         }
	}
}
