package ma.education.tp5.collections;

import ma.education.tp1.introduction.SalleCours;

import javax.swing.tree.TreeCellRenderer;
import java.util.*;

public class TestSet {

    public static void main(String[] args){

        Set<String> set = new HashSet<>();
        set.add("ABC1");
        set.add("ABC2");
        set.add("ABC3");
        set.add("ABC1");
        set.add("ABC4");
        set.add("ABC5");

        //set.forEach(i-> System.out.println(i));

        Set<Client> set2 = new HashSet<>();
        Client client1 = new Client(1,"ALAMI");
        Client client2 = new Client(3,"ABCDE");
        Client client3 = new Client(2,"SOUHAIL");

        set2.add(client1);
        set2.add(client2);
        set2.add(client3);

        set2.forEach(i-> System.out.println(i.toString()));

        /*Set<Integer> set3 = new TreeSet<>();
        set3.add(22);
        set3.add(11);
        set3.add(15);
        set3.add(9);

        //set3.forEach(j-> System.out.println(j));

        Comparator<Client> comparator = new codeComparator();

        //Set<Client> set4 = new TreeSet<>();

        Set<Client> set4 = new TreeSet<>(comparator);

        set4.add(new Client(1,"OMAR"));
        set4.add(new Client(1,"OMAR"));
        set4.add(new Client(3,"SAID"));
        set4.add(new Client(2,"HASSAN"));

         //set4.forEach(j-> System.out.println(j));

         /*Set<Salle> salles = new HashSet<>();

         salles.add(new Salle(5,"CIGMA"));
         salles.add(new Salle(5,"ALPHA"));
         salles.add(new Salle(4,"CIGMA"));
         salles.add(new Salle(4,"BETA"));
         System.out.println("\n");
         //salles.forEach(s-> System.out.println(s));


         Set<Pc> treeSet = new TreeSet<>((p1,p2) -> p1.serial.length()-p2.serial.length());
         treeSet.add(new Pc("ABC",3000.0));
         treeSet.add(new Pc("AB",2000.0));
         treeSet.add(new Pc("EFA",2500.0));
         treeSet.add(new Pc("EF",2300.0));

         treeSet.forEach(p-> System.out.println(p));

        Set<String> identifiers = new TreeSet<>((a,b)->a.length()-b.length());

        identifiers.add("A200");
        identifiers.add("A400");
        identifiers.add("A300");
        //identifiers.forEach(a-> System.out.println(a));

        String name = ""+2;
        System.out.println("name ="+name.length());*/


    }
}