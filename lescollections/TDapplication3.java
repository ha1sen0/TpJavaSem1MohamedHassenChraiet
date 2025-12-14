package lescollections;
import java.util.HashMap;
import java.util.Scanner;

public class TDapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer>phrase=new HashMap<>();
        System.out.println("donenr une phrase");
        String ph=sc.nextLine();
        String [] word = ph.split("");
        for (String w : word ){
            phrase.put(w, phrase.get(w)+1);
        }
        sc.close();
    
    }}