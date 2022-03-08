package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= 1; j--) {
				if(j > i) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
