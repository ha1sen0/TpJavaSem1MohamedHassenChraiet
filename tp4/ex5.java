package tp4;

    import java.util.Scanner;

public class ex5 {

    public static double puissance(double x, int n) {
        double resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat = resultat * x;
        }
        return resultat;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        int n;

        System.out.print("Donner une valeur réelle x : ");
        x = sc.nextDouble();

        do {
            System.out.print("Donner une valeur entière positive n : ");
            n = sc.nextInt();
        } while (n < 0);

        double resultat = puissance(x, n);
        System.out.println(x + " puissance " + n + " = " + resultat);
    }
}

