package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_7795 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int cnt;
		
		while(t --> 0) {
			cnt = 0;
			
			st = new StringTokenizer(br.readLine());
			int a[] = new int[Integer.parseInt(st.nextToken())];
			int b[] = new int[Integer.parseInt(st.nextToken())];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < a.length; i++) 
				a[i] = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < b.length; i++)
				b[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			for(int a1 : a) 
				for(int b1 : b) {
					if(a1 > b1) cnt++;
					else break;
				}
			
			System.out.println(cnt);
		}

	}

}
