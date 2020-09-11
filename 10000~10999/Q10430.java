//Backjoon step1 - ³ª¸ÓÁö

package Baekjoon1;

import java.util.Scanner;

public class Q10430 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d",
				(a+b)%c,((a%c)+(b%c))%c, (a*b)%c, ((a%c)*(b%c))%c);
	}
}