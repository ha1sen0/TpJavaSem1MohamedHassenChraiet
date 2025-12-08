package lescollections;
import java.util.HashMap;
import java.util.Scanner;

public class TDapplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer>phrase=new HashMap<>();
        System.out.println("donnerr ton phrase");
        String ph = sc.nextLine();
        String [] sub = ph.split(" ");
        for(String word : sub) {
             if(phrase.containsKey(word)) {
                int count = phrase.get(word);
                phrase.put(word, count + 1);
            } else {
                phrase.put(word, 1);
            }
            
        }   
        System.out.println(phrase);

        
        
    }
}
