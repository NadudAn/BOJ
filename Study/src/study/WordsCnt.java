package study;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordsCnt {			//백준 1152번 단어 개수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		System.out.println(st.countTokens());

	}

}
