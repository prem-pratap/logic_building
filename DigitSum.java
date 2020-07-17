/*Write a function that takes as input a positive number and performs digit sum of either only the even digits or only odd digits in the given number , based on the option "even" or "odd"*/

import java.util.Scanner;
class DigitSum{
	public static int EvenOddDigitSum(int input1,String input2){
		int result=0;
		while(input1>0){
		int rem=input1%10;
		input1=input1/10;
		if((rem%2 ==0) && input2.equals("even"))
			result=result+rem;
		else if((rem%2!=0) && input2.equals("odd"))
			result=result+rem;	
		}
		return result;	
	}

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	System.out.println("Enter choice whether you want sum of  even or odd digits:");
	String choice=sc.next();
	int sum=EvenOddDigitSum(num,choice);
	System.out.println("The sum of "+choice+" digits:"+sum);
	}
}
