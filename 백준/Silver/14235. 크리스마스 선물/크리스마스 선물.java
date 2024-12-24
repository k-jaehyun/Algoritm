import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++) {
            int a = sc.nextInt();
            if(a>0) {
                for(int j=0;j<a;j++) {
                    int x = sc.nextInt();
                    list.add(x);
                }
                Collections.sort(list, Comparator.reverseOrder());
            } else {
                if(list.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(list.get(0));
                    list.remove(0);
                }
            }
        }
        
	}
}