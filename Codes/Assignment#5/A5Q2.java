import java.util.*;
public class A5Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int reverseNum = isReverse(num);
		if(isPrime(num) == isPrime(reverseNum)) {
			System.out.println(" Yes, number is a twisted prime.");
		}else {
			System.out.println("No, number is not a twisted prime.");
		}
	}
	public static int isReverse(int n) {
		int revNo= 0;
		int multiplier = 1;
		while(n>0) {
			int digit = n%10;
			revNo = revNo*multiplier + digit;
			multiplier = multiplier*10;
			n = n/10;
		}
		System.out.println("Reverse number is: "+revNo);
		return revNo;
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
