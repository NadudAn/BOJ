package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0, cnt = 0, n;
		
		for(int i = 1; i <= 9; i++) {
			n = Integer.parseInt(br.readLine());
			
			if(n > max) {
				max = n;
				cnt = i;
			}
		}
		
		System.out.println(max + "\n" + cnt);

	}

}
