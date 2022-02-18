package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class J {
	String color;
	int n;
	int m;
	
	J(String color, int n, int m) {
		this.color = color;
		this.n = n;
		this.m = m;
	}
	
}

public class Main_1076 {
	static ArrayList<J> j = new ArrayList<J>();
	static String arr[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
	static int index[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		index = new int[3];
		
		init();
		
		for(int i = 0; i < 3; i++) 
			index[i] = find(br.readLine());
		
		
		System.out.println((long)(j.get(index[0]).n * 10 + j.get(index[1]).n) * j.get(index[2]).m);
		
	}
	
	public static void init() {
		for(int i = 0; i < 10; i++) 
			j.add(new J(arr[i], i, (int) Math.pow(10, i)));
		
	}
	
	public static int find(String color) {
		for(int i = 0; i < 10; i++) 
			if(arr[i].equals(color)) 
				return i;
			
		return -1;
	}

}
