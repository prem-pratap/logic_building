/*write a function to find whether it is possible to get a pallindrome number from a given number by re-arranging the positions of digits.
 If yes, the function should return 2 else it should return 1*/

import java.util.Scanner;

class PallindromePossible{
	public static int isPossible(int input1){
		int [] freq_arr=new int[256];
		char[] char_arr=String.valueOf(input1).toCharArray();
		for(char ch:char_arr)
			freq_arr[ch]++;
		int oddCharCount=0;
		for(int ch:freq_arr){
			if(ch%2!=0)
				oddCharCount++;
			if(oddCharCount >1)
				return 1;	
		}
		return 2;
	}

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to chech whether pallindrome is possible:");
	int num=sc.nextInt();
	int result=isPossible(num);
	if(result==2)
		System.out.println("Pallindrome is possible");
	else
		System.out.println("Pallindrome is impossible");
	}
}

