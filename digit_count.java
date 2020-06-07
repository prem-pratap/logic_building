//Write a function to count digit of a number

import java.util.Scanner;
class digit_count{
	public static int count_digit(int input1){
		int  count=0;
		while(input1>0){
		input1=input1/10;
		count=count+1;		
		}
	
	return count;
	}
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int result=count_digit(num);
	System.out.println("The number of digits in "+num+" are "+result);	
	}


}
