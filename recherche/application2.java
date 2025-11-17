package recherche;

import java.util.Arrays;
import java.util.Scanner;

public class application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, nc;
        int somme = 0, produit = 1;

        
        do {
            System.out.print("Donner n1 (<30) : ");
            n1 = sc.nextInt();
            System.out.print("Donner nc (<30) : ");
            nc = sc.nextInt();
        } while (n1 > 30 || nc > 30);

        int total = n1 * nc;

        int[][] m = new int[n1][nc];

        
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                m[i][j] = sc.nextInt();
            }
        }

       
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < nc; j++) {
                somme += m[i][j];
                produit *= m[i][j];
            }
        }

        double moy = (double) somme / total;

       
        System.out.println("\nTableau m :");
        for (int i = 0; i < n1; i++) {
            System.out.println(Arrays.toString(m[i]));
        }

        
        System.out.println("\nSomme = " + somme);
        System.out.println("Produit = " + produit);
        System.out.println("Moyenne = " + moy);
    }
}


