package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11719 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 100;
		String t;
		
		while(n --> 0) {
			t = br.readLine();
			
			if(t != null) System.out.println(t);
		}

	}

}
