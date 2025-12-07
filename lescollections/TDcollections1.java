package lescollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TDcollections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>livre = new ArrayList<>();
        String n;
        System.out.println("donner 3 livre");
        for( int i =0;i<3;i++){
            n =sc.nextLine();
            livre.add(n);
        }
        
        Collections.sort(livre);
        for(int i = 0; i < livre.size(); i++) {
            if(livre.get(i).contains("a")) {
                livre.remove(i);
                i--;
            }
        
            
        } System.out.println(livre);

    }
    
}
