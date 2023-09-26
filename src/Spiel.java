import java.util.LinkedList;


public class Spiel extends Karte{

    static Karte aktuelleKarte = new Karte();
    public static int gezogeneKarten = 0;
    public static int entfernteKarten = 0;

LinkedList<Karte> satz = new LinkedList<Karte>();

    public static void main(String[] args) {

        zeigeAktuelleKarte();


    }

public Spiel(){

}


    public static void karteZiehen(){
        if (gezogeneKarten < 10){
            gezogeneKarten = gezogeneKarten+1;
        }
    }

    public static void zeigeAktuelleKarte(){
        System.out.println(aktuelleKarte);
    }

    @Override
    public String getWort() {
        return super.getWort();
    }
    @Override
    public int getWert() {
        return super.getWert();
    }
}
