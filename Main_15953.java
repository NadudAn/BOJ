package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15953 {
	private static int CF2017[] = { 500, 300, 200, 50, 30, 10 };
	private static int CF2018[] = { 512, 256, 128, 64, 32 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine()), a = 0, b = 0, m = 0, cnt = 0;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a <= 21 && a != 0)
				for(int j = 1; j <= 6; j++) {
					a -= j;
					if(a <= 0) {
						m += CF2017[j - 1];
						break;
					}
				}
			if(b <= 31 && b != 0) {
				for(int j = 1; j <= 16; j *= 2) {
					b -= j;
					if(b <= 0) {
						m += CF2018[cnt];
						break;
					}
					++cnt;
				}
				cnt = 0;
			}
			
			System.out.println(m * 10000);
			m = 0;
		}
	}

}
