import java.util.*;
public class A5Q7_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter no of columns: ");
		int cols = sc.nextInt();
		
		for(int i = 1; i<=rows; i++) {
			for(int j = 1; j<=cols-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}

	}

}
