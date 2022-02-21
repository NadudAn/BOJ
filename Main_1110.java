package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1110 {
	static int N;
	static int N2;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		N2 = N;
		cycle();
		System.out.println(cnt);
		
	}
	
	public static void cycle() {
		int a = N2 / 10;
		int b = N2 % 10;
		N2 = b * 10 + ((a + b) % 10);
		cnt++;
		
		if(N2 != N) cycle();
	}

}
