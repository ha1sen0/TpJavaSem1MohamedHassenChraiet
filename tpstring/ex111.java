
import java.util.Scanner;

public class ex111 {
    public static void main(String[] args) {
        int num;String numb="";
        Scanner sc= new Scanner(System.in);
        
        do { 
            System.out.println("donner un nombre de 10 entier");
            num = sc.nextInt();
           numb=Integer.toString(num);
        } while (numb.length()<10);
    
    for (int i =0;numb.length()<10;i++){
        if (numb[i]%=0){
            i++;
        }

    }
}
}