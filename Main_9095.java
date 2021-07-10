package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9095 {
	private static int dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n;
		
		for(int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			dp = new int[n + 1];
			dp[0] = 1;
			
			for(int j = 1; j <= n; j++) {
				if(j- 1 >= 0) dp[j] += dp[j - 1];
				if(j - 2 >= 0) dp[j] += dp[j - 2];
				if(j - 3 >= 0) dp[j] += dp[j - 3];
			}
			System.out.println(dp[n]);
		}
	}

}
