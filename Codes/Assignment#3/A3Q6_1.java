import java.util.*;
public class A3Q6_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of units: ");
		double units = sc.nextDouble();
		
		double amt;
		if(units <=50) {
			amt = units*3;
		}else if(units > 50 && units <=200) {
			amt = 50*3 + (units-50)*4.80;
		}else if(units > 200 && units <= 400) {
			amt = 50*3 + 150*4.80 + (units-200)*5.80;
		}else {
			amt = 50*3 + 150*4.80 + 200*5.80 + (units-400)*6.20;
		}
		
		System.out.println("Payable amount is: "+ amt);
		System.out.println("Do you want to pay online(y/n): ");
		char input = sc.next().charAt(0);
		if(input=='y'|| input=='Y') {
			System.out.println("Total amount: "+amt);
			System.out.println("Discount: "+ amt*0.03);
			System.out.println("Amount payable: "+ (amt - (amt*0.03)));
		}else {
			System.out.println("Total amount: "+amt);
			System.out.println("Discount: "+ 0.0);
			System.out.println("Amount payable: "+ amt);
		}

	}

}
