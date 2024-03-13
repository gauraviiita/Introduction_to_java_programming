import java.util.*;
public class A6Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max_no = 100;
		int perline = 10;
		for(int i =1; i<=max_no; i++) {
			int num = getPentagonalNumber(i);
			if(i%10==0) {
				System.out.println();
			}else {
				System.out.print(num + " ");
			}
		}

	}
	public static int getPentagonalNumber(int n) {
		return n*(3*n -1)/2;
	}

}
