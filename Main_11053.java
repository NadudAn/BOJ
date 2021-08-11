package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11053 {
	private static int dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		int max = -1;
		
		for(int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		dp = new int[n];
		
		for(int i = 0; i < n; i++) {
			dp[i] = 1;
			
			for(int j = 0; j < i; j++) 
				if(arr[j] < arr[i] && dp[i] < dp[j] + 1)
					dp[i] = dp[j] + 1;
		}
		
		for(int i = 0; i < n; i++) 
			max = dp[i] > max ? dp[i] : max;
		
		System.out.println(max);

	}

}
