package Baekjoon8;

import java.util.Scanner;

public class Q10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] arr = s.split("");
		
		int y = 0;
		for(char c='a'; c<='z'; c++) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i].charAt(0) == c) {
					System.out.printf("%d ",i);
					y = 0;
					break;
				}
				else y = -1;
			}
			if(y == -1)
				System.out.printf("-1 ");
		}
	}
}
