package Baekjoon5;

import java.util.Scanner;

public class Q10996 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n; k++) {
				if(k%2 == 1)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
			for(int j=1; j<=n; j++) {
				if(j%2 == 1)
					System.out.printf(" ");
				else
					System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
