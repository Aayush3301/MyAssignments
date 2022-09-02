package assignmentThreeStringPractice;

import java.util.Arrays;
import java.util.Scanner;

// WAP to check if String is anagram or not

public class QuestionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String a[] = new String[2];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String input");
		String s1  = sc.nextLine();
		
		System.out.println("Enter Second String input");
		String s2 =sc.nextLine();
		
		
		s1 = s1.toLowerCase();
		
		s2 = s2.toLowerCase();
		
		
		if(s1.length() == s2.length()) {
	   	
		char a1[] = s1.toCharArray();
		
		char a2[]= s2.toCharArray();
		
		
		Arrays.sort(a1);
		
		Arrays.sort(a2);
		
		boolean result = Arrays.equals(a1, a2);
		
		if(result) {
			
			System.out.println( s1 + " " + s2 + " " + "are anagram");
		}
		
		else { System.out.println( s1 + " " + s2 + " " + "are not anagram"); }
		
		
		}
		
		else {
			System.out.println( s1 + " " + s2 + " " + "are not anagram");
		}
			
		}
		
		
		

	}


