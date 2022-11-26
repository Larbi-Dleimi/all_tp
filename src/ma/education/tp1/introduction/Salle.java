package ma.education.tp1.introduction;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.awt.event.WindowStateListener;

public class Salle {

    // les attributs
    public long id;
    public String nom;

    // Constructeur par défaut
     public Salle(){}
    // Constructeur d'initialisation 1
    public Salle(String nom){

        this.nom = nom;
    }
    // Constructeur d'initialisation 2
    public Salle(long id,String nom){
        this.id = id;
        this.nom = nom;
    }

    /*@Override
    public boolean equals(Object obj) {
         if (!(obj instanceof Salle)) {
             return false;
        }
         else{
        return this == obj;}
    }*/
}
