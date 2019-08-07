package com.imooc;
import java.util.Scanner;

public class demo01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入考试成绩：");
		int score = input.nextInt();
		int count = 0;
		System.out.println("加分前的成绩:" + score);
		while (score <= 60) {
			count ++;
			score ++;			
		}
		System.out.println("加分后的成绩:" + score);
		System.out.println("加分次数" + count + "次");
	}
}
