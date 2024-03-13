import java.util.*;
public class delete {

	public static void main(String[] args) {
		int a[] = {10, 11, 12, 13};
		int b[] = new int[a.length];
		int k=a[0]<<30;
		int p = a[1]>>2;
		int m = k/p;
		a[2] = m;
		k = a[2]<<30;
		p = a[3]>>2;
		m = k/p;
		a[3] = m;
		
		k = a[a.length-1] <<30;
		p = a[0]>>2;
		m = k/p;
		a[0] = m;
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
