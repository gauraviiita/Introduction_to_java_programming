import java.util.*;
public class A6Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int totalNo = count(str);
		System.out.println(totalNo);

	}
	public static int count(String str) {
		int n = 0;
		str = str.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				n = n+1;
			}
		}
		return n;
	}

}
