package recherche;
import java.util.Scanner;
public class ex8s1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] T = new int[10];
        int somme = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Note " + (i+1) + " : ");
            T[i] = sc.nextInt();
            somme += T[i];
        }

        double moyenne = somme / 10.0;
        int n = 0;

        for(int i = 0; i < 10; i++){
            if(T[i] > moyenne)
                n++;
        }

        System.out.println("Nmb de notes > moyenne : " + count);
    }
}

