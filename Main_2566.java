package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2566 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = 0, max = 0, a = 0, b = 0;
		
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
		
			for(int j = 0; j < 9; j++) {
				t = Integer.parseInt(st.nextToken());

				if(t > max) {
					max = t;
					a = i + 1;
					b = j + 1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(a + " " + b);

	}

}
