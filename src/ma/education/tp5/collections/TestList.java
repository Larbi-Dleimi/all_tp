package ma.education.tp5.collections;

import java.net.Inet4Address;
import java.util.*;

public class TestList {

    public static void main(String[] args) {
        List<Integer> list1 =  new ArrayList<Integer>();
        list1.add(12);
        list1.add(23);
        list1.add(12);
        list1.add(23);

        /*for(int i=0;i<list1.size();i++){
            Integer element = list1.get(i);
            System.out.println(element);
        }

        for(Integer element : list1){
            System.out.println(element);
        }

        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println((iterator.next()));
        }*/

        //list1.forEach(element -> System.out.println(element));

        List<Integer> list2 = Arrays.asList(1,5,6,9,16);

        System.out.println("\n");

        //list2.stream().map(i -> i*i).filter(i->i>37).forEach(i-> System.out.println(i));

        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(10);
        list3.add(15);
        list3.add(20);
        list3.add(2,10);
        //list3.forEach(i -> System.out.println(i));

        List<Integer> numbers = Arrays.asList(2,3,4);
        numbers.stream().map(i->i*3).map(i->i*i).filter(i->i%2==0).forEach(i-> System.out.println(i));


    }
}
