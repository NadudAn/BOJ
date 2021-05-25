package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction {				//백준 1193번 분수찾기

	public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int t = 3, pre = 3, r = 1, c = 1;
		
		if(n == 1) {
			System.out.println(r + "/" + c);
			return;
		}
		
		while(true) {
			if(pre >= n) {
				--t;
				pre -= t;
				break;
			}
			else {
				pre += t;
				++t;
			}
		}
		++pre;
		if(t % 2 == 0) {
			c = t;
			while(true) {
				if(pre == n) break;
				++pre;
				++r;
				--c;
			}
		}
		else{
			r = t;
			while(true) {
				if(pre == n) break;
				--r;
				++c;
				++pre;
			}
		}
		System.out.println(r + "/" + c);
	}

}
