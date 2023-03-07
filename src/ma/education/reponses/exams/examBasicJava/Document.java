package ma.education.reponses.exams.examBasicJava;

public class Document {

    private int poids;
    private String titre;

    public Document(int poids){
        this("" + poids);
        this.poids += poids;
    }
    public Document(String titre){
        this.titre += titre;
    }

    public Document(int poids,String titre){
        this(++poids);
        this.poids += poids;
        this.titre += titre;
    }
    public static void m(){
        System.out.println("Document");
    }

    public static void main(String[] args){
        Document l = new Document(50,"Objets");
        System.out.println(l.poids);
        System.out.println(l.titre);

    }
}


