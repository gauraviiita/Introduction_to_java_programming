import java.util.*;
public class insert1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// create an array 
		int[] arr = new int[50];
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		//traversing an array
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("Enter the position you want to insert: ");
		int pos = sc.nextInt();
		System.out.println("Enter your element: ");
		int element = sc.nextInt();
		
		for(int i = size; i>pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos] = element;
		++size;
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
