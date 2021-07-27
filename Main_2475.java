package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = 0, sum = 0;
		
		for(int i = 0; i < 5; i++) {
			t = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
			
			sum += t;
		}
		
		System.out.println(sum % 10);

	}

}
