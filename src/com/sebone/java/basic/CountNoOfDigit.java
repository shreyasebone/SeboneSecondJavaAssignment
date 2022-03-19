package com.sebone.java.basic;
import java.util.Scanner;
/**class name:- CountNoOfDigit
 * Objective:-count no of digit in given no.
 * @author:-Shreya paliwal
 * Date-17/03/2022
*/

public class CountNoOfDigit {
    /**
	* method name:-returnCount
	* objective:-return count of digit in a given number 
	* @param  digit
	* @return  count
	*/
	public int returnCount(int digit){
		int count=0;
			while(digit != 0){
				digit=digit/10;
				count++;
	    }
		return count;
	}
	/**
     * Method Name main
     * objective = main method of the program
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take input from user
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number ");
		int number=scanner.nextInt();
		//creating the object of a class CountNoOfDigit.
		CountNoOfDigit countNoOfDigit=new CountNoOfDigit();
		//calling returnCount method
		int count=countNoOfDigit.returnCount(number);
		System.out.println(count+" number in "+number);
		scanner.close();
	}
}
