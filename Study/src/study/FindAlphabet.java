package study;

import java.util.Scanner;

public class FindAlphabet {			//백준 10809번 알파벳 찾기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ascii = 97;
		String s;
		char arr[] = new char[26];
		int alpha[] = new int[26];
		
		s = sc.next();
		
		for (int i = 0; i < 26; i++) alpha[i] = -1;
		for (int i = 0; i < 26; i++) {
			arr[i] = (char)ascii;
			ascii++;
		}
		
		for (int i = 0; i < s.length(); i++)
			for (int j = 0; j < 26; j++) 
				if (s.charAt(i) == arr[j] && alpha[j] == -1) alpha[j] = i;
		for (int i : alpha) System.out.print(i + " ");

	}

}
