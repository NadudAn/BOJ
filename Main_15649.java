package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15649 {
	static int N, M;
	static boolean visit[];
	static int arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visit = new boolean[N];
		arr = new int[M];
		dfs(N, M, 0);

	}
	
	public static void dfs(int N, int M, int depth) {
		if(depth == M) {
			for(int val : arr) 
				System.out.print(val + " ");
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}

}
