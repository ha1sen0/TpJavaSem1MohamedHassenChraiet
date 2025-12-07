package lescollections;

import java.util.ArrayList;
import java.util.Scanner;

public class TDcollections2 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String>NomEmp_salaire= new ArrayList<>();
    String emp;
    System.out.println("donner le nom et le salarie");
    for (int i =0;i<4;i++){
        emp=sc.nextLine();
        NomEmp_salaire.add(emp);

    }
    System.out.println(NomEmp_salaire);
    System.out.println("verfie rqui un emplyee est present dans la liste or no \ndonner un nom");
    String pre=sc.nextLine();
    boolean f=false;
    for (int i =0 ; i<NomEmp_salaire.size();i++){
        if (NomEmp_salaire.get(i).contains(pre)){
            System.out.println("il existe " +NomEmp_salaire.get(i));
            f=true;
            break;
            
            
        }
           
        }
        if(!(f)){
            System.out.println("il ne existe pas");
    }
 }   
}
