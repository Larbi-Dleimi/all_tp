package ma.education.tp.abstarctkeyword;

public abstract class FormeGeometrique {

    double surface;

    public abstract double CalculerSurface();

    public void afficherSurface(){
        System.out.println(this.surface);
    }
}
