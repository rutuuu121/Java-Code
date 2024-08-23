// Write a program to replace the 2nd occurrence of the ‘e’ character in a string with ‘@’.

import java.util.Scanner;

public class ReplaceChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String input=sc.nextLine();
		
		String result=replaceSecondE(input);
		
		System.out.println("Modified string:"+result);
	
	}
	public static String replaceSecondE(String str) {
		int count=0;
		StringBuilder modifiedString = new StringBuilder(str);
		
		for(int i = 0;i<modifiedString.length();i++) {
			if(modifiedString.charAt(i)=='e') {
				count++;
			if(count == 2) {
				modifiedString.setCharAt(i, '@');
			break;
			}
		}
	}
	return modifiedString.toString();
	}
}
