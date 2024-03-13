import java.util.*;
public class A3Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();
		System.out.println("Enter thrid number: ");
		int z = sc.nextInt();
		if(x > y) {
			if(y > z) {
				System.out.println("Decreasing");
			}else {
				System.out.println("Neither Increasing nor decreasing");
			}
		}else {
			if(z>y) {
				System.out.println("Increasing");
			}else {
				System.out.println("Neither Increasing nor decreasing");
			}
		}
	}
}
