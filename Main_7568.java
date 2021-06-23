package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[3][n];

		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[0][i] = Integer.parseInt(st.nextToken());
			arr[1][i] = Integer.parseInt(st.nextToken());
		}

		arr = rank(n, arr);
		
		for(int i = 0; i < n; i++) {
			System.out.print((arr[2][i] + 1) + " ");
		}
	}

	static int[][] rank(int n, int[][] arr) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[0][i] < arr[0][j] && arr[1][i] < arr[1][j]) 
					arr[2][i]++;
			}
		}
		
		return arr;
	}
}
