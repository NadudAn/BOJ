package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4299 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		/*
		 * a + b = X
		 * a - b = Y
		 * 2a = X + Y
		 * 2b = X - Y
		 * a = (X + Y) / 2
		 * b = (X - Y) / 2
		 */
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		if(x < y) System.out.println(-1);
		else {
			int a = (x + y) / 2;
			int b = (x - y) / 2;
			
			if(a + b == x && a - b == y) 
				System.out.println(a + " " + b);
			else System.out.println(-1);	
		}

	}

}
