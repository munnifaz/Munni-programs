package week3.Day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Week3Day1Excercize {

	public static void main(String[] args) {

// ChangeOddIndexToUpperCase

		/*
		 * String test = "changeme"; String newstring=""; char[]
		 * array=test.toCharArray(); System.out.println(array.length); for(int
		 * i=0;i<=array.length-1;i++) { if(i%2==1) {
		 * newstring=newstring+Character.toUpperCase(array[i]);} else {
		 * newstring=newstring+array[i];} } System.out.println(newstring);
		 */

// FindIntersection in both strings

		/*
		 * int[] Arr1={3,2,11,4,6,7}; int[] Arr2={1,2,8,4,9,7};
		 * 
		 * int[] Arr3=new int[10];
		 * 
		 * 
		 * System.out.println(Arr1.length); System.out.println(Arr2.length);
		 * 
		 * for(int i=0;i<=Arr1.length-1;i++) {
		 * 
		 * for(int j=0;j<=Arr2.length-1;j++) {
		 * 
		 * if(Arr1[i]==Arr2[j]){
		 * 
		 * Arr3[i]=Arr1[i]; System.out.println(Arr3[i]); } } }
		 */

// Palindrome or not
		/*
		 * String str = "Madam"; String revstr=""; int i;
		 * System.out.println(str.length()); for(i=str.length()-1;i>=0;i--) {
		 * System.out.println(str.charAt(i)); revstr+=str.charAt(i); }
		 * System.out.println(revstr); if(revstr.equalsIgnoreCase(str)) {
		 * System.out.println("The two strings are equal");} else {
		 * System.out.println("The two strings are not equal"); }
		 */

// RemoveDuplicates

		/*
		 * String text = "We learn java basics as part of java sessions in java week1";
		 * int count = 0; String newstring = ""; String[] splittext = text.split(" ");
		 * System.out.println(splittext.length);
		 * 
		 * for (int i = 0; i <= splittext.length - 1; i++) {
		 * System.out.println(splittext[i]); count = 0; for (int j = i + 1; j <=
		 * splittext.length - 1; j++) {
		 * 
		 * if (splittext[i].equals(splittext[j])) { count = count + 1;
		 * 
		 * }
		 * 
		 * } if (count > 1) { newstring = text.replaceAll(splittext[i], "");
		 * 
		 * // newstring = newstring + " " + splittext[i];
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println("The new string without duplicates is" +
		 * newstring.trim());
		 */
// Reverse Even words in java

		/*
		 * String test = "I am a software tester"; String[] array = test.split(" ");
		 * String[] array1 = new String[40];
		 * 
		 * System.out.println(array.length);
		 * 
		 * for (int i = 0; i < array.length; i++) { if (i % 2 == 0) { //
		 * System.out.println(array[i]); array1[i] = array[i]; } else { String empty="";
		 * char[] array2=array[i].toCharArray(); for (int j = array2.length - 1; j >= 0;
		 * j--) { //System.out.print(array[i].charAt(j)); empty+=array2[j];}
		 * array1[i]=empty;}
		 * 
		 * System.out.print(array1[i] + " "); }
		 * 
		 */

// Anagram program
		/*
		 * String text1 = "asdfg"; String text2 = "gdsfaww"; if (text1.length() ==
		 * text2.length()) { 
		 * char[] array1 = text1.toCharArray(); 
		 * char[] array2 =
		 * text2.toCharArray(); Arrays.sort(array1); Arrays.sort(array2);
		 * 
		 * if (Arrays.equals(array1, array2)) {
		 * System.out.println("The two arrays are equal"); } else {
		 * System.out.println("The two arrays are not equal"); }
		 * 
		 * } else { System.out.println("The two strings length is not equal");
		 * 
		 * }
		 */
		
//SumOfDigitsFromString program		
		
		String text = "Tes12Le79af65";
		int sum = 0;
		char[] chararray=text.toCharArray();
		
		for(int i=0;i<=text.length()-1;i++) {
			chararray[i]=text.charAt(i);
			if(Character.isDigit(chararray[i])) {
				sum=sum+Character.getNumericValue(chararray[i]);}
			else {
				System.out.println("not digit");
				}		
		}System.out.println("The sum of digits in a given text is"+sum);
	}

}












