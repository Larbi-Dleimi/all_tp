package ma.education.cigma.tpFactory;

public class FactoryImplB implements IAbstractFactory{
    @Override
    public IAbstractPlugin newIntance() {
        return new PluginImplB();
    }
}
