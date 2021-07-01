package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char arr[] = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if((i + 1) % 10 == 0 && i != 0) System.out.println();
		}
	}

}
