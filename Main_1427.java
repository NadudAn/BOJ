package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		char arr[] = n.toCharArray();
		Integer arr2[] = new Integer[arr.length];
		
		for(int i = 0; i < arr.length; i++) 
			arr2[i] = arr[i] - '0';
		
		Arrays.sort(arr2, Collections.reverseOrder());
		
		for(int i: arr2) System.out.print(i);
	}

}
