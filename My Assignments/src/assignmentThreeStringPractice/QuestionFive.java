package assignmentThreeStringPractice;

import java.util.Scanner;

public class QuestionFive {

	public static void main(String[] args) {
		int count = 0;
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String input");
		String s1 = sc.nextLine();
		
		 s1 = s1.replaceAll(" ", "").toLowerCase();
		 
		char a [] = s1.toCharArray();
		
		for(int i = 0;i<a.length;i++) {
			
		
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.print(a[j]);
					count++;
					break;
				}
				
			}
		}

	}

}
