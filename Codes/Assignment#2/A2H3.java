public class A2H3 {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		
		int first = num1/1000;
		int last = num1%10;
		System.out.println(first+last);

	}

}
