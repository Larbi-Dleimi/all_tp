package ma.education.cigma.tpFactory;

public class FactoryImplA implements IAbstractFactory {
    @Override
    public IAbstractPlugin newIntance() {
        return new PluginImplA();
    }
}
