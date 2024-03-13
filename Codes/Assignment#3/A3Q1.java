
import java.util.*;
public class A3Q1{
	public static void main(String args[]) {
		System.out.println("hello world!");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("You are eligible to cast your vote");
		}else {
			System.out.println("You are not eligible to cast your vote");
		}
	}
}