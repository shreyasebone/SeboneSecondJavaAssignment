package com.sebone.java.basic;
import java.util.Scanner;
/** class name:- SumOfNumber
 * Objective:-give sum of 1 to n number.
 * @author:-Shreya paliwal
 * Date-17/03/2022
*/
public class SumOfNumber{
    /**	
	* method name:-returnSum
	* objective:-return sum of the number(1 to n). 
	* @param  number 
	* @return  sum
	*/
	public int returnSum(int number){
		int sum=0;
		for(int i=1;i<=number;i++)
			sum=sum+i;	
		return sum;
	}
	/**
     * Method Name main
     * objective = main method of the program
     */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		//take input from user
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number ");
		int number=scanner.nextInt();
		//creating the object of SumOfNumber class
		SumOfNumber sumOfNumber=new SumOfNumber();
		//calling method returnSum
		int sum=sumOfNumber.returnSum(number);
		System.out.println("sum of 1 to "+number+" is "+sum );
		scanner.close();
	}
}
