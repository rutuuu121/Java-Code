import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to print sum of prime numbers....");
		int range = sc.nextInt();
		int sum=0;
		for(int i=1; i<=range; i++) {
			if(isPrime(i))
				sum=sum+i;
				
		}
		System.out.println(sum);
	
	}
	public static boolean isPrime(int num) {
		if(num==1) return false;
		for(int i=2; i<num; i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}
}



//output:
//	Enter the range to print sum of prime numbers....
//	100
//	1060
