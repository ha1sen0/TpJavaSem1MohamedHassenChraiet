import java.util.Scanner;
public class exx4 {
    public static void main(String[] args) {
        String ch,res="";
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Entrez une chaîne de caractères (max 30 caractères) : ");
         ch = sc.nextLine();}
         while(ch.length() > 30);

            for (int i = 0; i < ch.length(); i++) {
                char c = ch.charAt(i);

                if (Character.isLowerCase(c)) {
                    c = (char) ((c - 'a' + 3) % 26 + 'a');
                } else if (Character.isUpperCase(c)) {
                    c = (char) ((c - 'A' + 3) % 26 + 'A');
                }
    
                res = res + c;
            }

            System.out.println("Chaîne codée : " + res);
        }

        
    }



