import java.util.*;
public class A7Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int sum =0;
		double avg = 0.0;
		for(int i=0; i<n; i++) {
			arr[i] = rm.nextInt(100);
			sum = sum + arr[i];
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Sum of given numbers "+ sum);
		System.out.println("Average of three numbers: "+ (double)sum/n);
	}

}
