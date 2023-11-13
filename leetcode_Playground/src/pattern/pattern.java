package pattern;

import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int  i = 1; i <= n; i++) {
			
			for(int j = 0; j < n-1;j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < n ;j ++) {
				System.out.print("*");
			}
			for(int j = 0; j < n-1;j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
			
		
	}

}
