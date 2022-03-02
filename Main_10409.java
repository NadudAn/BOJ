package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10409 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		int sum = 0, cnt = 0, t;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			t = Integer.parseInt(st.nextToken());
			
			if(sum + t > max) break;
			else {
				sum += t;
				cnt++;
				
			}
			
		}
		
		System.out.println(cnt);

	}

}
