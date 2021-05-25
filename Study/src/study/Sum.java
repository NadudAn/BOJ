package study;

import java.util.Scanner;

public class Sum {				//백준 11720번 숫자의 합

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, sum = 0;
		String str;
		n = sc.nextInt();
		str = sc.next();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) arr[i] = Character.getNumericValue(str.charAt(i));
		for(int i : arr) sum += i;
		
		System.out.println(sum);

	}

}
