package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1149 {
	private static int R[];
	private static int G[];
	private static int B[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());

		R = new int[n + 1];
		G = new int[n + 1];
		B = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			
			R[i] = Integer.parseInt(st.nextToken());
			G[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 2 ; i <= n; i++) {
			R[i] += Math.min(G[i - 1], B[i - 1]);
			G[i] += Math.min(R[i - 1], B[i - 1]);
			B[i] += Math.min(R[i - 1], G[i - 1]);
		}
		
		System.out.println(Math.min(Math.min(R[n], G[n]), B[n]));
		
	}

}
