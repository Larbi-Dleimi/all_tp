package ma.education.tp2.statickeyword;

public class Etudiant {

    public long id;
    public String nom;
    public static int nbEtudiants;


    static{
        nbEtudiants += 10;

        System.out.println(nbEtudiants);
    }

    /* VI : Le mot réservé “static”
    *  a - Chaque étudiant possède son propre id
    *  b - Chaque étudiant possède son propre nom
    *  c - le nombre d'étudiants est partagé entre tous les étudiants.
    */
    public Etudiant(long id,String nom,int nb){
        this.id = id;
        this.nom = nom;
        nbEtudiants += nb;
    }
}
