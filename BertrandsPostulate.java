package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BertrandsPostulate {			//백준 4948번 베르트랑 공준

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt;
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			cnt = 0;
			for(int i = n + 1; i <= 2 * n; i++) {
				if(IsPrime(i)) ++cnt;
			}
			
			System.out.println(cnt);
		}

	}
	
	public static boolean IsPrime(int n) {
		if(n <= 1) return false;

		for(int i = 2; i <= Math.sqrt(n); i++) 
			if(n % i == 0) return false;

		return true;
	}

}
