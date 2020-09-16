package Baekjoon4;

import java.util.Scanner;

public class Q10952 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		while(true) {
			a = input.nextInt();
			b = input.nextInt();
			
			if(a==0 && b==0)
				break;
			
			System.out.println(a+b);
		}
	}
}