package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2747 {
	private static int dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if(n == 0) System.out.println(0);
		else if(n == 1) System.out.println(1);
		else {
			dp = new int[n + 1];
			dp[1] = 1;
			
			for(int i = 2; i <= n; i++)
				dp[i] = dp[i - 1] + dp[i - 2];
			
			System.out.println(dp[n]);
		}

	}

}