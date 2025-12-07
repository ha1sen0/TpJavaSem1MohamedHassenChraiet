package lescollections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class tp5 {
    // compression de liste 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer>L = new ArrayList<>();
        System.out.println("donner liste d'entiers");
        int size = rand.nextInt(2,9);
        System.out.println("entre "+size+" entier");
        for(int i =0 ; i<size;i++){
            L.add(sc.nextInt());
        }
        System.out.println(L);
        int dub=L.get(0);
        for (int i =0 ; i < L.size() ; i++){
            for (int j =i+1 ; j<L.size() ; j++){
            if (L.get(i).equals(L.get(j))){
                L.remove(j);
                j--;
            }}
            System.out.println(L);
        }
        
    }
}
