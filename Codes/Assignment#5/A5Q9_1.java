import java.util.*;
public class A5Q9_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		double totalSum = 0;
		for(double i=1; i<=n; i++) {
			totalSum = totalSum + 1.0/(i*i);
		}
		System.out.println("Total sum: "+ totalSum);

	}

}
