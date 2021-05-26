import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTests = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < nTests; i++) {
            int nClients = sc.nextInt();
            List<Integer> passwords = new ArrayList<>();

            for (int j = 0; j < nClients; j++) {
                int e = sc.nextInt();
                passwords.add(e);
            }
            sc.nextLine();
            
            List<Integer> sortedPasswords = new ArrayList<>(passwords);
            Collections.sort(sortedPasswords);
            Collections.reverse(sortedPasswords);
            
            int noChangeClients = 0;
            for (int k = 0; k < passwords.size(); k++) {
                  if (passwords.get(k) == sortedPasswords.get(k)) {
                      noChangeClients++;
                  }
            }
            
            System.out.println(noChangeClients);
        }
        
        sc.close();
    }
}
