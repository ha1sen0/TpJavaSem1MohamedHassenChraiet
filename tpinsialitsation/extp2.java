import java.util.Scanner;

public class extp2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;

       
        do {
            System.out.print("Entrez le numéro du mois (1 à 12) : ");
            m = sc.nextInt();
        } while (m < 1 || m > 12);

        String saison;

        
        switch (m) {
            case 12:
            case 1:
            case 2:
                saison = "Hiver";
                break;
            case 3:
            case 4:
            case 5:
                saison = "Printemps";
                break;
            case 6:
            case 7:
            case 8:
                saison = "Été";
                break;
            case 9:
            case 10:
            case 11:
                saison = "Automne";
                break;
            default:
                saison = "entre une numero ";
        }

        System.out.println("Le mois n° " + m + " correspond à la saison : " + saison);
    }
}
