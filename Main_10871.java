package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken()), a;
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			a = Integer.parseInt(st.nextToken());
			
			if(a < x) System.out.print(a + " ");
		}
		System.out.println();
	}

}
