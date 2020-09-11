//Backjoon step1 - 사칙연산

package Baekjoon1;

import java.util.Scanner;

public class Q10869 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d\n%d",
				a+b,a-b,a*b,a/b,a%b);
	}
}
