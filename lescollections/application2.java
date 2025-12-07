package lescollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>L1 = new ArrayList<>();
        ArrayList<Integer>L2 = new ArrayList<>();
        ArrayList<Integer>L3 = new ArrayList<>();
        System.out.println("donner un liste L1");
        int l1=0;
        for (int i =0 ; i<5;i++){
            l1=sc.nextInt();
            L1.add(l1);
            
        }
        
    System.out.println(L1);
        System.out.println("donner un liste L2");
        int l2=0;
        for (int i =0 ; i<5;i++){
            l2=sc.nextInt();
            L2.add(l2);
        }

    System.out.println(L2);

   L3.addAll(L1);L3.addAll(L2);


   for (int i =0 ; i<L3.size();i++){
    for(int j=i+1;j<L3.size();j++){
        if (L3.get(i).equals(L3.get(j))){
            L3.remove(j);
            j--;
        }
    }
   }
   Collections.sort(L3);
   System.out.println(L3);

   
}


}

