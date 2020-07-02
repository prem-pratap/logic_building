/*write a function t find out t_value, three int numbers are passed as arguement
 *to the function. These integers must range between 1-1000.
 * t_value(int input1,int input2,int input3). Following rules should be followed
 * to find t_value.
 *  
 *Rule I:-
 * i. If input2 is an even prime then calculate result as 
 * result=input*input1*(sum of first input2 prime numbers)
 * 
 * ii. If input2 is odd prime then calculate result as
 * result=input*input1*(sum of first input3 prime numbers)
 * 
 * iii. If input2 is even  composite then calculate result as
 * result=input*input1*(sum of first (input2+input3) prime numbers)
 * 
 * iv. If input2 is odd composite then calculate result as
 * result=input*input1*(sum of first (input1+input2+input3) prime  numbers)
 * 
 * Rule II
 * if result calculated in the above rule is prime then
 * 		return t_value=result+input1
 * if result calculated in the above result is composite then
 * 		return t_value=result-input1
 * 
 * 
 */


package logic;

import java.util.Scanner;

public class PrimeOperation {
	public static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if (n%i==0)
				return false;
		}
		return true;
	}
	
	public static int findTValue(int input1,int input2,int input3) {
		int flag1=0,flag2=0,sum=0,res=0;
		
		//To check even prime
		if(isPrime(input2)&& input2%2==0) 
			flag1=1;
			
		//to check odd prime
		else if(isPrime(input2)&& input2%2!=0) 
			flag1=0;
			
		//to check odd composite
		else if(!isPrime(input2)&& input2%2!=0) 
			flag2=0;
			
		//to check even composite
		else if(!isPrime(input2)&& input2%2==0) {
			flag2=1;
			System.out.println("Even Composite");}
	
		int cnt=0;
		int result=0;
		
		if(flag1==1) {
			for(int j=2;cnt<input2;j++) {
				int f=0;
				for(int k=2;k<=j/2;k++) {
					if(j%k==0) {
						f=1;
						break;
					}
				}
				if(f==0) {
					sum=sum+j;
					cnt++;}
			}
			result=input1*input1*sum;	
		}
		
		else if(flag1==0){
			for(int j=2;cnt<input3;j++) {
				int f=0;
				for(int k=2;k<=j/2;k++) {
					if(j%k==0) {
						f=1;
						break;
					}
				}
				if(f==0) {
					sum=sum+j;
					cnt++;}
			}
			result=input1*input1*sum;	
		}
		
		else if(flag2==1){
			for(int j=2;cnt<(input2+input3);j++) {
				int f=0;
				for(int k=2;k<=j/2;k++) {
					if(j%k==0) {
						f=1;
						break;
					}
				}
				if(f==0) {
					sum=sum+j;
					cnt++;}
			}
			result=input1*input1*sum;	
		}
		
		else if(flag2==0){
			for(int j=2;cnt<(input1+input2+input3);j++) {
				int f=0;
				for(int k=2;k<=j/2;k++) {
					if(j%k==0) {
						f=1;
						break;
					}
				}
				if(f==0) {
					sum=sum+j;
					cnt++;}
			}
			 result=input1*input1*sum;	
		}
		
		if(isPrime(result))
			return result+input1;
		else
			return result-input1;
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int res=findTValue(n1, n2, n3);
		System.out.println("The obtained t_value is:"+res);

	}

}
