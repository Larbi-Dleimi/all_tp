package ma.education.tp5.collections;

public class Salle {

    int num;
    String name;

    public Salle(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.num+this.name.length();
    }

    @Override
    public boolean equals(Object obj) {
        Salle s = (Salle) obj;
        return s.num == this.name.length();
    }

    @Override
    public String toString(){
        return "Salle {"+
                "num =" + this.num +
                ",name = " + this.name +
                "}";
    }

}
