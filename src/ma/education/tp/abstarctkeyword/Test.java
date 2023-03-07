package ma.education.tp.abstarctkeyword;


public class Test {

    static public void main(String[] args){

        //FormeGeometrique f1 = new FormeGeometrique();
        //FormeGeometrique f2 = new FormeGeoTypeA();
        FormeGeometrique f3 = new Triangle();
        FormeGeometrique f4 = new FormeGeometrique() {
            @Override
            public double CalculerSurface() {
                return 0;
            }
        };
    }
}
