package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightAngledTriangle1 {		// 백준 4153번 직각삼각형
										//﻿반복문을 이용하여 큰 수를 찾아낸 후 피타고라스의 공식 사용
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int arr[] = new int[3];
		int tri[] = new int[2];
		int max = 0, cnt = 0;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 3; i++) 
				arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[0] == 0 && arr[1] == 0 & arr[2] == 0) return;
			
			for(int i = 0; i < 3; i++) 
				if(arr[i] > max) max = arr[i];
			
			for(int i = 0; i < 3; i++) {
				if(arr[i] != max) {
					tri[cnt] = (int) Math.pow(arr[i], 2);
					++cnt;
				}
			}
			
			if(tri[0] + tri[1] == Math.pow(max, 2)) System.out.println("right");
			else System.out.println("wrong");
			
			max = 0;
			cnt = 0;
		}


	}

}
