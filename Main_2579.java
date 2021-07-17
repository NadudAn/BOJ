package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2579 {
	private static int dp[][];

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()), n;
		dp = new int[t + 1][3];
		
		for(int i = 1; i <= t; i++) {
			n = Integer.parseInt(br.readLine());
			
			dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]);
			dp[i][1] = dp[i - 1][0] + n;
			dp[i][2] = dp[i - 1][1] + n;
		}
		
		System.out.println(Math.max(dp[t][1], dp[t][2]));
	}

}
