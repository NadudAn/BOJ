package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String s = "";
		
		for(int i = 0; i < n; i++) {
			s = br.readLine();
			for(int j = 0; j < 25; j++) 
				s = s.replace("()", "");
			
			if(s.equals("")) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
