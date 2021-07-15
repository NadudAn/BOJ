package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9461 {
	private static long dp[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n;
		
		for(int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			if(n >= 1 && n <= 3) System.out.println(1);
			else {
				dp = new long[n + 1];
				dp[1] = 1;
				dp[2] = 1;
				dp[3] = 1;
				
				for(int j = 4; j <= n; j++) 
					dp[j] = dp[j - 2] + dp[j - 3];
				
				System.out.println(dp[n]);
			}
			
		}
	}

}
