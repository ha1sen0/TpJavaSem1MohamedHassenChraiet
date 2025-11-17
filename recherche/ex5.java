package recherche;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner n : ");
        int n = sc.nextInt();

        int[] T = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }

        int Pair = 0, Impair = 0;
        for(int i = 0; i < n; i++){
            if(T[i] % 2 == 0)
                Pair++;
            else
                Impair++;
        }

        
        int[] T1 = new int[Pair];
        int[] T2 = new int[Impair];

       
        int p = 0, im = 0;
        for(int i = 0; i < n; i++){
            if(T[i] % 2 == 0)
                T1[p++] = T[i];
            else
                T2[im++] = T[i];
        }

        
        System.out.println("Tableau T1 (pairs) :");
        for(int i = 0; i < T1.length; i++)
            System.out.print(T1[i] + " ");

        System.out.println("/Tableau T2 (impairs) :");
        for(int i = 0; i < T2.length; i++)
            System.out.print(T2[i] + " ");
    }
}

