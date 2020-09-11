package Baekjoon6;

import java.util.Scanner;

public class Q4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int j=0; j<t; j++) {
			int n = sc.nextInt();
			
			int[] arr;
			arr = new int[n];
			double sum = 0;
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
				sum = sum + arr[i];
			}
			
			double over = 0;
			for(int i=0; i<n; i++) {
				if(arr[i] > sum/n)
					over++;
			}
			
			System.out.printf(String.format("%.3f", over/n*100));
			System.out.println("%");
		}
	}
}
