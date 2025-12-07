package lescollections;

import java.util.HashMap;
import java.util.Scanner;

public class TDcollections4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> produits = new HashMap<>();
        System.out.println("rmeplir les produits");
        String prod="" ;int prix=0;
        for (int i = 1; i <= 4; i++) {
            prod =sc.nextLine();
        System.out.print("Prix de " + prod + ": ");
         prix = sc.nextInt();
        sc.nextLine();
        produits.put(prod, prix);
        }
      
        System.out.println(produits);
        
        
    }
}
