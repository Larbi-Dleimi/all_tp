package ma.education.cigma.tpinterface;

public interface ICalcul {
    int add(int a,int b);
    int sous(int a,int b);
    int mult(int a,int b);
    int dev(int a,int b);
    int somme(int a,int b);

    int MONTANT = 1000;

   default void afficher(){};

}
