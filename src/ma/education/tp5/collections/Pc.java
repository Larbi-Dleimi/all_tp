package ma.education.tp5.collections;

public class Pc {

    String serial;
    double price;

    public Pc(String serial, double price) {
        this.serial = serial;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Pc {"+
                "serial =" + this.serial +
                ",price = " + this.price +
                "}";
    }
}
