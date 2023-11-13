package leetcode_Playground;

public class Main {

	public static void main(String[] args) {
		int a = 5;
		int ans = 1;
		for(int i = 1; i <= a; i++) {
			ans *= i;
		}
		System.out.println(ans);
	}

}
