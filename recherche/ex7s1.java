package recherche;
import java.util.Scanner;
public class ex7s1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner n : ");
        int n = sc.nextInt();

        int[] T = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }

        System.out.print("Donner p (1 à " + n + ") : ");
        int p = sc.nextInt();
        p--;

        for(int i = p; i < n-1; i++){
            T[i] = T[i+1];
        }

        System.out.println("Tableau après suppression :");
        for(int i = 0; i < n-1; i++)
            System.out.print(T[i] + " ");
    }
}

