package ma.education.tp1.introduction;

public class Rappel1 {

    static int vitesse = 10;
    Rappel1(int v){
        this();
        vitesse += v;
    }
    Rappel1(){
        vitesse++;
    }

    static public void main(String[] args){
        Rappel1 rappel1 = new Rappel1(20);
        Rappel1 rappel2 = new Rappel1(30);

        System.out.println(Rappel1.vitesse);
    }

}
