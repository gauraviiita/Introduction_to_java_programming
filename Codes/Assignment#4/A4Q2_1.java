import java.util.*;
public class A4Q2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum =0;
		while(num > 0) {
			sum = sum + num%10;
			num = num/10;
		}
		if(sum %9 == 0) {
			System.out.println("True");
		}else {
			System.err.println("False");
		}

	}

}
