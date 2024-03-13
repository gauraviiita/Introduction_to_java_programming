import java.util.*;
public class overLoading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square: ");
		int side = sc.nextInt();
		System.out.println("enter the sides of rectangle: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the radius of a circle: ");
		double r = sc.nextDouble();
		
		System.out.println("Area of square is: "+ area(side));
		System.out.println("Area of rectangle is: "+ area(a, b));
		System.out.println("Area of circle is: "+ area(r));

	}-
	public static int area(int x) {
		return x*x;
	}
	public static int area(int a, int b) {
		return a*b;
	}
	public static double area(double r) {
		return Math.PI*r*r;
	}

}
