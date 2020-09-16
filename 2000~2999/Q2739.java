package Baekjoon3;

import java.util.Scanner;

public class Q2739 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
	}
}
