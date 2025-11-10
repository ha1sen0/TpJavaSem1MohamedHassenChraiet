
import java.util.Scanner;

public class ex1td {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double t;
        System.out.println("donner ton valeur de temp: ");
        t=sc.nextDouble();
        if (t<=0){
            System.out.println("c'est glace");
        }
        else if ( 0 <t && t <=100 ){
            System.out.println("c'est eau");
        }
        else if (100<t){
            System.out.println("c'est vapeur");
        }
       else{
        System.out.println("donner ton valeur de temp");
       }

        

    }
    
}
