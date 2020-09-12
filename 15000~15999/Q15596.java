package Baekjoon7;

import java.util.Scanner;

public class Q15596 {
	public static long sum(int[] a) {
		long ans = 0;
		for(int i=0; i<a.length; i++) {
			ans = ans + a[i];
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr;
		arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(sum(arr));
	}
}
