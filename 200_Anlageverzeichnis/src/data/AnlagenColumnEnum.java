package data;

public enum AnlagenColumnEnum
{
        BEZEICHNUNG("Bezeichnung"),
	KAUFPREIS("AK"),
	INBETRIEBNAHME("Inbetriebnahme"),
	NUTZUNGSDAUER("ND"),
	BISHERIGENUTZDAUER("bish. ND"),
	AFABISHER("Afa bisher"),
	WERTVORHER("Wert vorher"),
	AFADIESESJAHR("Afa d. J."),
	BUCHWERT("BW 31.12");

	private final String name;

	private AnlagenColumnEnum(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}
}
