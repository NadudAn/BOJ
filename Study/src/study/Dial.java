package study;

import java.util.Scanner;

public class Dial {				//백준 5622번 다이얼

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char arr[] = sc.next().toUpperCase().toCharArray();
		int num[] = new int[arr.length];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 87) num[i] = 9;
			else if(arr[i] >= 84) num[i] = 8;
			else if(arr[i] >= 80) num[i] = 7;
			else if(arr[i] >= 77) num[i] = 6;
			else if(arr[i] >= 74) num[i] = 5;
			else if(arr[i] >= 71) num[i] = 4;
			else if(arr[i] >= 68) num[i] = 3;
			else if(arr[i] >= 65) num[i] = 2;
		}
		
		for(int i : num) sum += i + 1;
		System.out.println(sum);

	}

}
