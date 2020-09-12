package Baekjoon7;

import java.util.Scanner;

public class Q1065 {
	public static int han(int num) {	
		if(num%10 - (num%100 - num%10)/10 == (num%100 - num%10)/10 - (num - num%100)/100)
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n<100) {
			System.out.println(n);
			return;
		}
		
		int HanNum = 99;
		for(int i=100; i<=n; i++) {
			if(han(i) == 1) {
				HanNum++;
			}
		}
		
		System.out.println(HanNum);
	}
}
