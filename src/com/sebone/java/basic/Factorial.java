package com.sebone.java.basic;
import java.util.Scanner;
/**class name:-  Factorial
 * Objective:-To provide factorial of a number.
 * @author:-Shreya paliwal
 * Date-17/03/2022
*/
public class Factorial {
	/**
	* method name:-returnFactorial
	* objective:- return factorial of a number
	* @param  number 
	* @return  factorial
	* 
	*/
	public int returnFactorial(int number){
		int factorial=1;
		for(int i=1;i<=number;i++){
			factorial=factorial*i;
		}
		return factorial;
	}
	/**
     * Method Name main
     * objective = main method of the program
     */
	public static void main(String[] args){
		//take input from user
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number ");
		int number=scanner.nextInt();
		//creating the object of Factorial class
		Factorial factorial=new Factorial();
		//calling returnFactorial method
		int FactorialOfNumber=factorial.returnFactorial(number);
		//print factorial of a number
		System.out.println("factorial of "+number+" is "+FactorialOfNumber);
		scanner.close();
	}
}
