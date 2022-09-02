package assignmentThreeStringPractice;

import java.util.Scanner;

public class QuestionSecond {

	public static void main(String[] args) {
		
		//input as per Question :-   Think Twice
		// Expected Output :-  kniht eciwt
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input String");
		String s1 = sc.nextLine();
		
		System.out.println("input is  " + s1);
		sc.close();
		
		
		String a[]= s1.split(" ");
		
		
		
		String s2 = "";
		
		for(int i = 0 ; i<a.length ; i++) {
			String r = "";
			for(int j = a[i].length()-1 ; j>=0;j--) {
				
				r = r +  a[i].charAt(j) ;
			}
			
			
			s2 = s2 + r + " ";
			
			
		}
		
		
		System.out.println(s2.toLowerCase());

	}

}
