import java.util.*;
public class A3Q6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of units consumed: ");
		double units = sc.nextDouble();
		System.out.println("Do you want to pay online(y/n): ");
		char response = sc.next().charAt(0);
		
		if(response == 'y' || response == 'Y' ) {
			if(units <= 50){
				double pay = units * 3;
				double discount = pay * 0.03;
				double price = pay - discount;
				System.out.println("Total amount: "+ pay);
				System.out.println("Discount: "+ discount);
				System.out.println("Amount payable: "+ price );
			}else if(units <= 200){
				double pay = units * 4.80;
				double discount = pay * 0.03;
				double price = pay - discount;
				System.out.println("Total amount: "+ pay);
				System.out.println("Discount: "+ discount);
				System.out.println("Amount payable: "+ price );
			}else if(units <= 400) {
				double pay = units*5.80;
				double discount = pay * 0.03;
				double price = pay - discount;
				System.out.println("Total amount: "+ pay);
				System.out.println("Discount: "+ discount);
				System.out.println("Amount payable: "+ price );
				
			}else if(units > 400) {
				double pay = units*6.20;
				double discount = pay * 0.03;
				double price = pay - discount;
				System.out.println("Total amount: "+ pay);
				System.out.println("Discount: "+ discount);
				System.out.println("Amount payable: "+ price );
			}
		}else {
			if(units <= 50){
				double pay = units * 3;
				
				System.out.println("Total amount: "+ pay);
				System.out.println("Amount payable: "+ pay );
			}else if(units <= 200){
				double pay = units * 4.80;
				System.out.println("Total amount: "+ pay);
				System.out.println("Amount payable: "+ pay );
						
			}else if(units <= 400) {
				double pay = units*5.80;
				System.out.println("Total amount: "+ pay);
				System.out.println("Amount payable: "+ pay );
			}else if(units > 400) {
				double pay = units*6.20;
				System.out.println("Total amount: "+ pay);
				System.out.println("Amount payable: "+ pay );
			}
		}
		
	}
}
