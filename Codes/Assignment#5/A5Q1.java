import java.util.*;
public class A5Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second no: ");
		int num2 = sc.nextInt();
		if(areAmicable(num1, num2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public static boolean areAmicable(int num1, int num2) {
		return (calSumOfDiv(num1) == num2) && (calSumOfDiv(num2)==num1);
		
	}
	
	public static int calSumOfDiv(int num) {
		int sum = 1;
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				sum = sum+i;	
			}
			
		}
		return sum;
	}

}
