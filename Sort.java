package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort {				//백준 2750번 수 정렬하기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		for(int i: arr) System.out.println(i);
	}

}
