package ma.education.tp1.introduction;

public class TestHeritage {

    public static void main(String [] args){
        Byte nbrPlace = 20;
        Salle s1 = new SalleCours(1,"Salle 1",nbrPlace);
        SalleCours s2 = new SalleCours(2,"Salle 2",nbrPlace);
        SalleCours s3 = (SalleCours)s1;
        SalleCours s4 = s2;

        Salle s5 = new Laboratoire(2,"LABO","CHIMIE");
        SalleCours s6 = new SalleCours(2,"Salle 2",nbrPlace);
        SalleCours s7 = (SalleCours)s5;
        SalleCours s8 = s6;

        Object o1 = new SalleCours();


    }
}
