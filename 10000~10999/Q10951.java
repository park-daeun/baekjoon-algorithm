package Baekjoon4;

import java.util.Scanner;

public class Q10951 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			try {
				String a_and_b = input.nextLine();
				String ab[] = a_and_b.split(" ");
				
				int n_a = Integer.parseInt(ab[0]);
				int n_b = Integer.parseInt(ab[1]);
				
				System.out.println(n_a+n_b);
			}
			catch(Exception e) {
				break;
			}
		}
	}
}