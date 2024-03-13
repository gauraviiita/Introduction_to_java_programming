import java.util.*;
public class A6Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(isPalindrome(str)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		str = str.replaceAll(" ", "");
		int i=0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i) !=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

}
}
