package Baekjoon5;

import java.util.Scanner;

public class Q10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int second = 0;
		
		if((a>=b && a<=c) || (a>=c && a<=b))
			second = a;
		else if((b>=a && b<=c) || (b>=c && b<=a))
			second = b;
		else
			second = c;
		
		System.out.println(second);
	}
}
