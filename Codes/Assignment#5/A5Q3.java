import java.util.*;
public class A5Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int n2 = sc.nextInt();
		for(int i=n1; i<=n2; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
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
