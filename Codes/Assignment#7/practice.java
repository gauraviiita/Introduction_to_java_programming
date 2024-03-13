
public class practice {

	public static void main(String[] args) {
		int x = 4, y=-8;
		//
		if(++x<(y=y-=7) ||(x=x+=14)>y) {
			System.out.println(x + ","+ y);
			System.out.println("Hello");
		}else {
			System.out.println((x-y) + "," + (y-x));
			System.out.println("hi");
		}

	}

}
