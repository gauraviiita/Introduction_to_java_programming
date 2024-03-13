import java.util.*;
public class SinX_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the theta in degree");
		int theta = sc.nextInt();
		double x = theta * Math.PI/180;
		//System.out.println(x);
		int terms = sc.nextInt();
		double sum = 0.0;
		double error = 1e-6;
		double cond = 0.0;
		int power = 1;
		for(int i=1; i<=terms; i++) {
			double currentTerm = 0.0;
			if(i%2==0) {
				currentTerm = -Math.pow(x, power)/getFact(power);
				
			}else {
				currentTerm = Math.pow(x, power)/getFact(power);
				
			}
			power = power + 2;
			sum = sum + currentTerm;
			
		}
		System.out.println(sum);
		System.out.println("Condition is: "+ cond);

	}
	static int getFact(int n) {
		int fact =1;
		for(int i =1; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
	}

}
