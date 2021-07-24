package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int l = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int n = l * p, k;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 5; i++) {
			k = Integer.parseInt(st.nextToken());
			System.out.print((k - n) + " ");
		}
	}

}
