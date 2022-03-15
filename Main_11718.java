package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11718 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 100;
		
		while(n --> 0) {
			String s = br.readLine();
			
			if(s != null) System.out.println(s);
		}

	}

}
