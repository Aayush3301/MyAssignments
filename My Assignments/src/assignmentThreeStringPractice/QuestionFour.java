package assignmentThreeStringPractice;

import java.util.Scanner;

//WAP to check if String is a Panagram or not
public class QuestionFour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String input");
		String s1 = sc.nextLine();
		
		 s1 = s1.replaceAll(" ", "").toLowerCase();
		
		
		 String s2 = "";
		for(char i = 'a' ; i <= 'z' ; i++) {
			
			if(s1.indexOf(i)!= -1) {
				
				s2 = s2 + i ;
			}
			
		}
		
		if(s2.length() == 26) {
			
			System.out.println("Panagram");
		}
		  
		else
		{System.out.println("not a Panagram");}
		  
	}

}
