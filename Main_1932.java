package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1932 {
	private static int dp[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[n + 1][n + 1];
		int max = 0;
		
		dp = new int[n + 1][n + 1];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= i; j++) 
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		dp[1][1] = arr[1][1];
		
		for(int i = 2; i <= n; i++) 
			for(int j = 1; j <= i; j++) 
				dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + arr[i][j];
		
		max = dp[n][1];
		for(int i = 1; i <= n; i++)
			max = Math.max(dp[n][i], max);
		
		System.out.println(max);
	}

}
