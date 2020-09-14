package Baekjoon2;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int h,m;
		
		h = input.nextInt();
		m = input.nextInt();
		
		if(m >= 45) {
			m = m - 45;
		}
		else {
			if(h == 0)
				h = 23;
			else
				h = h - 1;
			
			m = 60 - (45-m);
		}
	
		System.out.printf("%d %d",h,m);
	}
}
