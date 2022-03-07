package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_17094 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), t = 0, e = 0;
		String s = br.readLine();
		
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == '2') t++;
			else e++;
		}
		
		if(t > e) System.out.println("2");
		else if(e > t) System.out.println("e");
		else System.out.println("yee");

	}

}
