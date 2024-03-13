import java.util.*;
public class A3Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int mark = sc.nextInt();
		switch(mark/10) {
		case 9:
			System.out.println("O");
			break;
		case 8:
			System.out.println("A");
			break;
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
		case 5:
			System.out.println("D");
			break;
		case 4:
			System.out.println("E");
			break;
		default:
			System.out.println("F");
		}

	}

}
