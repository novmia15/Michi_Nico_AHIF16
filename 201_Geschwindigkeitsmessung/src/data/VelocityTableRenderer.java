package data;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class VelocityTableRenderer extends JLabel implements TableCellRenderer
{

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	{
		setText(value.toString());
		this.setOpaque(true); //Sonst kannste nix machen
		this.setForeground(Color.BLACK); //Schrift

		if (column != 5)
		{
			this.setBackground(Color.WHITE);
		}
		else
		{
			if (Integer.parseInt(value.toString()) > 30)
			{
				this.setBackground(Color.RED);
			}
			else if (Integer.parseInt(value.toString()) > 20)
			{
				this.setBackground(Color.ORANGE);
			}
			else if (Integer.parseInt(value.toString()) > 10)
			{
				this.setBackground(Color.YELLOW);
			}
			else
			{
				this.setBackground(Color.BLUE);
			}
		}
		return this;
	}

}
