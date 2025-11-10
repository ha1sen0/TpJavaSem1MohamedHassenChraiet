import java.util.Scanner;

public class extp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, a, j = 1;

        do {
            System.out.print("Entrez un numéro de mois (1 à 12) : ");
            m = sc.nextInt();
        } while (m < 1 || m > 12);

        System.out.print("Entrez l'année : ");
        a = sc.nextInt();

        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                j = 31;
                break;
            case 4: case 6: case 9: case 11:
                j = 30;
                break;
            case 2:
            
                break;
        }

        System.out.println("Le mois " + m + " de l'année " + a + " contient " + j + " jours.");
    }
}
