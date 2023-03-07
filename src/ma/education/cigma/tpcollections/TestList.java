package ma.education.cigma.tpcollections;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args){

        List<Voiture> voitureList = new ArrayList<>();

        voitureList.add(new Voiture(20.0,"A10"));
        voitureList.add(new Voiture(30.0,"B20"));
        voitureList.add(new Voiture(20.0,"A10"));
        voitureList.add(1,new Voiture(40.0,"C40"));

        voitureList.forEach(v-> System.out.println(v));

    }
}
