package ma.education.reponses.exams.examABDTWJAVABASEV1;

public class Citoyen {

    int id;
    String nom;
    String cin;
    float age;

    public Citoyen(){
    }

    public Citoyen(int id,String nom,String cin,float age){

        this.id = id;
        this.nom = nom;
        this.cin = cin;
        this.age = age;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setId(String nom){
        this.nom = nom;
    }


    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getCin(){
        return this.cin;
    }

    public void setCin(String cin){
        this.cin = cin;
    }

    public float getAge(){
        return this.age;
    }

    public void setAge(float age){
        this.age = age;
    }

    public static void main(String[] args){

        Citoyen c1 = new Citoyen();
        Citoyen c2 = new Citoyen(10,"AAAA","ABC123",20);
    }
}
