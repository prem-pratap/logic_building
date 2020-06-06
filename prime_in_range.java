/*Write a function to find count of number of prime in a given range. Also include starting and ending numbers in the range.For e.g find prime between 2 and 20*/
import java.util.Scanner;
class prime_in_range{
	public static int countPrimeInRange(int input1,int input2){
		int count=0,check=1;
		for(int i=input1;i<=input2;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					check=0;
					break;
				}
				else
					check=1;			
			}
			if(check==1)
				count=count+1;
		}
		return count;
	}



	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number of range:");
		int inp1=sc.nextInt();
		System.out.println("Enter second number of range:");
		int inp2=sc.nextInt();
		int count=countPrimeInRange(inp1,inp2);
		System.out.println("Count of Primes between "+inp1+" and "+inp2+" :"+count); 	
	
	}
}

