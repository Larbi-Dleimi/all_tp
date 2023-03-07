package ma.education.reponses.exams.simulation3;

import ma.education.tp4.singleton.Connexion;

public class Container {

    private String name;
    private int id;
    private int size;

    public Container(String name, int id, int size) {
        this.name = name;
        this.id = id;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return id % 3 + size;
    }

    @Override
    public boolean equals(Object obj) {
        Container c = (Container) obj;
        return !c.name.equals(this.name) && !(c.name.length() == this.name.length());
    }

    @Override
    public String toString() {
        return "Container{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", size=" + size +
                '}';
    }
}
