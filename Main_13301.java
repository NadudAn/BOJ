package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_13301 {
	private static long dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		dp = new long[n + 1];
		dp[1] = 1;
		
		for(int i = 2; i <= n; i++) 
			dp[i] = dp[i - 1] + dp[i - 2];
		
		System.out.println(dp[n] * 2 + (dp[n] + dp[n - 1]) * 2);
		
	}

}
