package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GroupWordChecker {			//백준 1316번 그룹 단어 체커

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cycle = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0; i < cycle; i++) 
			if(check(br.readLine())) count++;

		System.out.println(count);

	}

	public static boolean check (String str) {
		boolean arr[] = new boolean[26];
		char temp = 0;
		
		for(int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			if(arr[temp - 'a']) return false;
			if(i < str.length() - 1 && temp != str.charAt(i + 1)) 
				arr[temp - 'a'] = !arr[temp - 'a'];
		}
		return true;
	}
}
