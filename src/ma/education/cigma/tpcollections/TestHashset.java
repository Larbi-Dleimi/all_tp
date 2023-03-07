package ma.education.cigma.tpcollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestHashset {

    public static void main(String[] args){

        Set<Voiture> voitureSet = new HashSet<>();

        voitureSet.add(new Voiture(20.0,"A10"));
        voitureSet.add(new Voiture(30.0,"B20"));
        voitureSet.add(new Voiture(20.0,"A10"));

        voitureSet.forEach(v-> System.out.println(v));

    }


}
