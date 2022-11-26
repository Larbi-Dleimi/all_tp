import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle {

    public AccesHorsPackage(long id,String nom){
        super(id,nom);
    }

    public void afficher(Salle s){

        //System.out.println(s.id);
        //System.out.println(s.nom);
        System.out.println(this.id);
        System.out.println(this.nom);

    }

}
