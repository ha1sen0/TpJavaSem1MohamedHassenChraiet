package tp4;
import java.util.Scanner;

public class ex4 {

    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static boolean estArmstrong(int n) {
        int original = n;
        int somme = 0;
        while (n > 0) {
            int chiffre = n % 10;
            somme += chiffre * chiffre * chiffre; 
            n = n / 10;
        }
        return somme == original;
    }

    public static void main(String[] args) {
        int N = lectureN();

        System.out.println("Les nombres d’Armstrong inférieurs à " + N + " sont :");
        for (int i = 1; i < N; i++) {
            if (estArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}