
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ch;int res=0;
        do { 
            System.out.println("donner une chaine qui ne depasse poas 50 charctere");
            ch=sc.nextLine();
        } while (ch.length()>50);
        for (int i = 0; i <ch.length(); i++) {
            char car =ch.charAt(i);
            if (Character.isLowerCase(car)){
                res++;
            }
            
            
        }
        System.out.println("le number de min carc est "+res);

    }
}
