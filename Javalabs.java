package com.ga.intro;

public class javalab {
	public static void main(String[] args) {
		// JAVA METHOD LABS
		// LAB 1. Write a method called divide152By().
		//It should accept a number as an argument and divide 152 by the given number. 
		//For example, the divide152By result of 2 — 152/2 — is 76. Your method should return the result.
		// Use your method to find the following:
		System.out.println(divide152By(3));
		System.out.println(divide152By(43));
		System.out.println(divide152By(8));
		
		// LAB 2. Write a method called thirdAndFirst(). 
		//This method accepts two strings and 
		//checks if the third letter of the first string is the same as the 
		//first letter of the second string. It should be case insensitive, 
		//meaning thirdAndFirst("Apple","Peon") should return true.
		// Check the following:
		// thirdAndFirst("billygoat","LION");
		// thirdAndFirst("drEAMcaTCher","statue");
		// thirdAndFirst("Times","thyme");
		System.out.println(thirdAndFirst("billygoat","LION"));
		System.out.println(thirdAndFirst("drEAMcaTCher","statue"));
		System.out.println( thirdAndFirst("Times","thyme"));
		
		
		// LAB 3. Write a method called transmogrifier(). 
		//This method should accept three arguments, which you can assume will be numbers. 
		///Your method should return the "transmogrified" result, 
		//which is the product of the first two numbers raised to the power of the third number. 
		//For example, the transmogrified result of 5, 3, and 2 — (5 times 3) to the power of 2 — is 225.
		// Use your method to find the following:
		System.out.println(transmogrifier(5, 3, 2));
		System.out.println(transmogrifier(5, 4, 3));
		System.out.println(transmogrifier(13, 12, 5));
		System.out.println(transmogrifier(42, 13, 7));
		
		
		
		// LAB 4. Write a method called reverseString(). 
		//This method should take one argument, a String. 
		//The method should return a String with the order of the words reversed. 
		//Don't worry about punctuation.
		// Check the following:
		System.out.println(reverseString("black cat"));// => "tac kcalb"
		System.out.println(reverseString("the cow jumped over the moon")); //=> "noom eht revo depmuj woc eht"
		System.out.println(reverseString("I can ride my bike with no handlebars"));//=> "srabeldnah on htiw ekib ym edir nac I"
		
	} //m
	
	public static int divide152By(int number) {
		return (152/number);
	}
	
	public static boolean thirdAndFirst(String str1, String str2) {
		char thirdLetter = Character.toLowerCase(str1.charAt(2));
		char firstLetter = Character.toLowerCase(str2.charAt(0));
		
		return (thirdLetter == firstLetter) ? true : false; 
	}
	
	public static int transmogrifier(int num1, int num2, int num3) {
		return (int) Math.pow((num1*num2), num3);
	}
	
	public static String reverseString(String str) {
		    StringBuilder sb=new StringBuilder(str);  
		    sb.reverse();  
		    return sb.toString();  
	}
	
}
