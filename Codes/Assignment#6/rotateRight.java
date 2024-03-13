import java.util.*;
public class rotateRight {

	public static void main(String[]args){
        int[] array = {10, 11, 12, 13};
        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++) {
        System.out.println("Integer: " + array[i] + ", Binary: " +        Integer.toBinaryString(array[i]));}
        rotateRightBy2Bits(array);
        System.out.println("\nRotated Array:");
        for (int i = 0; i < array.length; i++) {
        System.out.println("Integer: " + array[i] + ", Binary: " +  Integer.toBinaryString(array[i]));}
    }
	
    public static void rotateRightBy2Bits(int s[] ) {
        int temp = s[s.length - 1];  
        System.out.println(temp);
        for (int i = s.length - 1; i > 0; i--) {
            s[i] = s[i - 1] >>> 2 | s[i - 1] << (32 - 2);
            
        }
        s[0] = temp >>> 2 | temp << (32 - 2);
        
       }

}
