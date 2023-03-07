package ma.education.tp4.singleton;

import ma.education.tp2.statickeyword.Etudiant;

public class TestSingleton {

    static public void main(String[] args){

        Terre t1 = Terre.getInstance(1000,2000);
        Terre t2 = Terre.getInstance(4000,5000);

        // Objet t1
        System.out.println("la distance du soleil pour l'objet t1 : "+t1.distanceToSoleil);
        System.out.println("la surface pour l'objet t1 : "+t1.surface);
        // Objet t2
        System.out.println("la distance du soleil pour l'objet t2 : "+t2.distanceToSoleil);
        System.out.println("la surface pour l'objet t2 : "+t2.surface);

        Connexion connexion = Connexion.getInstance("larbi","larbi1997");
        Connexion connexion2 = Connexion.getInstance("Yassine","yassine2023");

        System.out.println(connexion);
        System.out.println(connexion2);
    }

    /*
    *  V : Le patron de conception “Singleton”
    *  3.g - le design patter "Singleton" nous permet de créer un seule objet dans la mémoire
    */
}
