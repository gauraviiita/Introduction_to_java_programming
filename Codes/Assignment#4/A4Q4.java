import java.util.*;
public class A4Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		while(num1%num2!=0) {
			int r = num1%num2;
			num1 = num2;
			num2 = r;
		}
		System.out.println(num2);

	}

}
