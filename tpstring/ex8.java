
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Donner une phrase :");
        String phrase = sc.nextLine();

        System.out.println("Donner le mot à chercher :");
        String mot = sc.next();
        StringTokenizer st = new StringTokenizer(phrase);

        int compteur = 0;

        while (st.hasMoreTokens()) {
            String token = st.nextToken(); // get each word
            if (token.equalsIgnoreCase(mot)) { // compare (ignore case)
                compteur++;
            }
        }


        System.out.println("Le mot \"" + mot + "\" se répète " + compteur + " fois.");
    }
}
