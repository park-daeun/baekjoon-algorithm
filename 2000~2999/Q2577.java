package Baekjoon6;

import java.util.Scanner;

public class Q2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String s = Integer.toString(a*b*c);
		String[] arr;
		
		arr = s.split("");
		int index = 0;
		int num = 0;
		
		for(int i=0; i<=9; i++) {
			index = 0;
			for(int j=0; j<arr.length; j++) {
				num = Integer.parseInt(arr[j]);
				if(num == i)
					index++;
			}
			System.out.println(index);
		}
	}
}
