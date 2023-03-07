package ma.education.reponses.exams.examBasicJava;

import ma.education.cigma.tpabstract.FormeGeoA;

public class Livre extends FormeGeoA {

    static final String ref;

    static {ref="TEST10";}
    public Livre(){
        System.out.println("");
    }

    public Livre(String ref){
        this();
        System.out.println(ref);
    }
    protected double calculerSurgace() {
        return 0;
    }

    public static void m(){
        System.out.println("Livre");
    }
}
