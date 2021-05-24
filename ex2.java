import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
            String list = sc.nextLine();
            List<String> arr = Arrays.asList(list.split(" "));
            List<String> buyList = new ArrayList<>();
            
            for (String s : arr) {
                if (!buyList.contains(s)) {
                    buyList.add(s);  
                }
            }
            
            Collections.sort(buyList);
            
            for (String b : buyList) {
                System.out.printf("%s ", b);
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}