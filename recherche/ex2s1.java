package recherche;
import java.util.Scanner;
public class ex2s1 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner la taille n (>0) : ");
        int n = sc.nextInt();

        int[] T = new int[n];
        int sommeImpairs = 0;

        for(int i = 0; i < n; i++){
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
            if(T[i] % 2 != 0){
                sommeImpairs += T[i];
            }
        }

        System.out.println("Somme des impairs = " + sommeImpairs);
    }
}

