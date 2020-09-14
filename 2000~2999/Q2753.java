package Baekjoon2;

import java.util.Scanner;

public class Q2753 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int year;
		
		year = input.nextInt();
		
		if((year%4 == 0 && year%100 != 0) || year%400 == 0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
