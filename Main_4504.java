package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4504 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		while(true) {
			int t = Integer.parseInt(br.readLine());
			
			if(t == 0) break;
			
			if(t % n == 0) 
				System.out.println(t + " is a multiple of " + n + ".");
			else System.out.println(t + " is NOT a multiple of " + n + ".");
		}

	}

}
