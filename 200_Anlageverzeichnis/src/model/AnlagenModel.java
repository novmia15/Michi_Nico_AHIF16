package model;

import data.Anlage;
import data.AnlagenColumnEnum;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AnlagenModel extends AbstractTableModel
{
	private final List<Anlage> anlagen = new ArrayList<>();
	private int aktuellesJahr = (LocalDate.now()).getYear();

	public void setJahr(int jahr)
	{
		this.aktuellesJahr = jahr;
	}
	
	public int getJahr()
	{
		return aktuellesJahr;
	}
	
	@Override
	public int getRowCount()
	{
		return anlagen.size();
	}

	@Override
	public int getColumnCount()
	{
		return AnlagenColumnEnum.values().length;
	}

	@Override
	public String getColumnName(int column)
	{
		return AnlagenColumnEnum.values()[column].getName();
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex)
	{
		Anlage a = anlagen.get(rowIndex);
//        	switch(AnlagenColumnEnum.values()[columnIndex])
//		{
//			case AFABISHER: ;
//                        break;
//			case AFADIESESJAHR: ;
//                        break;
//			case BISHERIGENUTZDAUER: ;
//                        break;
//			case BUCHWERT: ;
//                        break;
//			case INBETRIEBNAHME: ;
//                        break;
//			case KAUFPREIS: ;
//                        break;
//			case NUTZUNGSDAUER: ;
//                        break;
//			case WERTVORHER: ;
//                        break;
//		} 
		return "???";
	}

	
	
}
