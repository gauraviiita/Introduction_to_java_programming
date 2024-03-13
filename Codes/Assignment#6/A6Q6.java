import java.util.*;
public class A6Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		System.out.println("Enter your charcter: ");
		char ch = sc.next().charAt(0);
		int numbers = count(str, ch);
		System.out.println(numbers);
	}
	public static int count(String str, char a) {
		int n=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == a) {
				n = n+1;
			}
		}
		return n;
	}

}
