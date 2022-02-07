package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13305 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		long arr[][] = new long[2][n];
		long cost = 0, cnt;
		
		n--;
		for(int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Long.parseLong(st.nextToken());
			}
			n++;
		}
		n--;
		
		arr[0][n - 1] = 0;
		cnt = arr[1][0];
		for(int i = 1; i < n; i++) {
			if(cnt > arr[1][i]) cnt = arr[1][i];
			else arr[1][i] = cnt;
		}
		
		for(int i = 0; i < n; i++) 
			cost += arr[0][i] * arr[1][i];
		
		System.out.println(cost);

	}

}
