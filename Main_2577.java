package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		char arr[];
		int arr2[] = new int[10];
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 2; i++) 
			num *= Integer.parseInt(br.readLine());
		
		s = String.valueOf(num);
		arr = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++) ++arr2[arr[i] - '0'];
		
		for(int i = 0; i < 10; i++) System.out.println(arr2[i]);
	}

}
