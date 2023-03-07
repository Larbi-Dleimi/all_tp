package ma.education.cigma.tpinterface;

public class CalculImpl2 implements ICalcul{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sous(int a, int b) {
        return a-b;
    }

    @Override
    public int mult(int a, int b) {
        return a*b;
    }

    @Override
    public int dev(int a, int b) {
        if (b>0)
            return a/b;
        return 0;
    }

    @Override
    public int somme(int a, int b) {
        return a+b+MONTANT;
    }
}
