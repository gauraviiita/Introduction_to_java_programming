import java.util.*;
public class A7Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number");
		int num = sc.nextInt();
		
		int[] octalNum = D2O(num);
		
		System.out.println("Octal representation is: ");
		for(int i=octalNum.length-1; i>=0; i--) {
			System.out.print(octalNum[i]);
		}
	}
	public static int[] D2O(int num) {
		int[] newNum = new int[100];
		int i = 0;
		while(num!=0) {
			newNum[i] = num%8;
			i = i+1;
			num = num/8;
		}
		int result[] = new int[i];
		for(int j = 0; j<i; j++) {
			result[j] = newNum[j];
		}
		return result;
	}

}
