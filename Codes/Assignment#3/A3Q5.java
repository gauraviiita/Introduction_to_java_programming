import java.util.*;
public class A3Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("Enter any year: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		// Century year%100 == 0 and year%400 == 0 
		// Yearly year%100 != 0 and year%4==0;
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
			System.out.println("Leap year");
		}else {
			System.out.println("Normal year");
		}
	}

}
