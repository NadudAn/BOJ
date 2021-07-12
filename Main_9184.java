package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9184 {
	static int dp[][][] = new int[21][21][21];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a = 0, b = 0, c = 0;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			if(a == -1 && b == -1 && c == -1) break;
			
			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + dp(a, b, c));
			
		}
	}
	
	static int dp(int a, int b, int c) {
		if(a <= 0 || b <= 0 || c <= 0) return 1;
		if(a > 20 || b > 20 || c > 20) return dp(20, 20, 20);
		if(dp[a][b][c] != 0) return dp[a][b][c];
		if(a < b && b < c) 
			dp[a][b][c] = dp(a, b, c - 1) + dp(a, b - 1, c - 1) - dp(a, b - 1, c);
		else 
			dp[a][b][c] = dp(a - 1, b, c) + dp(a - 1, b - 1, c) + dp(a - 1, b, c - 1) - dp(a - 1, b - 1, c - 1);
		
		return dp[a][b][c];
	}
	
}
