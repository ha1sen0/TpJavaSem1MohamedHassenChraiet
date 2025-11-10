
import java.util.Scanner;

public class ex {
    public static int demande(Scanner sc){
        System.out.println("choisisr le taille");
        int taille= sc.nextInt();

        if(taille< 50 && taille>70){
            System.out.println("faux");;
        }
        else{
            System.out.println("saisir votre phrase" );
            
        }

return taille;
    }
     public static boolean blanche(String ch){
        Scanner sc =new Scanner(System.in);
        ch=sc.nextLine();
        while (ch.isBlank()){
            System.out.println("donner un phrase");
        }
        return blanche(ch);
     } 
    
    public static void main(String[] args) {
        String newPhraase= blanche();

}

}
