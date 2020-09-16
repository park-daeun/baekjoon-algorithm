package Baekjoon4;

import java.util.Scanner;

public class Q1110 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int i = 0;
		int new_num = num;
		int sum = 0;
		
		do {
			if(new_num < 10) {
				sum = new_num;
				new_num = sum*10 + sum;
			}
			else {
				sum = (new_num % 10) + (new_num - (new_num % 10))/10;
				new_num = (new_num % 10)*10 + sum % 10;
			}

			i++;
		
		} while(new_num != num);
			
		
		System.out.println(i);
	}
}
