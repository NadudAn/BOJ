package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_1764 {
	static ArrayList<String> al;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String arr[] = new String[n];
		
		al = new ArrayList<String>();
		
		for(int i = 0; i < n; i++) 
			arr[i] = br.readLine();
		
		Arrays.sort(arr);
		String t;

		for(int i = 0; i < m; i++) {
			t = br.readLine();
			
			if(Arrays.binarySearch(arr, t) >= 0) al.add(t);
		}
		
		Collections.sort(al);
		
		System.out.println(al.size());
		for(String i : al) 
			System.out.println(i);
		
	}

}
