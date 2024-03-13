import java.util.Scanner;

public class dec2AnyBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int a = sc.nextInt();
		System.out.println("Enter your desired base: ");
		int b = sc.nextInt();
		String c = convertToAnyBase(a, b);
		System.out.println(c);

	}
	public static String convertToAnyBase(int n, int b) {
		String d = "";
		while(n>0) {
			if(b==16) {
				int rem = n%b;
				if(rem>=10 && rem<=16) {
					String d1 =  Integer.toHexString(rem);
					d = d1 + d;
				}else {
					d = rem+d;
				}
				n = n/b;
			}
			else {
				int rem = n%b;
				d = rem+d;
				n=n/b;
			}
		}
		return d;
	}

}
