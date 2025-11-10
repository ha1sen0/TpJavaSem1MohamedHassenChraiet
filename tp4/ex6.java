package tp4;

import java.util.Scanner;

public class ex6 {
    public static int FACT(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Donner un entier positif : ");
            n = sc.nextInt();
        } while (n < 0);

        int resultat = FACT(n);
        System.out.println("La factorielle de " + n + " est : " + resultat);
    }
}