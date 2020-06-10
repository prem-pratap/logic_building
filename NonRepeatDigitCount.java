/*Write a fucntion to find the count of non-repeated digit in given number N. The number will be passed to the function as arguement*/

import java.util.Scanner;
class NonRepeatDigitCount{
	public static int digitCount(int input1){
		int temp=input1;
		int i=0,j,k;
		int count=0,flag,size=0;
		//count no. of digits in number
		while(temp>0){
			temp=temp/10;
			size++;
	
		}
		int [] arr=new int[size];
		temp=input1;
		while(temp>0){
			arr[i]=temp%10;
			temp=temp/10;
			i++;		
		}
		for(j=0;j<size;j++){
			flag=0;
			for(k=0;k<size;k++){
			if(j!=k){
				if(arr[j]==arr[k])
					flag++;	
				}			
			}
			if(flag==0)
				count++;		
		}
		return count;
	}

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int result=digitCount(num);
	System.out.println("No. of non repeated digits in "+num+" are:"+result);
	}
}

