package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10950 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine()), sum = 0;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			sum = Integer.parseInt(st.nextToken());
			sum += Integer.parseInt(st.nextToken());
			
			System.out.println(sum);
			sum = 0;
			
		}
	}

}
