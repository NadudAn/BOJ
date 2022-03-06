package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3034 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int t;
		
		while(n --> 0) {
			t = Integer.parseInt(br.readLine());
			
			if(t <= h || t <= w || t * t <= h * h + w * w) System.out.println("DA");
			else System.out.println("NE");
		}

	}

}
