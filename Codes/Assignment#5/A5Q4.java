import java.util.*;
public class A5Q4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of m: ");
		int m = sc.nextInt();
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for(int i=m; i<=n; i++) {
			System.out.println("Factorial of "+ i+" "+ fact(i));
		}

	}
	public static int fact(int n) {
		int prod = 1;
		for(int i=1; i<=n; i++) {
			prod = prod*i;
		}
		return prod;
	}

}
