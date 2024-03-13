import java.util.*;
public class AQ9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password");
		String str = sc.nextLine();
		
		if(isValidPassword(str)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}
	public static boolean isValidPassword(String str) {
		//case1 minimum length
		if(str.length()<8) {
			return false;
		}
		
		//case 2/ check for at least two digits
		int digitCount = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				digitCount++;
			}
		}
		if(digitCount<2) {
			return false;
		}
		
		//case 3
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!Character.isLetterOrDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
