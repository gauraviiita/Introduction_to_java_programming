import java.util.Scanner;
public class A3Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x point: ");
		double x = sc.nextDouble();
		System.out.println("Enter y point: ");
		double y = sc.nextDouble();
		if(x > 0 && y>0) {
			System.out.println("("+ x+","+y+") is in quadrant I ");
		}
		else if(x==0 && y>0 | y<0) {
			System.out.println("("+ x+","+y+") is on y-axis ");
		}
		else if(x>0 | x< 0 && y==0) {
			System.out.println("("+ x+","+y+") is on x-axis ");
		}
		else if(x ==0 && y==0) {
			System.out.println("("+ x+","+y+") is center ");
		}
		else if(x <0 && y>0) {
			System.out.println("("+ x+","+y+") is in quadrant II ");
		}
		else if(x < 0 && y<0) {
			System.out.println("("+ x+","+y+") is in quadrant III ");
		}
		else {
			System.out.println("("+ x+","+y+") is in quadrant IV ");
		}
	}

}
