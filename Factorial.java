package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {			//백준 10872번 팩토리얼

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if(n == 0 || n == 1) {
			System.out.println(1);
			return;
		}
		
		System.out.println(Facto(n));
	}
	
	public static int Facto(int n) {
		int result;
		
		if(n == 0 || n == 1) return 1;
		
		result = n * Facto(n - 1);
		
		return result;
	}

}
