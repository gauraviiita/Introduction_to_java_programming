import java.util.*;
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println("Enter m");
		int m = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}

}
