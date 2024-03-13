import java.util.*;
public class A4Q10_1 {

	public static void main(String[] args) {
		int n = 100;
		
		int count = 0;
		while(Math.pow(3, count) <= n) {
			count++;
		}
		System.out.println(Math.pow(3, count-1));
	}

}
