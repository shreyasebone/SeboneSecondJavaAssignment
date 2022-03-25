package com.sebone.java.map.basic.dupi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.sebone.java.map.basic.UserData;

public class HashMapExecutionDupi {
	
	private UserDataDupi getUserData(int rollNumber,String userName,int userAge) {
		UserDataDupi userDataDupi =new UserDataDupi();
		userDataDupi.setRollNumber(rollNumber);
		userDataDupi.setUserName(userName);
		userDataDupi.setUserAge(userAge);
		return userDataDupi;
	}
	
	public List<UserDataDupi> getUserDataDupi(int rollNumber,String userName,int userAge) {
		UserDataDupi userDataDupi = getUserData(rollNumber, userName, userAge);
		ArrayList<UserDataDupi> returnList=new ArrayList<UserDataDupi>();
		returnList.add(userDataDupi);
		return returnList;
	}
	public static void main(String args[]) {
		HashMapExecutionDupi hashMapExecutionDupi = new HashMapExecutionDupi();
		ArrayList<UserDataDupi> list=new ArrayList<UserDataDupi>();
		HashMap<String,List<UserDataDupi>> hashMap =new HashMap<String,List<UserDataDupi>>();
		hashMap.put("ram",hashMapExecutionDupi.getUserDataDupi(101, "ram", 21));
		hashMap.put("shyam",hashMapExecutionDupi.getUserDataDupi(102, "shyam", 22));
		hashMap.put("aayushi",hashMapExecutionDupi.getUserDataDupi(103, "aayushi", 20));
		hashMap.put("rani",hashMapExecutionDupi.getUserDataDupi(104, "rani", 21));
		Set<String> setList=hashMap.keySet();
		for(String keys:setList) {
			List<UserDataDupi> values= hashMap.get(keys);
			for(UserDataDupi user : values) {
				System.out.println("key="+keys+" values "+user.getUserName()+" "+user.getRollNumber());
			}
		}	
	}
}
