package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String m = br.readLine();
		char arr[] = m.toCharArray();
		
		for(int i = arr.length - 1; i >= 0; i--) 
			System.out.println(n * (arr[i] - '0'));
		
		System.out.println(n * Integer.parseInt(m));
	}

}
