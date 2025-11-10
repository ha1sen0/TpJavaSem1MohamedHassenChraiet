import java.util.Scanner;
public class saisibuffer {

public static void main(String[] args) {

// Création d'un objet Scanner pour la lecture au clavier

Scanner sc =new Scanner(System.in);
System.out.print("Veuillez saisir une phrase: ");
//String ch2=sc.nextLine();
StringBuffer ch=new StringBuffer(sc.nextLine());
System.out.println("Le contenu du StringBuffer est: "+ch);


sc.close();}}