import java.util.*;
public class A7Q11 {
	public static void main(String[] args) {
		// Bubble sort
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Original array is: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Applying bubble sort...");
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("Sorted array is: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
