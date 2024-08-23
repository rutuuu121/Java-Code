import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String input=sc.nextLine();
		
		int vowelCount=countVowels(input);
		
		System.out.println("Number of Vowels:"+vowelCount);
	}
		public static int countVowels(String str) {
			int count=0;
			String vowels="aeiouAEIOU";
			for(int i=0;i<str.length();i++) {
				if(vowels.indexOf(str.charAt(i))!=-1) {
					count++;
				}
			}
			return count;
			
		}

	}


