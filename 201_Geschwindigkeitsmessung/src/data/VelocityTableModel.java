package data;

import data.Measurement;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class VelocityTableModel extends AbstractTableModel
{

	private ArrayList<Measurement> messungen;
	private static String[] col_NAMES =
	{
		"Datum", "Uhrzeit", "Kennzeichen", "Gemessen", "Erlaubt", "Übertretung"
	};
	private static Class[] col_CLASSES =
	{
		String.class, String.class, String.class, Integer.class, Integer.class, Integer.class
	};

	public double average()
	{
		double a = 0;

		Measurement m;

		for (int i = 0; i < messungen.size(); i++)
		{
			m = messungen.get(i);
			a += m.getvGemessen()-m.getvErlaubt();
		}

		return a = a / messungen.size();
	}

	public VelocityTableModel()
	{
		messungen = new ArrayList();
	}

	public void add(Measurement objData)
	{
		messungen.add(objData);
	}

	public void remove(int index)
	{
		messungen.remove(index);
	}

	@Override
	public int getRowCount()
	{
		return messungen.size();
	}

	@Override
	public int getColumnCount()
	{
		return col_CLASSES.length;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex)
	{
		return col_CLASSES[columnIndex];
	}

	@Override
	public String getColumnName(int column)
	{
		return col_NAMES[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex)
	{
		switch (columnIndex)
		{
			case 0:
				return messungen.get(rowIndex).getDatum();
			case 1:
				return messungen.get(rowIndex).getUhrzeit();
			case 2:
				return messungen.get(rowIndex).getKennzeichen();
			case 3:
				return messungen.get(rowIndex).getvGemessen();
			case 4:
				return messungen.get(rowIndex).getvErlaubt();
			case 5:
				return (messungen.get(rowIndex).getvGemessen()) - (messungen.get(rowIndex).getvErlaubt());
		}
		return "???";
	}

}
