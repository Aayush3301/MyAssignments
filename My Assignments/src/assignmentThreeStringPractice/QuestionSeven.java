package assignmentThreeStringPractice;

//wap to count number of vowels and consonants in String value
import java.util.Scanner;

public class QuestionSeven {

	public static void main(String[] args) {
		System.out.println("Enter Strin input");
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		char vowels[]= {'a','e','i','o','u'};
		
		s1 = s1.replaceAll(" ", "").toLowerCase();
		
		char in[]= s1.toCharArray();

		int count1 = 0;
		
		
		for(int i=0;i<in.length;i++) {
			
			for(int j=0;j<vowels.length;j++) {
				
				if(in[i] == vowels[j]) {
					count1++;
				}
			}
		}
		
		System.out.println(in.length);
		int consonant = in.length - count1;
		
		System.out.println("The count of vowels is " + count1 + " The count of consonant is " + consonant );
		
		
	}

}
