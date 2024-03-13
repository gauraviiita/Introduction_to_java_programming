import java.util.*;
public class A5Q8_1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int outerSum = 0;
		for(int i=1; i<=n; i++) {
			int innerSum = 0;
			for(int j=1; j<=i; j++) {
				innerSum = innerSum+j;
			}
			outerSum = outerSum + innerSum;
		}
		System.out.println("total sum is: "+ outerSum);

	}

}
