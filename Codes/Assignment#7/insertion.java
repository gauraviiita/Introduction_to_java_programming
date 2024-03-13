import java.util.*;
public class insertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = {8,5,7,3,2};
		System.out.println("Original array is: ");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		System.out.println("Array after sorting: ");
		for(int i=0; i<A.length-1; i++) {
			for(int j=0; j<A.length-1-i; j++) {
				if(A[j]>A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}

	}

}
