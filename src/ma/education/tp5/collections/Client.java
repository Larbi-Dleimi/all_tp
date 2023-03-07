package ma.education.tp5.collections;

public class Client implements Comparable{

    Integer code;
    String name;

    public Client(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
    public Client() {

    }

    @Override
    public int hashCode() {
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        Client client;
        if (obj instanceof Client) {
            client = (Client) obj;
            return this.name.length() == client.name.length();
        }
        else   return false;
    }

    @Override
    public String toString(){
        return "Client {"+
                "code =" + this.code +
                ",name = " + this.name +
                "}";
    }

    @Override
    public int compareTo(Object o){
        Client client = (Client)o;
        return -client.code+this.code;
    }


}
