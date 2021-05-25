package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlyMeToTheAlphaCentauri {		//백준 1011번 Fly me to the Alpha Centauri

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine()), x, y, cnt, dis, max_d;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			dis = y - x;
			max_d = (int) Math.sqrt(dis);
			
			if(max_d == Math.sqrt(dis)) cnt = max_d * 2 - 1;
			else if(dis <= max_d * max_d + max_d) cnt = max_d * 2;
			else cnt = max_d * 2 + 1;
			
			System.out.println(cnt);
		}
	}

}
