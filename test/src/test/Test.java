package test;
import java.math.*;

public class Test {
	public static void main(String[] args) {
//		String s1 = "runoob";
//		String s2 = "runoob";
//		System.out.println("s1 == s2 is:" + s1 == s2);
		
//		int x = 3;
//		int y = 1;
//		if (x == y) {
//			System.out.println("n eq");
//		}
		
//		int[] myArray = {1, 3, 5};
//		int myArray = {1, 3, 4};
		
//		StringBuffer a = new StringBuffer("Runoob");
//        StringBuffer b = new StringBuffer("Google");
//        a.delete(1,3);
//        a.append(b);
//        System.out.println(a);
		
//		System.out.println(Math.round(3.7));
		
		 int[] myArray = {1, 2, 3, 4, 5};
	        LowHighSwap.doIt(myArray);
	        for (int i = 0; i < myArray.length; i++)
	        {
	            System.out.print(myArray[i] + " ");
	        }
	}
}

class LowHighSwap
{
    static void doIt( int[] z )
    {
//        int temp = z[z.length-1];
//        z[z.length-1] = z[0];
//        z[0] = temp;
    	int[] A = z;
    	A[0] = 99;
    }
}
