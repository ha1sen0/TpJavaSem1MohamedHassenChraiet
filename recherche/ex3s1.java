package recherche;
import java.util.Scanner;
public class ex3s1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner n : ");
        int n = sc.nextInt();

        int[] T = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }

        System.out.print("Donner X : ");
        int X = sc.nextInt();
        int occ = 0;

        for(int i = 0; i < n; i++){
            if(T[i] == X)
                occ++;
        }

        if(occ > 0)
            System.out.println("X existe et apparait " + occ + " fois.");
        else
            System.out.println("X n'existe pas.");
    }
}

