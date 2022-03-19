package com.sebone.java.basic;
import java.util.Scanner;
/**class name:- ReverseString 
 * Objective:-To provide reverse string.
 * @author:-Shreya paliwal
 * Date-17/03/2022
*/
public class ReverseString {
  /**
	* method name:-returnString
	* objective:-return reverse of a string
	* @param  inputString
	* @return  reverseOfString
	*/
	public String returnString(String inputString) {
		String reverseOfString="";
		 for(int i=(inputString.length()-1);i>=0;i--){
			 reverseOfString=reverseOfString+inputString.charAt(i);
		 }
		 return reverseOfString;
	}
	/**
     * Method Name main
     * objective = main method of the program
     */
	public static void main(String[] args){
		//take input from user
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter a string");
		String inputString= scanner.next();
		//creating object of  ReverseString class
		ReverseString reverseString=new ReverseString();
		//calling returnString method
		String reverseOfString=reverseString.returnString(inputString);
		System.out.println("reverse string is "+reverseOfString);
		scanner.close();
	}
}
