package study;

import java.util.Scanner;

public class OXquiz {			//백준 8958번 OX퀴즈

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, plus = 0, sum = 0;
		n = sc.nextInt();
		int result[] = new int[n];
		String str;
		char arr[] = new char[101];
		
		for(int i = 0; i < n; i++) {
			str = sc.next();
			arr = str.toCharArray();
			for(int j = 0; j < str.length(); j++) {
				if(arr[j] == 'O') {
					plus++;
					sum += plus;
				} else plus = 0;
			}
			result[i] = sum;
			sum = 0;
			plus = 0;
		}
		
		for(int i = 0; i < n; i++) 
			System.out.println(result[i]);
	}

}
