package Baekjoon8;

import java.util.Scanner;

public class Q1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int[] arr;
		arr = new int[27];
		
		int j = 1;
		for(char c='a'; c<='z'; c++) {
			for(int i=0; i<s.length(); i++) {
				if(Character.toUpperCase(c) == Character.toUpperCase(s.charAt(i))) {
					arr[j]++;
				}
			}
			j++;
		}
		
		int max = 0;
		int max_index = 0;
		int same_max = 0;
		for(int k=0; k<arr.length; k++) {
			if(max!=0 && max == arr[k])
				same_max = -1;
			if(max < arr[k]) {
				max = arr[k];
				max_index = k;
				same_max = 0;
			}
		}
		
		if(same_max == -1) {
			System.out.println("?");
			return;
		}
		
		System.out.println((char) (max_index+64));
	}
}
