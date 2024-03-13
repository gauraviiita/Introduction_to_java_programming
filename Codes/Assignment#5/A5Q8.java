import java.util.*;
public class A5Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input value of n: ");
		int n = sc.nextInt();
		int result = seriesSum(n);
		System.out.println("The sum of the series is "+ result);

	}
	public static int seriesSum(int n)
	{
		int totalSum = 0;
		for(int i = 1; i<=n; i++) {
			int innerSum = 0;
			for(int j=1; j<=i; j++) {
				innerSum = innerSum + j;
			}
			totalSum = totalSum+innerSum;
		}
		return totalSum;
	}
}
