import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        
        PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken());
            
            if(a>0) {
                for(int j=0;j<a;j++) {
                    int x = Integer.parseInt(st.nextToken());
                    que.add(x);
                }
            } else {
                if(que.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(que.poll());
                }
            }
        }
        
	}
}