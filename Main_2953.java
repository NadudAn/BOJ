package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int sum[] = new int[5], index = 0, max = 0;
		
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 4; j++) 
				sum[i] += Integer.parseInt(st.nextToken());
			
			if(max < sum[i]) {
				max = sum[i];
				index = i;
			}
		}
		
		System.out.println((index + 1) + " " + sum[index]);

	}

}
