package data;

//import java.time.LocalDate;
public class Anlage {

    private final int kaufPreis;
    private final double inbetriebnahme;
    private final double nutzungsdauer;

    public Anlage(int kaufPreis, double inbetriebnahme, double nutzungsdauer) {
        this.kaufPreis = kaufPreis;
        this.inbetriebnahme = inbetriebnahme;
        this.nutzungsdauer = nutzungsdauer;
    }

    public int getKaufPreis() {
        return kaufPreis;
    }

    public double getInbetriebnahme() {
        return inbetriebnahme;
    }

    public double getNutzungsdauer() {
        return nutzungsdauer;
    }

    public double getBisherigeNutzdauer() {
        //System.out.println("Bisher. Nutzdauer: "+((nutzungsdauer+inbetriebnahme)-2018));
        return (nutzungsdauer + inbetriebnahme) - 2018;
    }

    public double getAfabisher() {
        //System.out.println("Afa bisher: "+((kaufPreis/nutzungsdauer)/((nutzungsdauer+inbetriebnahme)-2018)));
        return (kaufPreis / nutzungsdauer) / ((nutzungsdauer + inbetriebnahme) - 2018);
    }

    public double getWertvorAfa() {
        //System.out.println("Wert vor Afa: "+(kaufPreis-(kaufPreis/nutzungsdauer)/((nutzungsdauer+inbetriebnahme)-2018)));
        return kaufPreis - (kaufPreis / nutzungsdauer) / ((nutzungsdauer + inbetriebnahme) - 2018);
    }

    public double getAfadiesesJahres() {
        //System.out.println("AfadJ: "+(kaufPreis/nutzungsdauer));
        return kaufPreis / nutzungsdauer;
    }

    public double getBuchwert() {
        //System.out.println("Buchwert: "+(kaufPreis-(kaufPreis/nutzungsdauer)/((nutzungsdauer+inbetriebnahme)-2018)-(kaufPreis/nutzungsdauer)));
        return kaufPreis - (kaufPreis / nutzungsdauer) / ((nutzungsdauer + inbetriebnahme) - 2018) - (kaufPreis / nutzungsdauer);
    }

}
