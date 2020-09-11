package Baekjoon6;

import java.util.Scanner;

public class Q8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int j=0; j<n; j++) {
			String str = sc.nextLine();
			String[] arr;
			arr = str.split("");
			
			int[] score;
			score = new int[arr.length];
			int sum = 0;
			
			for(int i=0; i<arr.length; i++) {
				if(i == 0) {
					if(arr[i].equals("O")) {
						score[0] = 1;
						sum = 1;
						continue;
					}
				}
				
				if(arr[i].equals("O")) {
					score[i] = score[i-1] + 1;
				}
				else
					score[i] = 0;
				
				sum = sum + score[i];
			}
			
			System.out.println(sum);
		}
	}
}
