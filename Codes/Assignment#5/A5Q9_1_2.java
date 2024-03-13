import java.util.*;
public class A5Q9_1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n = sc.nextInt();
		double sum = 0.0;
		for(int i=1; i<=n; i++) {
			sum = sum + 1.0/(i*i);
		}
		System.out.println("sum is "+ sum);

	}

}
