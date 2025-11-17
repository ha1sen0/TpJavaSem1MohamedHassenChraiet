package debug;
import java.util.Scanner;
import java.util.StringTokenizer;

public class e5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Donner une phrase : ");
        String ch = Sc.nextLine();
        StringTokenizer st = new StringTokenizer(ch);
        
        int nmb = 0; String mot1 = "";
        
        while (st.hasMoreTokens()) {
            String mot = st.nextToken();
            for (int i = 0; i < mot.length(); i++) {
                char voy=mot.charAt(i);
                if (voy == 'a' || voy == 'e' || voy == 'i' || voy == 'o' || voy == 'u' || voy == 'y') {
                    nmb++;
                }
            }
            if (mot.length() > mot1.length()) {
                mot1 = mot;
            }
        }

        System.out.println("Nmb de voyelles " + nmb);
        System.out.println("mot le plus long " + mot1);
       
    }
}