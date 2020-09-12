package Baekjoon7;

import java.util.Arrays;

public class Q4673 {
	public static int d(int n) {
		int selfnum = 0;
		String[] divide;
		
		String s = Integer.toString(n);
		divide = s.split("");
		
		int sum = 0;
		for(int i=0; i<s.length(); i++)
			sum = sum + Integer.parseInt(divide[i]);
		
		selfnum = n + sum;
		
		return selfnum;
	}
	
	public static void main(String[] args) {
		int[] arr;
		arr = new int[10000];
		for(int i=0; i<10000; i++)
			arr[i] = d(i);
		
		Arrays.sort(arr);
        
		int k = 1;
		int j = 1;
		while(k<10000) {
			if(arr[j] == arr[j-1]) {
				j++;
				continue;
			}
			
			if(k == arr[j])
				j++;
			else
				System.out.println(k);
			k++;
		}
	}
}
