package Baekjoon3;

import java.io.*;

public class Q15552 {
	public static void main(String[] args) {
		
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));			
			BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int t = Integer.parseInt(input.readLine());
			
			for(int i=0; i<t; i++) {
				String[] ab = input.readLine().split(" ");
				
				long sum = Long.valueOf(ab[0]) + Long.valueOf(ab[1]);
				String s_sum = Long.toString(sum);
						
				output.write(s_sum);
				output.newLine();
			}
			
			input.close();	
			output.flush();
			output.close();
		}
		catch (IOException e){
            e.printStackTrace();
        }       
		
	}
}
