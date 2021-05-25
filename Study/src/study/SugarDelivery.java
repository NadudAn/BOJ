package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SugarDelivery {		//백준 2839번 설탕 배달

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		if(n % 5 == 0) cnt = n / 5;
		else if (n % 5 == 1 || n % 5 == 3) cnt = n / 5 + 1;
		else if (n % 5 == 2 || n % 5 == 4) cnt = n / 5 + 2;
		
		if(n == 4 || n == 7) System.out.println(-1);
		else System.out.println(cnt);
	}

}
