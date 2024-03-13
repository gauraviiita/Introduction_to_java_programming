import java.util.*;
public class A6Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start year: ");
		int year1 = sc.nextInt();
		System.out.println("Enter end year: ");
		int year2 = sc.nextInt();
		
		for(int i=year1; i<=year2; i++) {
			int days = numberOfDaysInAYear(i);
			System.out.print(days + " ");
		}
		

	}
	public static int numberOfDaysInAYear(int year) {
		return (isLeapYear(year)?366:365);
	}
	public static boolean isLeapYear(int year) {
		if(year%4==0 && year%100 !=0 || year%400==0) {
			return true;
		}else {
			return false;
		}
	}

}
