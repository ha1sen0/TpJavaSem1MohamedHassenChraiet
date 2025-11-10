package tp4;
import java.util.Scanner;

public class exx1 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i <= 10) {
            int n = methode.lectureN(sc); 
            if (methode.estPair(n)) {
                System.out.println(n + " est pair");
            } else {
                System.out.println(n + " est impair");
            }
            i++;
        }

    }
}