import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier non nul : ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Erreur : le nombre ne doit pas être nul !");
        } else {
            if (n % 2 == 0) {
                System.out.println("Le nombre " + n + " est pair.");
            } else {
                System.out.println("Le nombre " + n + " est impair.");
            }
       
        }
    }
}
