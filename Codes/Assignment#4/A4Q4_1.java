import java.util.*;
public class A4Q4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int n1 = sc.nextInt();
		System.out.println("Enter second no");
		int n2 = sc.nextInt();
		while(n1%n2>0) {
			int r = n1%n2;
			n1 = n2;
			n2 = r;
			
		}
		System.out.println("gcd"+ n2);
		

	}

}
