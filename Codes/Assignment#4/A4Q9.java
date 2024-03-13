import java.util.*;
public class A4Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int newNumber = 0;
		int multiplier = 1;
		
		while(n>0) {
			int digit = n%10;
			if(digit != 0) {
				newNumber = newNumber + digit*multiplier;
				multiplier = multiplier*10;
				
			}
			n = n/10;
		}
		System.out.println(newNumber);
		

	}

}
