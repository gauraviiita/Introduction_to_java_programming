import java.util.*;
public class A4Q6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		int base = sc.nextInt();
		System.out.println("Enter the power");
		int pow = sc.nextInt();
		int multiplication = 1;
		for(int i = 1; i<=pow; i++) {
			multiplication = multiplication*base;
		}
		System.out.println(multiplication);

	}

}
