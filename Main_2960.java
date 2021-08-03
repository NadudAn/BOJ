package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2960 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int arr[] = new int[n + 1], cnt = 0;
		
		for(int i = 2; i <= n; i++) {
			if(arr[i] == 0) {
				arr[i] = 1;
				++cnt;
				
				if(cnt == k) {
					System.out.println(i);
					return;
				}
				
				for(int j = 2; i * j <= n; j++) {
					if(arr[i * j] == 0) {
						arr[i * j] = 1;
						++cnt;
					}
					
					if(cnt == k) {
						System.out.println(i * j);
						return;
					}
				}
			}
		}
		
	}

}
