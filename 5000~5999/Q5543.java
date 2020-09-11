package Baekjoon5;

import java.util.Scanner;

public class Q5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int low_b = 0;
		int low_s = 0;
		
		for(int i=0; i<3; i++) {
			int burger = sc.nextInt();
			if(i==0)
				low_b = burger;
			else {
				if(low_b > burger)
					low_b = burger;
			}
		}
		
		for(int j=0; j<2; j++) {
			int soda = sc.nextInt();
			if(j==0)
				low_s = soda;
			else {
				if(low_s > soda)
					low_s = soda;
			}
		}
		
		System.out.println(low_b+low_s-50);
	}
}
