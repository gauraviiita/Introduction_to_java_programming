import java.util.*;
public class A5Q10_1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of term more than 3: ");
		int n = sc.nextInt();
		int a=0;
		int b= 1;
		int c = 1;
		System.out.print(a + " " + b + " "+ c + " ");
		for(int i=4; i<=n; i++) {
			int next = a+b+c;
			System.out.print(next+ " ");
			a = b;
			b = c;
			c= next;
		}

	}

}
