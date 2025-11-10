import java.util.Scanner;

public class Extp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int factorielle = 1;

        do {
            System.out.print("Entrez un entier positif : ");
            n = sc.nextInt();
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }

        System.out.println(n + "! = " + factorielle);
    }
}
