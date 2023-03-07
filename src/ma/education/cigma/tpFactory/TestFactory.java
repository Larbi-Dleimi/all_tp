package ma.education.cigma.tpFactory;

public class TestFactory {

    public static void main(String[] args) throws Exception{

       // Instanciation statique
       IAbstractFactory factoryA = new FactoryImplA();

       IAbstractPlugin abstractPluginA = factoryA.newIntance();

       //abstractPluginA.operation();

       IAbstractFactory factoryB = new FactoryImplB();

       IAbstractPlugin abstractPluginB = factoryB.newIntance();

       //abstractPluginB.operation();

        // Instanciation dynamique

        IAbstractFactory factoryC = (FactoryImplA) Class.forName("ma.education.cigma.tpFactory.FactoryImplA").newInstance();

        IAbstractPlugin abstractPluginC = factoryC.newIntance();

        abstractPluginC.operation();


    }
}
