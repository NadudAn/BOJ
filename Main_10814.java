package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Member implements Comparable<Member> {
	int age;
	String name;
	
	Member(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Member m) {		//내림차순 정렬을 위한 메소드 오버라이딩
		if(this.age < m.getAge()) {
			return -1;
		}
		else if(this.age > m.getAge()) {
			return 1;
		}
		return 0;
	}

}

public class Main_10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Member> m = new ArrayList<Member>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			m.add(new Member(Integer.parseInt(st.nextToken()), st.nextToken()));
		}
		
		Collections.sort(m);
		
		for(int i = 0; i < n; i++) {
			System.out.println(m.get(i).age + " " + m.get(i).name);
		}
		
	}

}
