package lescollections;

import java.util.ArrayList;
import java.util.Scanner;

public class application3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer>L1=new ArrayList<>();
        ArrayList<Integer>L2=new ArrayList<>();
        int l1=0;
        int l2=0;
        for (int i =0 ; i<5;i++){
            System.out.println("donner L1");
            l1=sc.nextInt();
            L1.add(l1);
            System.out.println("donner L2");
            l2=sc.nextInt();
            L2.add(l2);    
        System.out.println(L2);
    System.out.println(L1);  }

            
                if (L1.containsAll(L2)){
                    System.out.println("les deux lists ont les memes elements");
                }
                else{
                    System.out.println("non");
                }
            
    }

}
