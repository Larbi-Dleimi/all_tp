package ma.education.tp1.introduction;

public class Test {

    public static void main(String[] args){

        // Instanciation des objets
        //Salle o1 = new Salle();
        Salle o2 = new Salle("Salle Informatique");
        Salle o3 = new Salle(2,"Salle des cours");

        // Objet o1
        //System.out.print(" id de l'objet 1 : "+o1.id);
        //System.out.print(" nom de l'objet 1 : "+o1.nom);
        // Objet o2
        System.out.print("\n id de l'objet 2 : "+o2.id);
        System.out.print(" nom de l'objet 2 : "+o2.nom);
        // Objet o3
        System.out.print("\n id de l'objet 3 : "+o3.id);
        System.out.print(" nom de l'objet 3 : "+o3.nom);



    }
}
