package recherche;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
        System.out.println("donner n");
         n=sc.nextInt();}
        while(n<0);
        int []t=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("donner t");
            t[i]=sc.nextInt();
            if(i<99 && i>1){
                System.out.println("donner un entier compose de deux chiffres");
                break;
            }
            
            
        }
    }
    
}
