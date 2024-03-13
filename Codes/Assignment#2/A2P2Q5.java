
public class A2P2Q5 {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		
		int min = Math.min(Math.min(x, y), z);
		int max = Math.max(Math.max(x, y), z);
		int mid =  x+y+z - min -max;
		System.out.println("Assending order"+ min +" "+ mid+ " "+ max);
		
		

	}

}
