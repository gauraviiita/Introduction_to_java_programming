import java.util.*;
public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int n1 = sc.nextInt();
		System.out.println("Enter second no");
		int n2 = sc.nextInt();
		System.out.println("Enter your choice");
		char choice = sc.next().charAt(0);
		double res;
		switch(choice) {
		case '+':
			res = n1+n2;
			System.out.println("Result is "+ res);
			break;
		case '-':
			res = n1-n2;
			System.out.println("Subtraction is "+res);
			break;
		case '*':
			res = n1*n2;
			System.out.println("multiplication is "+ res);
			break;
		case '/':
			if(n2!=0) {
				res = n1/n2;
				System.out.println("division is"+ res);
				break;
			}else {
				System.out.println("division by zero");
				break;
			}
		default:
			System.out.println("Invalid choice");
			
		}

	}

}
