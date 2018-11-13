package data;

public enum AnlagenColumnEnum
{
	KAUFPREIS("Kaufpreis"),
	INBETRIEBNAHME("Inbetriebnahme"),
	NUTZUNGSDAUER("Nutzdauer"),
	BISHERIGENUTZDAUER("Nutzdauer bisher"),
	AFABISHER("Afa bisher"),
	WERTVORHER("Wert vorher"),
	AFADIESESJAHR("Afa dieses Jahr"),
	BUCHWERT("Buchwert");

	private String name;

	private AnlagenColumnEnum(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
}
