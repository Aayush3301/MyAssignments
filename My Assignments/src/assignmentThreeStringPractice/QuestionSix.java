package assignmentThreeStringPractice;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter String input");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		s1 = s1.replaceAll(" ", "").toLowerCase();
		
		char a[]= s1.toCharArray();
		
		Arrays.sort(a);
		
		System.out.println(String.valueOf(a));
		

	}

}
