package ma.education.tp.heritage;

public class Test {
    public static void  main(String[] args){

        Personne p1 = new Etudiant();
        Personne p2 = new Professeur();
        Personne p3 = new Personne();

        Etudiant e2 = (Etudiant)p1;
        Professeur p5 = (Professeur)p2;

        /*
        *  les classes professeur et Etudiant sont deux classes filles de la classe Personne (superclass)
        *  alors nous ne pouvons pas instancier un objet de type classe fille (subclass) par le constructeur d'une autre classe fille.
        *
        Etudiant e1 = new Professeur();
        Professeur p4 = new Etudiant();
        *
        */

        /*
        *  les deux objets p1 et p2 sont de type Personne (superclass) de sorte qu'il n'aura accès qu'aux attributs de cette classe
        *  et pas aux attributs de la classe fille (Etudiant et Professeur).
        *
        System.out.println(p1.note);
        System.out.println(p2.salaire);
        *
        */

        System.out.println(e2.note);
        System.out.println(p5.salaire);


    }
}
