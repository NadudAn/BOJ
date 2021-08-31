package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9085 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()), n, sum = 0;
		StringTokenizer st;
		
		for(int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < n; j++)
				sum += Integer.parseInt(st.nextToken());
			
			System.out.println(sum);
			sum = 0;
		}
		
	}

}
