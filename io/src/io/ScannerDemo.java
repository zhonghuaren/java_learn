package io;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("next receive: ");
//		if (scan.hasNext()) {
//			String str1 = scan.next();
//			System.out.println("input data is :" + str1);
//		}
//		Scanner scan = new Scanner(System.in);
//		System.out.println("next receive: ");
//		if (scan.hasNextLine()) {
//			String str1 = scan.nextLine();
//			System.out.println("input data is :" + str1);
//		}
//		Scanner scan = new Scanner(System.in);
//		int i = 0;
//		float f = 0.0f;
//		System.out.print("input int: ");
//		if (scan.hasNextInt()) {
//			i = scan.nextInt();
//			System.out.println("input data: " + i);
//		} else {
//			System.out.println("input is not int");
//			String str = scan.nextLine();
//		}
//		System.out.print("input float: ");
//		if (scan.hasNextFloat()) {
//			f = scan.nextFloat();
//			System.out.println("float data is: " + f);
//		} else {
//			System.out.println("int is not float");
//		}
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		while(scan.hasNextDouble()) {
			double x = scan.nextDouble();
			m ++;
			sum += x;
		}
		System.out.println(m + "个数总和为 sum : " + sum);
		System.out.println("avg is : " + (sum / m));
		scan.close();
	}
}
