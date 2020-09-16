package Baekjoon3;

import java.util.Scanner;

public class Q10950 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for(int i=0; i<t; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			System.out.printf("%d\n", a+b);
		}
	}
}