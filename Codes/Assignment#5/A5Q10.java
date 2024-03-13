import java.util.*;
public class A5Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		if(n<=3) {
			System.out.println("Please enter a value greater than 3");
		}else {
			generateSequence(n);
		}

	}
	public static void generateSequence(int n) {
		int a = 0, b=1, c=1;
		System.out.println("Generated sequence: ");
		System.out.print(a + ", "+ b+ ", "+ c);
		for(int i=4; i<=n; i++) {
			int nextTerm = a+b+c;
			System.out.print(", "+ nextTerm);
			a = b;
			b=c;
			c=nextTerm;
		}
	}

}
