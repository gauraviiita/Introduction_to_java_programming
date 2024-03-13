import java.util.*;
public class A7Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] Arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n; i++) {
			Arr[i] = sc.nextInt();
		}
		int firstLargest = 0;
		int secondLargest = 0;
		for(int i=0; i<n; i++) {
			if(Arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = Arr[i];
			}
		}
		System.out.println("The second largest element is: "+ secondLargest);
	}
}
