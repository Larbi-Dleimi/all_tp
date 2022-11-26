package ma.education.p3;

import ma.education.tp2.statickeyword.Etudiant;

public class TestStatic {

    public static void main(String[] args){

        Etudiant e1 = new Etudiant(1,"AHMED",20);
        Etudiant e2 = new Etudiant(2,"SAID",30);

        // Objet e1
        System.out.print(" id de l'objet e1 : "+e1.id);
        System.out.print(" nom de l'objet e1 : "+e1.nom);
        // Objet e2
        System.out.print("\n id de l'objet e2 : "+e2.id);
        System.out.print(" nom de l'objet e2 : "+e2.nom);


        System.out.print("\n Nombre d'étudiants : "+Etudiant.nbEtudiants);

        /*
        *  VI : Le mot réservé “static”
        *  9 - Le mot clé static est utilisé pour désigner une propriété dont la valeur est identique pour tous les objets de la classe
        */
    }
}
