package Baekjoon6;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String[] arr;
		arr = new String[10];
		
		for(int i=0; i<10; i++) {
			num = sc.nextInt();
			arr[i] = Integer.toString(num % 42);
		}
		
		ArrayList<String> arrayList = new ArrayList<>();

        for(String item : arr){
            if(!arrayList.contains(item))
                arrayList.add(item);
        }
        
        System.out.println(arrayList.size());
	}
}
