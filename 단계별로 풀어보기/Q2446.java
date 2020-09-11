package Baekjoon5;

import java.util.Scanner;

public class Q2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=n; i>0; i--) {
			for(int j=0; j<n-i; j++) {
				System.out.printf(" ");
			}
			for(int k=0; k<i*2-1; k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		for(int i=1; i<n+1; i++) {
			if(i==1)
				continue;
			
			for(int j=n-i; j>0; j--) {
				System.out.printf(" ");
			}
			for(int k=i*2-1; k>0; k--) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
