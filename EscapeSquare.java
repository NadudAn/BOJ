package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EscapeSquare {				//백준 1085번 직사각형에서 탈출

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int w, h, min;
		int arr[] = new int[4];
		arr[0] = Integer.parseInt(st.nextToken());		//x
		arr[1] = Integer.parseInt(st.nextToken());		//y
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		arr[2] = w - arr[0];
		arr[3] = h - arr[1];
		
		min = arr[0];
		for(int i = 1; i < 4; i++) {
			if(min > arr[i]) min = arr[i];
		}
		
		System.out.println(min);
	}

}
