import java.util.Scanner;

public class Q10039 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		
		for(int i=0; i<5; i++) {
			int n = sc.nextInt();
			
			if(n < 40)
				n = 40;
			
			sum = sum + n;
		}
		
		System.out.println(sum/5);
	}
}