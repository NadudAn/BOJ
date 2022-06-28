import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i = 1; i <= n; i++) {
            q.add(i);
        }

        int i = 0;
        while(q.size() != 1) {
            i++;
            if(i % 2 != 0) q.poll();
            else q.add(q.poll());
        }

        System.out.println(q.peek());
        br.close();
    }
}
