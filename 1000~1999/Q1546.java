package Baekjoon6;

import java.util.Scanner;

public class Q1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] arr;
		arr = new double[n];
		double max = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i])
				max = arr[i];
		}
		
		double sum = 0;
		for(int j=0; j<n; j++) {
			sum = sum + arr[j]/max*100;
		}
		
		System.out.println(sum/n);
	}
}
