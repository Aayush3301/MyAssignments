package assignmentThreeStringPractice;

import java.util.Scanner;

//wap to count number of special characters
public class QuestionEight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String value");
		String s1 = sc.nextLine();
		
		
		s1 = s1.replaceAll(" ", "").toLowerCase();
		
		char in[]=s1.toCharArray();
		
		
		int count1 = 0;
		int count2 = 0;
		
		
		
		for (int i = 0 ;i<in.length;i++) {
			
			if (in[i] >= 'a'  && in [i] <= 'z') {
				
				count1++;
			}
		
			else {
				count2++;
			}
		
		}
		
		
		System.out.println("Count of special characters is " + count2);
		
		
			
		}

	}


