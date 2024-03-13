import java.util.*;
public class A6Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if(isPalindrome(num)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
	public static boolean isPalindrome(int number) {
		int revNo = reverse(number);
		if(number == revNo) {
			return true;
		}else {
			return false;
		}
	}
	public static int reverse(int number) {
		int revNo = 0;
		
		while(number!=0) {
			int digit  = number %10;
			revNo = revNo*10 + digit;
			
			number = number/10;
		}
		System.out.println(revNo);
		return revNo;
	}

}
