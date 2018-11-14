package model;

import data.Anlage;
import java.awt.Component;
import java.awt.Label;
import javax.swing.JTable;

public class TableCellRenderer implements javax.swing.table.TableCellRenderer
{

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	{
		Anlage a = (Anlage)value;
		Label label = new Label();
		
	  //if(a.get)
		
		return label;
	}
	
}
