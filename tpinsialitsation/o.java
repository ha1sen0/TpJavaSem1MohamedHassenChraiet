
import java.util.Scanner;

public class o {
    public static void main(String[] args) {
        char a;
        
        boolean x= false;
        Scanner sc=new Scanner(System.in);
        System.out.println("donner un letter");
        a=sc.next().charAt(0);
        while (!(Character.isLetter(a))){
            System.out.println("thats a letter");
            
            x=true;

        }

    }
    
}
