import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int n = num;
		int sum = 0;
		
		//calculate the number of digit
		int numberOfDigits = String.valueOf(num).length();
		
		while(n!=0) {
			int lastDigit = n % 10;
			sum = sum + (int)Math.pow(lastDigit, numberOfDigits);
			n /=10;
			
		}
		if (sum == num) {
			System.out.println(num +" is an Armstrong number");
		}
		else {
			System.out.println(num +" is not Armstrong number");
			}
	}

}
