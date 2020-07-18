//Write a function that finds and returns the nth prime number. N will be passed as an input to the function.
//Assumption 1<=N<=1000 is the position of prime number

import java.util.Scanner;
class nth_prime{
	public static int NthPrime(int input){
		int result=1,count=0,i;
		while(count<input){
			result=result+1;
			for(i=2;i<=result;i++){
				if(result%i==0)
					break;
			}
			if(i==result)
				count=count+1;
		
		}
		
		return result;	

	}



	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position of prime number:");
		int num=sc.nextInt();
		int output=NthPrime(num);
		System.out.println("The "+num+"th prime number is "+output); 
	

	}

}
