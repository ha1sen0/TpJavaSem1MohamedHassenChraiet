package debug;

import java.util.Scanner;

public class debgu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("entrer un nombre entier ");
        int n =sc.nextInt() ;
        int some=0;
        for (int i=1;i<=n;i++){
            some=some+i;
            
        }  System.out.println("la some des eniters de 1 a "+n+"est : "+some);
    }
    
}
