package com.sebone.java.basic;
import java.util.Scanner;
/**class name:- PrimeNumber
 * Objective:-find given number is prime or not.
 *  @author:-Shreya paliwal
 * Date-17/03/2022
*/
public class PrimeNumber{
	/**
	* name:-isPrime
	* Objectives: return true if given number is prime
	* @param  number 
	* @return flag
	*/
	public boolean isPrime(int number) {
		int i;
		boolean flag=true;
		if(number==1 || number==0){
			flag=false;
		}
		for(i=2;i<=number/2;i++){
			if(number%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}
	/**
     * Method Name main
     * objective = main method of the program
     */
	public static void main(String args[]){
		//take input from user
		Scanner scanner=new Scanner (System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		//creating the object of class
		PrimeNumber primeNumber=new PrimeNumber();
		boolean primeNumber1=primeNumber.isPrime(number);
		if( primeNumber1){
		   System.out.println(number +" is prime number");
	    }else {
		   System.out.println(number +" is not prime number");	
	    }
		scanner.close();
	}

}
