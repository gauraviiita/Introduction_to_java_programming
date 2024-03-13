import java.util.*;
public class A7Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		double[] Arr = new double[n];
		System.out.println("Enter the elements of the array: ");
		
		for(int i = 0; i<n; i++) {
			Arr[i] = sc.nextDouble();
		}
		double smallestOne = min(Arr); 
		System.out.println("The minimum number is:  "+ smallestOne);
	}
	public static double min(double []Arr) {
		double smallestOne = Arr[0];
		for(int i=0; i<Arr.length; i++) {
			if(smallestOne > Arr[i]) {
				smallestOne = Arr[i];
			}
		}
		return smallestOne;
	}
}
