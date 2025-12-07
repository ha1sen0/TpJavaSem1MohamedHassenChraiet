package lescollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class tp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> notes = new ArrayList<>();
        int n;

       
        do {
            System.out.println("Saisir le nombre de notes (n>0) :");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            int note;
            do {
                System.out.println("Donner une note entre 0 et 20 :");
                note = sc.nextInt();
            } while (note < 0 || note > 20);
            notes.add(note);
        }

        System.out.println("nToutes les notes :");
        Iterator<Integer> it = notes.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

       
         System.out.println("La note maximale est : " + Collections.max(notes));
        int somme = 0;
        for (int n1 : notes) {
            somme += n1;
        }
        double moyenne = (double) somme / notes.size();
        System.out.println("La moyenne est : " + moyenne);

        
        System.out.println("nDonner une note à supprimer :"+notes);
        int supnote = sc.nextInt();
        if (notes.contains(supnote)) {
            notes.remove(Integer.valueOf(supnote));
            System.out.println("Note supprimée. Nouvelle liste : " + notes);
        } else {
            System.out.println("It doesn't exist");
        }

        
        Collections.sort(notes);
        System.out.println("triee : " + notes);

        System.out.println("Donner une note à supprimer par valeur :");
        int v = sc.nextInt();
        int id = notes.indexOf(v);
        if (id != -1) {
            notes.remove(id);
            System.out.println("Liste après : " + notes);
        } else {
            System.out.println("ne exist pas");
        }

        
        System.out.println("Donner la modifier :");
        int mo = sc.nextInt();
        int idmo = notes.indexOf(mo);
        if (idmo != -1) {
            System.out.println("Donner la nouvelle note :");
            int nvl = sc.nextInt();
            notes.set(idmo, nvl);
            System.out.println("Liste apres: " + notes);
        } else {
            System.out.println("ne existe pas");
        }
        ArrayList<String> etudiants = new ArrayList<>();

       
        etudiants.add("alia");
        etudiants.add("samira");
        etudiants.add("amira");

        
        System.out.println("Donner un nom d'étudiant à ajouter :");
        String nNom = sc.nextLine();
        etudiants.add(nNom);
        System.out.println(etudiants);


        if (etudiants.contains("samira")) {
            System.out.println("Samira existe ");
        } else {
            System.out.println("Samira n'existe pas");
        }

        
        int idalia = etudiants.indexOf("alia");
        if (idalia != -1) {
            etudiants.set(idalia, "alia ben saleh");
        }

        
        System.out.println("Donner un nom supprimer :"+etudiants);
        String nomSup = sc.nextLine();
        if (etudiants.contains(nomSup)) {
            etudiants.remove(nomSup);
            System.out.println(nomSup + " supprime");
        } else {
            System.out.println("ne existe pas");
        }

        
        System.out.println("Liste des étudiants :");
        for (String etudiant : etudiants) {
            System.out.println(etudiant);
        }

        Collections.sort(etudiants);
        


        System.out.println("Donner une lettre :");
        String lettre = sc.nextLine().toLowerCase();
        System.out.println("etudiant trouvés :");
        for (String etudiant : etudiants) {
            if (etudiant.toLowerCase().startsWith(lettre)) {
                System.out.println(etudiant);
            }
        }
    }
}

    