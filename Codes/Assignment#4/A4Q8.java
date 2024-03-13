import java.util.*;
public class A4Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		do {
			int randomnumber = (int)(Math.random()*n)+1;
			System.out.print(randomnumber + " ");
			sum = sum + randomnumber;
			count = count + 1;
			
		}while(n>count);
		double avg = (double) sum / n;
		System.out.println();
		System.out.println(avg);
	}

}
