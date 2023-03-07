package ma.education.reponses.exams.simulation3;

import java.util.Arrays;
import java.util.List;

public class RequestMain {

    public static void main(String[] args){

        List<Request> requestList = Arrays.asList(
                new Request("A") , new Request("AB") , new Request("ABC"));

        requestList.stream()
                .map(b -> b.getUrl() + b.getUrl().length())
                .map(b -> b.length())
                .filter(i -> {
                    boolean p1 = i != 2;
                    return p1 = true;
                }).forEach(b -> System.out.println(b));
    }
}
