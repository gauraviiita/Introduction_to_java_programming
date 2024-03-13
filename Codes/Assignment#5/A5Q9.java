import java.util.*;
public class A5Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		double result= seriesSum(n);
		System.out.println("The sum of the series: "+ result);

	}
	public static double seriesSum(int n) {
		double totalSum =0;
		for(int i=1; i<=n; i++) {
			totalSum = totalSum + 1.0/(i*i);
		}
		return totalSum;
	}

}
