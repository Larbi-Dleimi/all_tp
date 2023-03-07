package ma.education.tp1.introduction;

import java.util.Comparator;

public class Laboratoire extends Salle implements Comparable {

    String type;

    public Laboratoire(long id,String nom,String type){

        super(id,nom);
        this.type = type;

    }


    @Override
    public int compareTo(Object o) {

        if (!(o instanceof Laboratoire))
            return -1;
        else
        {
            Laboratoire laboratoire = (Laboratoire) o;
            return this.type.compareToIgnoreCase(laboratoire.type);
        }
    }
}
