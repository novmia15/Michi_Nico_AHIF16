package gui;

import dal.DAL;
import data.Measurement;
import data.VelocityTableRenderer;
import data.VelocityTableModel;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VelocityGUI extends javax.swing.JFrame
{

	private ArrayList<Measurement> measurements = new ArrayList<>();
	private VelocityTableModel vtm;
	private VelocityTableRenderer vtr;
	private DAL dal;

	public VelocityGUI()
	{
		dal = new DAL();
		initComponents();
		vtm = new VelocityTableModel();
		vtr = new VelocityTableRenderer();
		this.jTable1.setModel(vtm);
		this.jTable1.setDefaultRenderer(Object.class, vtr);
		startDaten();
	}

	private void startDaten()
	{
		measurements.add(new Measurement(123, 80, "08.10.2013", "08:31", "GU-RASER1"));
		measurements.add(new Measurement(118, 80, "08.10.2013", "08:31", "GU-RASER1"));
		measurements.add(new Measurement(123, 100, "08.10.2013", "08:31", "GU-RASER1"));
		measurements.add(new Measurement(123, 110, "08.10.2013", "08:31", "GU-RASER1"));

		for (Measurement m : measurements)
		{
			vtm.add(m);
		}

		this.jTable1.updateUI();
		this.jTable1.setDefaultRenderer(Object.class, vtr);
	}

	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    pmPopup = new javax.swing.JPopupMenu();
    jMenuItem4 = new javax.swing.JMenuItem();
    jMenuItem5 = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JPopupMenu.Separator();
    jMenuItem6 = new javax.swing.JMenuItem();
    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenuItem2 = new javax.swing.JMenuItem();

    jMenuItem4.setText("Hinzufügen");
    jMenuItem4.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onAddMeasure(evt);
      }
    });
    pmPopup.add(jMenuItem4);

    jMenuItem5.setText("Löschen");
    jMenuItem5.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onRemoveMeasure(evt);
      }
    });
    pmPopup.add(jMenuItem5);
    pmPopup.add(jSeparator1);

    jMenuItem6.setText("Durchschnitt");
    jMenuItem6.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onDisplayAverage(evt);
      }
    });
    pmPopup.add(jMenuItem6);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.addMouseListener(new java.awt.event.MouseAdapter()
    {
      public void mouseReleased(java.awt.event.MouseEvent evt)
      {
        onPopup(evt);
      }
    });
    jPanel1.setLayout(new java.awt.BorderLayout());

    jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter()
    {
      public void mouseReleased(java.awt.event.MouseEvent evt)
      {
        onPopup(evt);
      }
    });

    jTable1.setModel(new VelocityTableModel());
    jTable1.setUpdateSelectionOnSort(false);
    jTable1.addMouseListener(new java.awt.event.MouseAdapter()
    {
      public void mouseReleased(java.awt.event.MouseEvent evt)
      {
        onPopup(evt);
      }
    });
    jScrollPane1.setViewportView(jTable1);

    jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    jMenu1.setText("Datei");

    jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
    jMenuItem1.setText("Speichern");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onSaveData(evt);
      }
    });
    jMenu1.add(jMenuItem1);

    jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
    jMenuItem2.setText("Laden");
    jMenuItem2.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onLoadData(evt);
      }
    });
    jMenu1.add(jMenuItem2);

    jMenuBar1.add(jMenu1);

    setJMenuBar(jMenuBar1);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void onPopup(java.awt.event.MouseEvent evt)//GEN-FIRST:event_onPopup
  {//GEN-HEADEREND:event_onPopup
		if (evt.getButton() == MouseEvent.BUTTON3)
		{
			this.pmPopup.show(this, evt.getX() + 9, evt.getY() + 54);
		}
  }//GEN-LAST:event_onPopup

  private void onAddMeasure(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onAddMeasure
  {//GEN-HEADEREND:event_onAddMeasure
		VelocityDlg dlg;
		try
		{
			dlg = new VelocityDlg(this, true);
			dlg.setVisible(true);
			if (dlg.isOk())
			{
				vtm.add(dlg.messung());
				measurements.add(dlg.messung());
				this.jTable1.updateUI();
				this.jTable1.setDefaultRenderer(Object.class, vtr);
			}
		}
		catch (InterruptedException ex)
		{
			Logger.getLogger(VelocityGUI.class.getName()).log(Level.SEVERE, null, ex);
		}
  }//GEN-LAST:event_onAddMeasure

  private void onRemoveMeasure(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onRemoveMeasure
  {//GEN-HEADEREND:event_onRemoveMeasure
		int[] g = this.jTable1.getSelectedRows();
		for (int i = g.length - 1; i >= 0; i--)
		{
			vtm.remove(g[i]);
			measurements.remove(i);
		}
		this.jTable1.updateUI();
  }//GEN-LAST:event_onRemoveMeasure

  private void onDisplayAverage(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onDisplayAverage
  {//GEN-HEADEREND:event_onDisplayAverage
		JOptionPane.showMessageDialog(this, "Die durchschnittliche Übertretung beträgt " + String.format("%.2f", vtm.average()) + " km/h", "Durchschnittsübertretung", JOptionPane.INFORMATION_MESSAGE);
  }//GEN-LAST:event_onDisplayAverage

  private void onSaveData(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onSaveData
  {//GEN-HEADEREND:event_onSaveData
		try
		{
			System.out.println("Vor dem Speichern");
			dal.writeData(measurements);
			System.out.println("Nach dem Speichern");
		}
		catch (Exception e)
		{
			System.err.println("Fehler beim Speichern \n" + e.getMessage());
		}
  }//GEN-LAST:event_onSaveData

  private void onLoadData(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onLoadData
  {//GEN-HEADEREND:event_onLoadData
		try
		{
			measurements = dal.readData();
			for (Measurement m : measurements)
			{
				vtm.add(m);
				measurements.add(m);
			}
			this.jTable1.updateUI();
			this.jTable1.setDefaultRenderer(Object.class, vtr);
		}
		catch (Exception e)
		{
			System.err.println("Fehler beim Laden \n" + e.getMessage());
		}
  }//GEN-LAST:event_onLoadData

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try
		{
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(VelocityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(VelocityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(VelocityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(VelocityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new VelocityGUI().setVisible(true);
			}
		});
	}

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JMenuItem jMenuItem4;
  private javax.swing.JMenuItem jMenuItem5;
  private javax.swing.JMenuItem jMenuItem6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JPopupMenu.Separator jSeparator1;
  private javax.swing.JTable jTable1;
  private javax.swing.JPopupMenu pmPopup;
  // End of variables declaration//GEN-END:variables

	private VelocityTableRenderer VelocityTableRenderer()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
