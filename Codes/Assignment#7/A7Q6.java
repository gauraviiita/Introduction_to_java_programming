import java.util.*;
public class A7Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Original array is: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//reversing the element of the original array
		int i=0;
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.print("Reversed array is: ");
		for(int k=0; k<n; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
