package ma.education.tp2.reflection;
import ma.education.tp1.introduction.Salle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection  {


    public static void main(String[] args) throws
            InstantiationException,
            IllegalAccessException,
            IllegalArgumentException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException {

        Class<Salle> metadata = Salle.class;

        // Récupération des attributs de la classe Salle
        Field[] attributes = metadata.getFields();

        for(Field attribute : attributes){
            System.out.println(attribute.getName());
        }

        // Récupération des méthodes de la classe Salle
        Method[] methods = metadata.getMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }

        // Récupération des constructeurs de la classe Salle
        Constructor[] constructors = metadata.getConstructors();

        // Instanciation des objets via le concept de la réflexion
        Salle o1 = (Salle)constructors[0].newInstance();
        Salle o2 = (Salle)constructors[1].newInstance("Salle informatique");
        Salle o3 = (Salle)constructors[2].newInstance(2,"Salle de cours");

        // Objet o1
        //System.out.print("id de l'objet 1 : "+o1.id);
        //System.out.print(" nom de l'objet 1 : "+o1.nom);
        // Objet o2
        System.out.print("\nid de l'objet 2 : "+o2.id);
        System.out.print(" nom de l'objet 2 : "+o2.nom);
        // Objet o3
        System.out.print("\nid de l'objet 3 : "+o3.id);
        System.out.print(" nom de l'objet 3 : "+o3.nom);

        // 6- Compraison des deux objets o2 et o3
        System.out.println("\nCompare object o2 with o3 : "+o2.equals(o3));

    }

}
