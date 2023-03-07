package ma.education.reponses.exams.examBasicJava;

import java.util.ArrayList;
import java.util.List;

public class Foozin {

    static public void main(String[] args){

        Integer x=0;        Integer y=0;

        for(Short z=0;z<5;z++)
            if (++x > 2 || ++y > 2)
                x++;
        System.out.println(x + " " + y);

        List<String> collection1 = new ArrayList<>();

        collection1.add("ABC");
        collection1.add(0,"EF");
        collection1.add(1,"ABC");
        collection1.add(0,"ABC");

        System.out.println(collection1);


    }
}
