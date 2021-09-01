package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2525 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());
		
		m += n;
		h += m / 60;
		m %= 60;
		
		if(h > 23) h %= 24;
		
		System.out.println(h + " " + m);

	}

}
