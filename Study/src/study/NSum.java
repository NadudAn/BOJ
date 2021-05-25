package study;

public class NSum {			//백준 15596번 정수 N개의 합

	long sum(int[] a) {
        long ans = 0;
        for(int i : a) ans += i;
        return ans;
    }
}
