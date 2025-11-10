package tp4;

    import java.util.Scanner;

public class ex3 {

    
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

   
    public static int calculeSomme(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i * i;
        }
        return somme;
    }

  
    public static void main(String[] args) {
        int n = lectureN();
        int resultat = calculeSomme(n);
        System.out.println("La somme des " + n + " premiers carres est : " + resultat);
    }
}

