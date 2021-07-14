package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1904 {
	private static int dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if(n == 1) {
			System.out.println(1);
			return;
		}
		if(n == 2) {
			System.out.println(2);
			return;
		}
		dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
	
		for(int i = 3; i <= n; i++) 
			dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
		
		System.out.println(dp[n]);
	}

}
