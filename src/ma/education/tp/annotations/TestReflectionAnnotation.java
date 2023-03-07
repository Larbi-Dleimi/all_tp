package ma.education.tp.annotations;

import java.lang.annotation.Annotation;

public class TestReflectionAnnotation {

    public static void main(String[] args) throws NullPointerException {

        //Class<?> c = Calculatrice.class;
        //Programmer programmer = (Programmer)c.getDeclaredAnnotation(Programmer.class);
        Programmer programmer = (Programmer) new CalculatriceMath().getClass().getAnnotation(Programmer.class);


        System.out.println(programmer.id());
        System.out.println(programmer.name());


    }
}
