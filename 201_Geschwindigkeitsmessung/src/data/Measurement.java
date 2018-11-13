package data;

public class Measurement
{

	private int vGemessen, vErlaubt;
	private String datum, uhrzeit, kennzeichen;

	public Measurement(int vGemessen, int vErlaubt, String datum, String uhrzeit, String kennzeichen)
	{
		this.vGemessen = vGemessen;
		this.vErlaubt = vErlaubt;
		this.datum = datum;
		this.uhrzeit = uhrzeit;
		this.kennzeichen = kennzeichen;
	}

	public int getvGemessen()
	{
		return vGemessen;
	}

	public void setvGemessen(int vGemessen)
	{
		this.vGemessen = vGemessen;
	}

	public int getvErlaubt()
	{
		return vErlaubt;
	}

	public void setvErlaubt(int vErlaubt)
	{
		this.vErlaubt = vErlaubt;
	}

	public String getDatum()
	{
		return datum;
	}

	public void setDatum(String datum)
	{
		this.datum = datum;
	}

	public String getUhrzeit()
	{
		return uhrzeit;
	}

	public void setUhrzeit(String uhrzeit)
	{
		this.uhrzeit = uhrzeit;
	}

	public String getKennzeichen()
	{
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen)
	{
		this.kennzeichen = kennzeichen;
	}

}
