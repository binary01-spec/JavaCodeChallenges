package recursion;

import java.util.Scanner;

public class recursion {		
	//main method
	public static void main(String[] args) {
		//print();
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//printNto1(1, n);
		//sumOfFirstN(n);
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		int l = arr.length;
//		reverseArray(arr,0,l-1);
//		for(int i : arr) {
//			System.out.println(i);
//		}
		String str = "ABCDCBA";
		
//		boolean t = isPalindrome(str,0);
//		if(t) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
		fibonacci(31);
	}
	
	//basic recursion function
	// # here first the count = 0 
	// # we are incrementing the count by 1 for each function call
	// # while the fuction satisfy the base conditon it it returns s
	static int  count = 0;
	public static void print() {
		if(count == 5) {
			return;
		}
		System.out.println(count);
		count ++;
		//calling the function recursively
		print();
		
	}
	
	// printing name n times 
	static void printName(int i, int n) {
		if(i > n) {
			return;
		}
		System.out.println(n);
		printName(i, n - 1);
	}
	
	//printing N to 1
	static void printNto1(int i , int N) {
		if(i > N) {
			return;
		}
		System.out.println(N);
		printNto1(i,N - 1);
	}
	
	
	//sum of first N numbers 
	static int sum = 0;
	static void sumOfFirstN(int N) {
		if(N == 0) {
			System.out.println(sum);
			return;
		}
		sum += N ;
		sumOfFirstN(N-1);
		
	}
	
	//factorial of N numbers
	static int fact(int N) {
		if(N == 0){
			return 1;
		}
		return N * fact(N-1);
	}
	
	//reverse an array
	static int c=0;
	static int i = 0;
	static int[] reverseArray(int[] arr, int s, int l) {
		
		if(s < l) {
			int temp = arr[s];
			arr[s] = arr[l];
			arr[l] = temp;
			reverseArray(arr, s + 1, l -1 );
		}
		return arr;
		
	}
	
	//palindrome or not
	
	static boolean isPalindrome(String str, int i) {
			// base case 
			if(i >= str.length()/2) return true; 
			// we are comparing two chars if they are no same we are returning false 
			// but until when ? thats where the base case comes into the frame
			if(str.charAt(i) != str.charAt(str.length() - i -1)){
				return false;
			}
		// if both the condition not met we are calling the function recursively 	
		return isPalindrome(str, i + 1);
	}
	
	//fibonacci series upto Nth term
	
	static void fibonacci(int N) {
		if(N == 0) System.out.println(0);
		else {
			int[] ans = new int[N+1];
			ans[0] = 0;
			ans[1] = 1;
			
			for(int i = 2; i <= N ;i++) {
				ans[i] = ans[i-1] + ans[i-2];
			}
			for(int i : ans) {
				System.out.print(i + " ");
			
			}
		}
	}

	
	
}

