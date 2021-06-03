package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FourthDot {		// 백준 3009번 네 번째 점

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int x[] = new int[4];
		int y[] = new int[4];
		int cnt1 = 0, cnt2 = 1;
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < 3; i++) {
			if(x[cnt1] == x[cnt2]) {
				x[cnt1] = 0;
				x[cnt2] = 0;
			}
			if(y[cnt1] == y[cnt2]) {
				y[cnt1] = 0;
				y[cnt2] = 0;
			}
			
			++cnt1;
			if(cnt2 == 2) cnt2 = 0;
			else ++cnt2;
		}
		
		for(int i = 0; i < 3; i++) {
			if(x[i] != 0) x[3] = x[i];
			if(y[i] != 0) y[3] = y[i];
		}
		
		System.out.println(x[3] + " " + y[3]);
	}

}
