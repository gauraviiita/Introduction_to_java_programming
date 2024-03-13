import java.util.*;
public class A5Q1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = sc.nextInt();
		if(sumOfDivisor(n1) == n2 && sumOfDivisor(n2)==n1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		

	}
	public static int sumOfDivisor(int n) {
		int sum = 0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
