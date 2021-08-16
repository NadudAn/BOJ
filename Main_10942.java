package study2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10942 {
	private static int table[][];
	private static int arr[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()), right;
		arr = new int[n + 1];
		table = new int[n + 1][n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j + i <= n; j++) {
				right = i + j;
				
				if(j == right) {
					table[j][right] = 1;
					continue;
				}
				
				if(i == 1) {
					if(arr[j] == arr[right]) table[j][right] = 1;
				}
				else {
					if(arr[j] == arr[right] && table[j + 1][right - 1] == 1)
						table[j][right] = 1;
				}
			}
		}
		
		int m = Integer.parseInt(br.readLine()), start, end;
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			
			bw.write(table[start][end] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}
