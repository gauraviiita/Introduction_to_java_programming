import java.util.*;
public class A7Q3 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int [] Arr = new int[10];
		System.out.println("Enter the elements of this array: ");
		for(int i=0; i<10; i++) {
			Arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched: ");
		int num = sc.nextInt();
		int count=0;
		
		for(int i=0; i<10; i++) {
			if(Arr[i] == num) {
				count++;
			}
		}
		System.out.println(count + " times it appears in the array ");
	}
}
