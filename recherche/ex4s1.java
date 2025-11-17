package recherche;
import java.util.Scanner;
public class ex4s1 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] T = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }

        int premier = T[0];

        for(int i = 0; i < 4; i++){
            T[i] = T[i+1];
        }
        T[4] = premier;

        System.out.println("Après décalage :");
        for(int x : T)
            System.out.print(x + " ");
    }
}

