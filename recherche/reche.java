package recherche;

import java.util.Arrays;
import java.util.Scanner;

public class reche {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("donner n");
        int n=sc.nextInt();
   
    
    int []t=new int [n];
    for (int i = 0; i < t.length; i++) {
        System.out.println("donner t");
        t[i]=sc.nextInt();
        System.out.println(Arrays.toString(t));
    }
    ;
    int inf=1;
    int sup=1;
    for(int i : t){
        int mil=inf+sup/2;
        if (n<t[mil] ){
            sup=mil-1;
        }else{
            inf=mil+1;
        }
         if(n==t[mil] || inf>sup){
        break;
    }
    System.out.println(t.toString());
    }
    
}}
