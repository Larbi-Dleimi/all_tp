package ma.education.cigma.tpFactory;

public class PluginImplA implements IAbstractPlugin{
    @Override
    public void operation() {
        System.out.println("traitement pour le Plugin A");
    }
}
