package assignmentThreeStringPractice;

import java.util.Scanner;

public class QuestionFirst {

	
	
	
	
	
	public static void main(String[] args) {
		
		
		// input as per Question  :- iNeuron  
		// expected output :-   norueNi
		
		
		// using String
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String which needs to be reversed");
		String s1 = sc.nextLine();
		
		
		String s2 = "" ;
		
		for(int i = s1.length()-1 ; i>=0 ; i--) {
			
			s2 = s2 + s1.charAt(i);
		}
		
		System.out.println(s2);
		
		
		System.out.println("*******************************");
		System.out.println("Using inbuilt method of StringBuiler");
		
		
		
		
		System.out.println("Enter String which needs to be reversed");
        
		
		StringBuilder sb = new StringBuilder(sc.next());
		 sb.reverse();
		 
		 System.out.println(sb.toString());
		 
		 sc.close();
		
	}

}
