package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11052 {
	private static long dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		dp = new long[n + 1];
		int arr[] = new int[n + 1];
		
		for(int i = 1; i <= n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());

		for(int i = 1; i <= n; i++) 
			for(int j = 1; j <= i; j++) 
				dp[i] = Math.max(dp[i], dp[i - j] + arr[j]);
		
		System.out.println(dp[n]);

	}

}
