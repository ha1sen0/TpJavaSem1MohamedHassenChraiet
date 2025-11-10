
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner un premier group verb");
        StringBuffer ch=new StringBuffer(sc.nextLine());
        StringBuffer conjig=new StringBuffer();
        conjig=ch.append("er");
        System.out.println("le conjigison de cette verb est "+conjig);


    }
}
