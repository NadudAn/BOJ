package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2527 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int x1, x2, y1, y2, p1, p2, q1, q2;
		
		for(int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			p1 = Integer.parseInt(st.nextToken());
			q1 = Integer.parseInt(st.nextToken());
			p2 = Integer.parseInt(st.nextToken());
			q2 = Integer.parseInt(st.nextToken());
			
			if((x2 == p1 && y2 == q1) || (x1 == p2 && y2 == q1) 
					|| (x2 == p1 && y1 == q2) || (x1 == p2 && y1 == q2)) System.out.println("c");
			else if(x2 == p1 || x1 == p2 || y1 == q2 || y2 == q1) System.out.println("b");
			else if(x2 < p1 || p2 < x1 || y2 < q1 || q2 < y1) System.out.println("d");
			else System.out.println("a");
			
		}

	}

}
