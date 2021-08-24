package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10039 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, n;
		
		for(int i = 0; i < 5; i++) {
			n = Integer.parseInt(br.readLine());
			
			if(n < 40) sum += 40;
			else sum += n;
		}

		System.out.println(sum / 5);

	}

}
