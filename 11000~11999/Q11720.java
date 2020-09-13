package Baekjoon8;

import java.util.Scanner;

public class Q11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		String[] arr = s.split("");
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum = sum + Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
	}
}
