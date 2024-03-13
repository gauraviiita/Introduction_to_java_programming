import java.util.*;
public class A5Q10_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n >3");
		int n = sc.nextInt();
		
		int a = 0; 
		int b = 1;
		int c = 1;
		System.out.print(a + " "+ b+ " "+ c + " ");
		for(int i =4; i<=n; i++) {
			int term = a + b+c;
			System.out.print(term + " ");
			a = b;
			b = c;
			c = term;
		}

	}

}
