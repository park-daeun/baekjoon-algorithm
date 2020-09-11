//Backjoon step1 - °ö¼À

package Baekjoon1;

import java.util.Scanner;

public class Q2588 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d",
				a*(b%10),a*((b%100)-(b%10))/10,a*(b-b%100)/100,a*b);	
	}
}
