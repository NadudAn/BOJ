package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1003 {
	private static int dp[][];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()), n;
		
		for(int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			
			if(n == 0) System.out.println("1 0");
			else if(n == 1) System.out.println("0 1");
			else {
				dp = new int[2][n + 1];
				dp[0][0] = 1;		//F(0)일 때 0의 개수: 1
				dp[1][1] = 1;		//F(1)일 때 1의 개수: 1
			
				Fibonacci(n);
			
				System.out.println(dp[0][n] + " " + dp[1][n]);
			}
			
		}
	}
	
	static void Fibonacci(int n) {
		for(int i = 2; i <= n; i++) {
			dp[0][i] = dp[0][i - 1] + dp[0][i - 2];
			dp[1][i] = dp[1][i - 1] + dp[1][i - 2];
		}
	}

}
