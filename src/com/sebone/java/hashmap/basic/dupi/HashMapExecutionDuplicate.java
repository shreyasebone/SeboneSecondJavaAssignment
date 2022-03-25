package com.sebone.java.hashmap.basic.dupi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapExecutionDuplicate {
	public UserDataDupiValue getUserData(int rollNumber,String userName,int userAge){
		UserDataDupiValue userDataDupiValue=new UserDataDupiValue();
		userDataDupiValue.setRollNumber(rollNumber);
		userDataDupiValue.setUserAge(userAge);
		userDataDupiValue.setUserName(userName);
		return userDataDupiValue;
	}
	public void  setUserDataDuplicate(int rollNumber,String userName,int userAge, HashMap<String,ArrayList<UserDataDupiValue>> hashMap){
		ArrayList<UserDataDupiValue> valueList = hashMap.get(userName);
		if(valueList == null) {
			ArrayList<UserDataDupiValue> returnList = getUserDataDuplicate(rollNumber, userName, userAge);
			hashMap.put(userName, returnList);
		}else {
			UserDataDupiValue userData = getUserData(rollNumber, userName, userAge);
			valueList.add(userData);
		}
	}
	public ArrayList<UserDataDupiValue> getUserDataDuplicate(int rollNumber,String userName,int userAge){
		UserDataDupiValue userDataDupiValue=getUserData(rollNumber,userName,userAge);
		ArrayList<UserDataDupiValue> returnList=new ArrayList<UserDataDupiValue>();
		returnList.add(userDataDupiValue);
		return returnList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapExecutionDuplicate hashMapExecutionDuplicate=new HashMapExecutionDuplicate();
		HashMap<String,ArrayList<UserDataDupiValue>> hashMap=new HashMap<String,ArrayList<UserDataDupiValue>>();
		hashMapExecutionDuplicate.setUserDataDuplicate(101, "ram", 21,hashMap );
		hashMapExecutionDuplicate.setUserDataDuplicate(102, "shyam", 24, hashMap);
		hashMapExecutionDuplicate.setUserDataDuplicate(103, "ram", 23,hashMap );
		hashMapExecutionDuplicate.setUserDataDuplicate(104, "shyam", 22,hashMap );
		hashMapExecutionDuplicate.setUserDataDuplicate(105, "ram", 25,hashMap );
		Set<String> setList=hashMap.keySet();
		for(String keys:setList) {
			ArrayList<UserDataDupiValue> list=hashMap.get(keys);
			for(UserDataDupiValue user:list) {
				if(user.getUserName()=="ram") {
					user.setUserAge(25);
				}
				System.out.println("keys="+keys+" userRollNumber="+user.getRollNumber()+" userAge "+user.getUserAge());
			}
		}
	}

}
