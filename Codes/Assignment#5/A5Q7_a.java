import java.util.*;
public class A5Q7_a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			char count = 'A';
			for(int j = 1; j<=i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
			
		}

	}

}
