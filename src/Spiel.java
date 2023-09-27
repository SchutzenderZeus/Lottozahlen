import java.util.LinkedList;


public class Spiel extends Karte{

    public static Karte aktuelleKarte = new Karte();
    public static int gezogeneKarten = 0;
    public static int entfernteKarten = 0;
    public static int position = 0;


    static LinkedList<Karte> geKarten = new LinkedList<Karte>();
static LinkedList<Karte> satz = new LinkedList<Karte>();


    public static void main(String[] args) {


        for (int i=0;i<=10;i++){
            karteAnlegen();
            zeigeAktuelleKarte();
            //System.out.println(geKarten.get(i).getWort());
            karteZiehen();
        }
        getGesamtPunktzahl();
        infoAusgeben();


    }

public Spiel(){

}


    public static void karteZiehen(){
        if (gezogeneKarten < 10){
            gezogeneKarten = gezogeneKarten+1;
            geKarten.add(aktuelleKarte);
            aktuelleKarte = new Karte();
        }
        else{
            System.out.println("Es wurden bereits 10 Karten gezogen");
        }
    }

    public static void zeigeAktuelleKarte(){
        System.out.println(aktuelleKarte.getWort());
        System.out.println(aktuelleKarte.getWert());
    }

    public static void karteAnlegen(){
        satz.add(position,aktuelleKarte);
        position++;
    }

    public static void entferneKarte(){
        satz.remove(position);
    }

    public static void infoAusgeben(){
        for (int i=0;i<satz.size();i++){

            System.out.print(satz.get(i).getWort()+" ");
        }

    }
    public static void getGesamtPunktzahl(){
        int ergebnis= 0;
        int aktuell=0;

        for (int i=0;i<10;i++){
            karteZiehen();
            aktuell = satz.get(i).getWert();
            ergebnis = ergebnis+aktuell;
        }
        System.out.println("Aktueller Punktestand: "+ergebnis);
    }

    public static void positionsBestimmung(){
    position = 1;
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
