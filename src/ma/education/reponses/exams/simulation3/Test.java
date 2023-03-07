package ma.education.reponses.exams.simulation3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args){

        Set<Container> containers = new HashSet<>();

        containers.add(new Container("US",9,101));
        containers.add(new Container("MAR",10,202));
        containers.add(new Container("GB",11,99));
        containers.add(new Container("CHINA",12,101));

        containers.stream().forEach(c-> System.out.println(c.getName()));

        Reachable r1 = (a,b)-> a+b;

        r1.Sreach("test",10);



    }
}
