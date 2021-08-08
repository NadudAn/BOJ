package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2455 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = 0, sum = 0;
		
		for(int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			
			sum -= Integer.parseInt(st.nextToken());
			sum += Integer.parseInt(st.nextToken());
			
			if(sum > max) max = sum;
		}

		System.out.println(max);
	}

}
