package org.java;
import java.util.*;

public class StringQuestions {

	public static void main(String[] args) {
		
		
		
		      String str = "Hello, World!";
		        
		        Map<Character, Integer> countMap = new HashMap<>();
		        
		        for (char ch : str.toCharArray()) {
		            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
		        }
		        
		        System.out.println("Character Count:");
		        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    
		       
		
		
		
		
		
		
		
		
		//Palindrom("a a");
		
		//reverseString("kanojiya sachin");
	}
	
	
	public static void Palindrom(String input) {
		
		String reverse=reverseString(input);
		
		boolean a=false;
		
		if(reverse.equals(input))
		{
			a=true;
		}
		
		if(a==false)
		{
			System.out.println("not pallindrom");
		}
		else {
			System.out.println("pallindrom");
		}	
		
	}
	
	
 public static String reverseString(String reverse)
 {
	 String out="";
	 
	 for(int i=reverse.length()-1;i>=0;i--) {
		 
		 out=out+reverse.charAt(i);
		 
	 }
	 System.out.println(out);
	 return out;
	 
 }
}
