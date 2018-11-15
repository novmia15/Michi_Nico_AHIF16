package data;

import java.time.LocalDate;

public class Anlage {

    private final int kaufPreis;
    private final double inbetriebnahme;
    private final double nutzungsdauer;
    private final int jahr = (LocalDate.now()).getYear();

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
        return (nutzungsdauer + inbetriebnahme) - jahr;
    }

    public double getAfabisher() {
        return (kaufPreis / nutzungsdauer) / ((nutzungsdauer + inbetriebnahme) - jahr);
    }

    public double getWertvorAfa() {
        return kaufPreis - (kaufPreis / nutzungsdauer) / ((nutzungsdauer + inbetriebnahme) - jahr);
    }

    public double getAfadiesesJahres() {
        return kaufPreis / nutzungsdauer;
    }

    public double getBuchwert() {
        return kaufPreis - (kaufPreis / nutzungsdauer) / ((nutzungsdauer + inbetriebnahme) - jahr) - (kaufPreis / nutzungsdauer);
    }

}
