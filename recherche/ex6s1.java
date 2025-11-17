package recherche;
import java.util.Scanner;
public class ex6s1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner n : ");
        int n = sc.nextInt();

        int[] T = new int[n+1];

        for(int i = 0; i < n; i++){
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }

        System.out.print("Donner x : ");
        int x = sc.nextInt();

        System.out.print("Donner p (1 à " + (n+1) + ") : ");
        int p = sc.nextInt();
        p--; 

        for(int i = n; i > p; i--){
            T[i] = T[i-1];
        }

        T[p] = x;

        System.out.println("Nouveau tableau :");
        for(int i = 0; i <= n; i++)
            System.out.print(T[i] + " ");
    }
}

