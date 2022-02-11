package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_1026 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1;
		StringTokenizer st2;
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		Integer b[] = new Integer[n];
		int sum = 0;
		
		st1 = new StringTokenizer(br.readLine());
		st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st1.nextToken());
			b[i] = Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) 
			sum += a[i] * b[i];
		
		System.out.println(sum);
		
	}

}
