import java.util.*;
public class A7Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		char ch;
		int size=0;
		do {
			System.out.println("a. Create an array of N integers ");
			System.out.println("b. Display the array elements ");
			System.out.println("c. Insert an element at specific position ");
			System.out.println("d. Delete an element at a given position ");
			System.out.println("e. Exit ");
			System.out.println("Enter your choice based on given options: ");
			ch = sc.next().charAt(0);
			switch (ch) {
			case 'a':
				System.out.println("Enter the size of an array: ");
				size = sc.nextInt();
				System.out.println("Enter the elemnets of the array: ");
				for(int i=0; i<size; i++) {
					arr[i] = sc.nextInt();
				}
				break;
			case 'b':
				System.out.print("Elements of the array are: ");
				for(int j =0; j <size; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
				break;
			case 'c':
				System.out.println("Enter the new element: ");
				int element = sc.nextInt();
				System.out.println("Enter the position: ");
				int pos = sc.nextInt();
				for(int k= size; k>=pos; k--) {
					arr[k] = arr[k-1];
				}
				arr[pos-1] = element; 
				size++;
				System.out.println("Element inserted succussfully..");
				break;
			case 'd':
				System.out.println("Delete an element at a given position");
				System.out.println("Enter the position: ");
				int pos1 = sc.nextInt();
				for(int a = pos1-1; a<size-1; a++) {
					arr[a] = arr[a+1];
				}
				size--;
				System.out.println("Element deleted from the array..");
				break;
			case 'e':
				System.out.println("Exit..");
				break;	
			}
		}while(ch != 'e');
	}
}
