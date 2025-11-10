import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m, inverse = "";

        System.out.println("Donne une chaîne de caractères :");
        m = sc.nextLine();
        for (int i = m.length()- 1; i >= 0; i--) {
            inverse = inverse + m.charAt(i);
        }

        System.out.println("Chaine orig : " + m);
        System.out.println("Chaine inv: " + inverse);

        if (m.equals(inverse)) {
            System.out.println("La chaîne est un palindrome");
        } else {
            System.out.println("La chaîne n'est pas un palindrome");
        }

    }
}