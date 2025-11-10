import java.util.Scanner;
import java.util.StringTokenizer;

public class ex99 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("donner un chaine ton nom,prenom,cin,ville,bac moyene,section de bac");
       String ch = sc.nextLine();
        StringTokenizer st = new StringTokenizer(ch,",");

        //System.out.println("Nombre de tokens: " + st.countTokens());
         while (st.hasMoreTokens()) {
            String nom = st.nextToken();
            System.out.println("nom: " + nom);                                                                     
            String prenom = st.nextToken();
            System.out.println("prenom :"+prenom);
            String cin = st.nextToken();
            System.out.println("cin :"+cin);
            String ville = st.nextToken();
            System.out.println("ville:"+ville);
            String moyene = st.nextToken();
            System.out.println("moyene :"+moyene);
            String section = st.nextToken();
            System.out.println("section :"+section);
        }
       

    }
}
