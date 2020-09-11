package Baekjoon6;

import java.util.Scanner;

public class Q2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int max_index = 0;
		int num = 0;
		
		for(int i=1; i<=9; i++) {
			if(i == 0)
				max = sc.nextInt();
			
			else{
				num = sc.nextInt();

				if(num > max) {
					max = num;
					max_index = i;
				}
			}
		}
		
		System.out.printf("%d\n%d", max, max_index);
	}
}
