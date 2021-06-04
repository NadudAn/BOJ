package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RightAngledTriangle2 {			//백준 4153번 직각삼각형
											//﻿sort 함수를 이용해 배열을 정렬한 후 피타고라스의 공식 사용
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int arr[] = new int[3];
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 3; i++) 
				arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[0] == 0 && arr[1] == 0 & arr[2] == 0) return;
			
			Arrays.sort(arr);
			
			if(Math.pow(arr[2], 2) == (Math.pow(arr[0], 2) + Math.pow(arr[1], 2)))
				System.out.println("right");
			else System.out.println("wrong");
		}

	}

}
