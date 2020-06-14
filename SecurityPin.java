/*The three input numbers must be between 100-999 
 * -> The pin should be made up of 4 digits
 * -> The unit position of the pin should be least of the units position
 * of the three input numbers
 * -> The tens position of the pin should be least of the tens position 
 * of the three input numbers
 * -> The hundreds position of the pin should be least of the hundreds position
 * of the three input numbers
 * -> The thousands position of the pin should be maximum of all the digits 
 * in the three input numbers 
 *
 */

package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class SecurityPin {
	public static int createPin(int input1, int input2, int input3) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		int count=0;
		while(input1 > 0 && input2 > 0 && input3 > 0) {
			int r1=input1%10;
			arr.add(count,r1);
			count++;
			input1/=10;
			
			int r2=input2%10;
			arr.add(count, r2);
			count++;
			input2/=10;
			
			int r3=input3%10;
			arr.add(count, r3);
			count++;
			input3/=10;
			
			int min=Math.min(Math.min(r1, r2),r3);
			sb.append(min);
			
		}
		
		sb.append(Collections.max(arr));
		String result=sb.reverse().toString();
		int pin=Integer.parseInt(result);
		return pin;
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers each must be between 100-999:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int pin=createPin(num1, num2, num3);
		System.out.println("The pin generated is:"+pin);
	}

}
