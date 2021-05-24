import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.nextInt();
        
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        while(sc.hasNext()) {
            int v = sc.nextInt();
            
            if (v % 2 == 0) {
                even.add(v);
            } else {
                odd.add(v);
            }
        }
        
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        
        for (int e : even) {
            System.out.println(e);
        }
        
        for (int o : odd) {
            System.out.println(o);
        }
        
        sc.close();
    }
}