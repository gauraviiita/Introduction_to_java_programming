import java.util.*;
public class reverseNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reversedNo = 0;
		while(num!=0) {
			int digit = num%10;
			reversedNo = reversedNo * 10 + digit;
			num = num/10;
		}
		System.out.println(reversedNo);

	}

}
