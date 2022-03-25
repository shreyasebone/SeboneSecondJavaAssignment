package com.sebone.java.map.basic;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExecution {
	public UserData getUserData(int rollNumber,String userName) {
		UserData userData=new UserData();
		userData.setRollNumber(rollNumber);
		userData.setUserName(userName);
		return userData;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapExecution hashMapExecution =new HashMapExecution();
		HashMap<Integer,UserData> map=new HashMap<Integer,UserData>();
		map.put(101, hashMapExecution.getUserData(101, "ram"));
		map.put(102, hashMapExecution.getUserData(102, "shyam"));
		map.put(103, hashMapExecution.getUserData(103, "vaishali"));
		map.put(104, hashMapExecution.getUserData(104, "heena"));
		map.put(105, hashMapExecution.getUserData(105, "deepu"));
		
		Set<Integer> keySetList= map.keySet();
		for(Integer keys :keySetList) {
			UserData value=map.get(keys);
			System.out.println("key="+keys +" values="+value.getUserName());	
		}	
	}
}
