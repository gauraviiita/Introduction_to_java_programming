import java.util.*;
public class A6Q1_A {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("Enter your choice based on given options: ");
			System.out.println("1 for addition");
			System.out.println("2 for subtraction");
			System.out.println("3 for multiplication");
			System.out.println("4 for division");
			System.out.println("5 for reminder");
			System.out.println("6 for sqrt");
			System.out.println("0 for quit");
			ch = sc.nextInt();
			
			switch(ch) {
			case 0:
				System.out.println("Exit...");
				break;
			case 1:
				System.out.println("Enter two numbers: ");
				int x = sc.nextInt();
				int y = sc.nextInt();
				int sum = additionSimple(x, y);
				System.out.println(sum);
				break;
			case 2:
				System.out.println("Enter two numbers: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int sub = subtractionSimple(a, b);
				System.out.println(sub);
				break;
			case 3:
				System.out.println("Enter two numbers: ");
				int a1 = sc.nextInt();
				int b1 = sc.nextInt();
				int multi = multiplicationSimple(a1, b1);
				System.out.println(multi);
				break;
			case 4:
				System.out.println("Enter two numbers: ");
				int a2 = sc.nextInt();
				int b2 = sc.nextInt();
				double div = divisionSimple(a2, b2);
				System.out.println(div);
				break;
			case 5:
				System.out.println("Enter two numbers: ");
				int a3 = sc.nextInt();
				int b3 = sc.nextInt();
				int rem = remainderSimple(a3, b3);
				System.out.println(rem);
				break;
			case 6:
				System.out.println("Enter one number: ");
				int a4 = sc.nextInt();
				
				double sqrt = squareRootSimple(a4);
				System.out.println(sqrt);
				break;
			}
			
		}while(ch!=0);
		
	}
	public static int additionSimple(int x, int y) {
		return x+y;
	}
	public static int subtractionSimple(int x, int y) {
		return x-y;
	}
	public static int multiplicationSimple(int x, int y) {
		return x*y;
	}
	public static double divisionSimple(int x, int y) {
		return (double)x/y;
	}
	public static int remainderSimple(int n, int m) {
		return n%m;
	}
	public static double squareRootSimple(int n) {
		return (double)Math.sqrt(n);
	}



}
