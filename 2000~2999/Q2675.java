package Baekjoon8;

import java.util.Scanner;

public class Q2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int j=0; j<t; j++) {
			int r = sc.nextInt();
			String s = sc.next();
			
			for(int i=0; i<s.length(); i++) {
				for(int k=0; k<r; k++)
					System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}
}
