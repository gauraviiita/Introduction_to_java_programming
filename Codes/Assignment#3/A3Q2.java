import java.util.*;
public class A3Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the water intake?");
		int x = sc.nextInt();
		int val = 5000;
		if(x >= 5000) {
			System.out.println("Yes, Alice is following doctor’s advice");
		}else {
			System.out.println("No, Alice is not following doctor’s advice");
		}
		
	}
}
