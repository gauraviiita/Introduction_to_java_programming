import java.util.*;
public class A3Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter third number: ");
		int c = sc.nextInt();
		if(a > b && a>c) {
			System.out.println("Largest number: " + a);
			if(b>c) {
				System.out.println("Second largest number: "+ b);
			}else {
				System.out.println("Second largest number: "+ c);
			}
		}else if(b>a && b>c) {
			System.out.println("Largest number: " + b);
			if(a>c) {
				System.out.println("Second largest number: "+ a);
			}else {
				System.out.println("Second largest number: "+ c);
			}
		}else {
			System.out.println("Largest number: " + c);
			if(a>b) {
				System.out.println("Second largest number: "+ a);
			}else {
				System.out.println("Second largest number: "+ b);
			}
		}

	}

}
