package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WantToBeAWomensPresident {		//백준 2775번 부녀회장이 될테야

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, k, bn, bk;
		long numerator, denominator;
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			
			bn = n + k;
			bk = n - 1;
			
			numerator = 1;
			denominator = 1;
			
			for (long j = 0; j < bk; j++) {
				numerator *= (bn - j);
				denominator *= (bk - j);
			}
			System.out.println(numerator / denominator);
		}
	}
}
