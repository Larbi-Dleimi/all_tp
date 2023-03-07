package ma.education.cigma.tpcollections;

public class Voiture {

    double poids;
    String matricule;

    public Voiture(double poids, String matricule) {
        this.poids = poids;
        this.matricule = matricule;
    }

    @Override
    public int hashCode() {
        return matricule.length();
    }

    @Override
    public boolean equals(Object obj) {
        Voiture voiture = (Voiture) obj;
        return voiture.matricule.equals(this.matricule);
    }

    @Override
    public String toString(){
        return "Voiture {"+
                "code =" + this.poids +
                ",name = " + this.matricule +
                "}";
    }
}
