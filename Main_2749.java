package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2749 {
	private static int dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		if(n <= 2) System.out.println(1);
		else {
			int p = 15 * 1000000 / 10;	//피보나치의 주기
			dp = new int[p + 1];
			dp[1] = 1;
			
			for(int i = 2; i < p; i++) 
				dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000;
			
			System.out.println(dp[(int) (n % p)]);
		}
		
	}

}
