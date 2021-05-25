package study;

import java.util.Scanner;

public class StudyWord {			//백준 1157번 단어공부

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0, ascii = 65, cnt2 = 0;
		char word[] = sc.next().toUpperCase().toCharArray();
		char alpha[] = new char[26];
		int cnt[] = new int[26];
		boolean flag = false;
		
		for(int i = 0; i < 26; i++) alpha[i] = (char)ascii++;
		
		for(int i = 0; i < word.length; i++) 
			for(int j = 0; j < 26; j++) 
				if(word[i] == alpha[j]) cnt[j] += 1;
			
		for(int i = 0; i < 26; i++) {
			if(cnt[i] > max) {
				max = cnt[i];
				cnt2 = i;
				flag = false;
			}
			else if(cnt[i] == max) flag = true;
		}
		
		if(!flag) System.out.println(alpha[cnt2]);
		else System.out.println("?");

	}

}
