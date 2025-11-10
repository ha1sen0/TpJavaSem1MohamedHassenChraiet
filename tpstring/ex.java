
import java.util.Scanner;



public class ex {
    
    public static void main(String[] args) {
        String ch; char n;int nmb=0;
        Scanner sc=new Scanner(System.in);
        
        
        
        do{
        
        System.out.println("donner un chaine de carcatere");
        ch=sc.nextLine();
        }
        while(!(ch.length()<=20));
        
        System.out.println("donner la char");
        n=sc.next().charAt(0);
        for (int i = 0; i <ch.length() ; i++) {
            if (ch.charAt(i)==n){
                nmb++;
               

            }
            

            }            
             System.out.println("la nombre d'occurence est"+nmb);
        }
        
    }

