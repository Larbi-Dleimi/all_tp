import ma.education.tp1.introduction.Salle;

public class Main {
    public static void main(String[] args) {
        AccesHorsPackage test = new AccesHorsPackage(3,"Salle 3");
        Salle salle2 = new AccesHorsPackage(4,"Salle 4");

        test.afficher(salle2);
    }
}