

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		for(int x=1;x<=n;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print("*");
			}
				System.out.println();		
		}
		
         sc.close();
	}
     
}