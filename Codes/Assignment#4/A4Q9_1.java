import java.util.*;
public class A4Q9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prod = 1;
		int newNo = 0;
		while(n>0) {
			int r = n%10;
			if(r!=0) {
				newNo = newNo + r*prod;
				prod = prod*10;
			}
			n = n/10;
		}
		System.out.println(newNo);
	}

}
