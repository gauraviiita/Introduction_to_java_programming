import java.util.*;
public class A7Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] Arr = new int[101];
		 System.out.print("Enter the integers between 1 and 100 (end with 0): "); 
		 int num;
		 do { 
			 num = sc.nextInt(); 
			 Arr[num] = Arr[num] + 1;
		 } while (num != 0);
		 
		 for (int i = 1; i <= 100; i++) { 
			 if (Arr[i] > 0) {
				 System.out.println(i + " occurs " + Arr[i] + (Arr[i] > 1 ? " times" : " time")); 
			 }
		}
		 
	}

}
