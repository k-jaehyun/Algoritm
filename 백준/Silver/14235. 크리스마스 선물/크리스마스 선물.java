import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int i=0;i<n;i++) {
            int a = sc.nextInt();
            if(a>0) {
                for(int j=0;j<a;j++) {
                    int x = sc.nextInt();
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