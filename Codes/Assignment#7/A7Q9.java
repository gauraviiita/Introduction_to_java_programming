import java.util.*;
public class A7Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		double[] arr = new double[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextDouble();
		}
		double std = deviation(arr);
		double meanvalue = mean(arr);
		System.out.println("The mean is "+ meanvalue);
		System.out.println("The standard deviation is "+std);
	}
	public static double deviation(double[] x) {
		double meanvalue = mean(x);
		double result = 0.0;
		double std =0.0;
		for(int i=0; i<x.length; i++) {
			std = std + Math.pow((x[i]-meanvalue),2);
		}
		result = Math.sqrt(std/(x.length-1));
		return result;	
	}
	public static double mean(double[] x) {
		double result = 0.0;
		double sum = 0.0;
		for(int i=0; i<x.length; i++ ) {
			sum = sum + x[i];
		}
		result = sum/x.length;
		return result;
	}
}
