package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		m -= 45;
		if(m < 0) {
			m += 60;
			--h;
			if(h < 0) h += 24;
		}
		else if(m > 60) {
			m -= 60;
			++h;
			if(h > 23) h -= 24;
		}
		System.out.println(h + " " + m);
	}

}
