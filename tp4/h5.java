package tp4;

import java.util.Scanner;

public class h5{    
    public static int swap(int a, int b){
         Scanner sc= new Scanner(System.in);
         a=sc.nextInt();b=sc.nextInt();
         if (a>0&& b>0){
            a=a+b;
            a=a-b;
            b=a-b;
         }
        }       
     
    public static void main(String[] args) {
        
        System.out.println(swap(a, b));
        }
    }
