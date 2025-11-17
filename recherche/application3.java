package recherche;
import java.util.Scanner;

public class application3 {

    
    
    public static int lectureN(Scanner sc) {
        System.out.print("Enter n: ");
        return sc.nextInt();
    }
    
   
    public static void RemplirTAb(int[] T, Scanner sc) {
        for (int i = 0; i < T.length; i++) {
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }
    }
    
    
    public static int[] CreerTpair(int[] T) {
        int c= 0;
        for (int i = 0; i < T.length; i++) {
            if (T[i] % 2 == 0) c++;
        }
        
        int[] T_pair = new int[c];
        int j = 0;
        for (int i = 0; i < T.length; i++) {
            if (T[i] % 2 == 0) {
                T_pair[j] = T[i];
                j++;
            }
        }
        return T_pair;
    }
    
   
    public static int[] CreerTimpair(int[] T) {
        int c = 0;
        for (int i = 0; i < T.length; i++) {
            if (T[i] % 2 != 0) c++;
        }
        
        int[] T_impair = new int[c];
        int j = 0;
        for (int i = 0; i < T.length; i++) {
            if (T[i] % 2 != 0) {
                T_impair[j] = T[i];
                j++;
            }
        }
        return T_impair;
    }
    
   
    public static void AfficheTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = lectureN(sc);
        int[] T = new int[n];
        RemplirTAb(T, sc);
        
        System.out.print("T: ");
        AfficheTab(T);
        
        int[] T_pair = CreerTpair(T);
        System.out.print("T_pair: ");
        AfficheTab(T_pair);
        
        int[] T_impair = CreerTimpair(T);
        System.out.print("T_impair: ");
        AfficheTab(T_impair);
        
        
    }
}
