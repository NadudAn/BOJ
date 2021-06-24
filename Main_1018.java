package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1018 {
	private static char blackFirst[][] = {
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};
	private static char whiteFirst[][] = {
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int min = 10000, temp;
		String chess;
		char arr[][] = new char[n][m];
				
		for(int i = 0; i < n; i++) {
			chess = br.readLine();
			arr[i] = chess.toCharArray();
		}
		
		for(int i = 0; i < n - 7; i++) {
			for(int j = 0; j < m - 7; j++) {
				temp = find(i, j, arr);
				if(min > temp) min = temp;
			}
		}
		
		System.out.println(min);
	}
	
	static int find(int n, int m, char[][] arr) {
		int w_cnt = 0, b_cnt = 0, cnt;
		
		for(int i = n; i < n + 8; i++) {
			for(int j = m; j < m + 8; j++) {
				if(whiteFirst[i - n][j - m] != arr[i][j]) ++w_cnt;
				if(blackFirst[i - n][j - m] != arr[i][j]) ++b_cnt;
			}
		}
		
		if(w_cnt > b_cnt) cnt = b_cnt;
		else cnt = w_cnt;
		
		return cnt;
	}

}
