import java.util.Scanner;

public class extp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre;

        do {
            System.out.print("Entrez un nombre compris entre 1 et 10 : ");
            nombre = sc.nextInt();
        } while (nombre < 1 || nombre > 10);

        System.out.println("Table de multiplication de " + nombre + " :");

        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " x " + i + " = " + (nombre * i));
        }
    }
}
