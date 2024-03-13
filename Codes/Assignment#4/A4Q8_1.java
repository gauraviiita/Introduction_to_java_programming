import java.util.*;
public class A4Q8_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 100;
		int cg;
		int ug;
		int count = 0;
		int limit = 50;
		
		do {
			
			cg = (int)(Math.random()*n) + 1;
		
			System.out.println("Enter user guess");
			ug = sc.nextInt();
			if(cg == ug) {
				System.out.println("User guess is: "+ ug);
				System.out.println("Computer guess is: "+ cg);
				System.out.println("correct guess");
				System.out.println("Your score to win the game is: "+ count);
			}else if(cg>ug) {
				System.out.println("User guess is: "+ ug);
				System.out.println("Computer guess is: "+ cg);
				System.out.println("Too low");
				count++;
			}else {
				System.out.println("User guess is: "+ ug);
				System.out.println("Computer guess is: "+ cg);
				System.out.println("Too high");
				count++;
			}
			
		}while(cg != ug && count < limit);

	}

}
