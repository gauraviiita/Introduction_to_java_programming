import java.util.*;
public class A4Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		for(int i =a; i<=b; i= i+c) {
			System.out.print(i+ " ");
			sum = sum + i;
		}
		System.out.println();
		System.out.println(sum);

	}

}
