import java.util.*;
public class A4Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base: ");
		int base = sc.nextInt();
		System.out.println("Enter the power");
		int power = sc.nextInt();
		int count = 0;
		int sum =1;
		while(power > count) {
			sum = sum * base;
			count = count + 1;
		}
		System.out.println(base + "to the power "+ power + "is :"+ sum);

	}

}
