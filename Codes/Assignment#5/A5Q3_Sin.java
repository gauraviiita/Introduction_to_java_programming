import java.util.*;
public class A5Q3_Sin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the degree in radian: ");
		int n = sc.nextInt();
		double x = Math.PI/n;
		double res = computeSin(x);
		System.out.println(res);
		

	}
	public static double computeSin(double x) {
		double result = 0;
		double term = x;
		int n =1;
		double error = 1e-6;
		
		while(Math.abs(term)> error) {
			result = result +term;
			n = n + 2;
			term = -term*x*x / (n*(n-1));
		}
		return result;
	}

}
