package ma.education.tp4.singleton;

public class Connexion {

    String login;
    String password;

    private static Connexion instance;

    private Connexion(String login,String password){

        this.login = login;
        this.password = password;

    }


    public static Connexion getInstance(String login,String password){

        if(instance == null)
            instance = new Connexion(login,password);

        return instance;

    }
    @Override
    public String toString(){

        return "[ login = "+this.login+" password = "+this.password+" ]";
    }
}
