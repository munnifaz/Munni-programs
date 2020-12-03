package week3.Day1;

import java.util.Arrays;

public class Classprograms {
	
	private static int i;
	public static void main(String[] args) {
		/*
		 * int[] arr = {3,2,11,4,6,7}; int largest = arr[0]; int secondLargest = arr[0];
		 * 
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * if (arr[i] > largest) { secondLargest = largest; largest = arr[i];
		 * 
		 * } else if (arr[i] > secondLargest) { secondLargest = arr[i];
		 * 
		 * } }
		 * 
		 * System.out.println("\nSecond largest number is:" + secondLargest);
		 */
		
		
		/*
		 * int[] arr = {1,2,3,4,7,6,8}; Arrays.sort(arr);
		 * 
		 * for(int i = 1;i<=arr.length;i++){ if(i!=arr[i-1]) { System.out.println(i);
		 * break;}
		 * 
		 * }
		 */
		
		
	//checking the number of "E" s in given string			
		/*
		 * String str = "welcome to chennaiee"; int varcount=0; char[]
		 * Array=str.toCharArray(); int lenthofarray = Array.length;
		 * System.out.println(lenthofarray); for(int i=0;i<=lenthofarray;i++) {
		 * if(Array[i]=='e') { varcount=varcount+1; }
		 * System.out.println("The number of times E letter prsent is"+varcount); }
		 */
		
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] Array=test.toCharArray(); 
		int lenthofarray = Array.length;
		for(int i=0;i<=lenthofarray;i++) {
			if(Character.isLetter(Array[i])) {
				System.out.println("letter: " + Array[i]);}
				else if(Character.isDigit(Array[i])) {
					System.out.println("number: " + Array[i]);}
					else if(Character.isSpaceChar(Array[i])) {
						System.out.println("space: " + Array[i]);}
					  else {
						  System.out.println("specialCharcter: " + Array[i]);
				
			}
		}
		
		
	}
	}

	
	
	
	




