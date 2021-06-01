package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldbachNumber {			//백준 9020번 골드바흐의 추측

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), k;
		
		for(int i = 0; i < n; i++) {
			k = Integer.parseInt(br.readLine());
			
			for(int j = (int)(k / 2); j >= 2; j--) {
				if(isPrime(j) && isPrime(k - j)) {
					if(j <= (k - j)) {
						System.out.println(j + " " + (k - j));
						break;
					}
					else {
						System.out.println((k - j) + " " + j);
						break;
					}
				}
			}
		}
		
	}
	
	public static boolean isPrime(int n) {
		if(n <= 1) return false;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		
		return true;
	}

}
