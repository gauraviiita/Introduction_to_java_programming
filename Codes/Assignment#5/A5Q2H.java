import java.util.*;
public class A5Q2H {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = n; j>0; j--) {
				if(j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}

}
