package Baekjoon5;

import java.util.Scanner;

public class Q2523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		for(int k=1; k<n; k++) {
			for(int l=n-1; l>=k; l--) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
