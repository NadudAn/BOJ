package study;

import java.util.Scanner;

public class CroatiaAlphabet {			//백준 2941번 크로아티아 알파벳

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str = sc.next();
		
		for(int i = 0; i < arr.length; i++) 
			str = str.replace(arr[i], "!");
						
		System.out.println(str.length());

	}

}
