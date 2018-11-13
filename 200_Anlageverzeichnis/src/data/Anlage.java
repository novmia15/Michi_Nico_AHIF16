package data;

import java.time.LocalDate;

public class Anlage
{
	private final int kaufPreis;
	private final LocalDate inbetriebnahme;
	private final double nutzungsdauer;

	public Anlage(int kaufPreis, LocalDate inbetriebnahme, double nutzungsdauer)
	{
		this.kaufPreis = kaufPreis;
		this.inbetriebnahme = inbetriebnahme;
		this.nutzungsdauer = nutzungsdauer;
	}

	public int getKaufPreis()
	{
		return kaufPreis;
	}

	public LocalDate getInbetriebnahme()
	{
		return inbetriebnahme;
	}

	public double getNutzungsdauer()
	{
		return nutzungsdauer;
	}
	
	public double getBisherigeNutzdauer()
	{
		return 0;
	}
	
	public double getAfabisher()
	{
		return 0;
	}
	
	public double getWertvorAfa()
	{
		return 0;
	}
	
	public double getAfadiesesJahres()
	{
		return 0;
	}
	
	public double getBuchwert()
	{
		return 0;
	}
}
