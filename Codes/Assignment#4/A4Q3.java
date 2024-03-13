import java.util.*;
public class A4Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int count =0;
		int sum = 0;
		do {
			int randnum = (int)(Math.random()*n)+1;
			System.out.print(randnum + " ");
			count = count + 1;
			sum  = sum + randnum;
		}while(n>count);
		int avg = sum/n;
		System.out.println();
		System.out.println(avg);
		

	}

}
