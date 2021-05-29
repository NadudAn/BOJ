package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FactorizationInPrimeFactors {		//백준 11653번 소인수분해
												// 제출할 땐 Main으로 바꿀 것.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), cnt = 2;
		
		while(true) {
			if(n % cnt == 0) {
				n /= cnt;
				System.out.println(cnt);
				cnt = 2;
			}
			else ++cnt;
			if(n <= 1) break;
		}
	}
}
