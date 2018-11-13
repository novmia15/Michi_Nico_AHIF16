package gui;

import data.Measurement;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VelocityDlg extends javax.swing.JDialog
{
	private boolean isOk;

	public VelocityDlg(java.awt.Frame parent, boolean modal) throws InterruptedException
	{
		super(parent, modal);
		initComponents();
		isOk = false;
		LocalDateTime ldt = LocalDateTime.now();
		this.tfDatum.setText(ldt.getDayOfMonth() + "." + ldt.getMonth().getValue() + "." + ldt.getYear());
		this.tfUhrzeit.setText(ldt.getHour() + ":" + ldt.getMinute());
	}

	public boolean isOk()
	{
		return isOk;
	}

	public Measurement messung()
	{
		Measurement daten = new Measurement(Integer.parseInt(this.tfVG.getText()), Integer.parseInt(this.tfVE.getText()), this.tfDatum.getText(), this.tfUhrzeit.getText(), this.tfKennzeichen.getText());
		return daten;
	}

	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jLabel1 = new javax.swing.JLabel();
    tfDatum = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    tfUhrzeit = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    tfKennzeichen = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    tfVG = new javax.swing.JTextField();
    ln = new javax.swing.JLabel();
    tfVE = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridLayout(0, 2));

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Datum:");
    getContentPane().add(jLabel1);

    tfDatum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    tfDatum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    tfDatum.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        tfDatumActionPerformed(evt);
      }
    });
    getContentPane().add(tfDatum);

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Uhrzeit:");
    getContentPane().add(jLabel2);

    tfUhrzeit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    tfUhrzeit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    getContentPane().add(tfUhrzeit);

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Kennzeichen:");
    getContentPane().add(jLabel3);

    tfKennzeichen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    tfKennzeichen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    getContentPane().add(tfKennzeichen);

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setText("V-Gemessen");
    getContentPane().add(jLabel4);

    tfVG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    tfVG.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    getContentPane().add(tfVG);

    ln.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    ln.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    ln.setText("V-Erlaubt:");
    getContentPane().add(ln);

    tfVE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    tfVE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    tfVE.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        tfVEActionPerformed(evt);
      }
    });
    getContentPane().add(tfVE);

    jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton1.setText("Hinzufügen");
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onOk(evt);
      }
    });
    getContentPane().add(jButton1);

    jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton2.setText("Abbrechen");
    jButton2.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onCancel(evt);
      }
    });
    getContentPane().add(jButton2);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void onOk(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onOk
  {//GEN-HEADEREND:event_onOk
		boolean fehler = false;
		if (this.tfKennzeichen.getText().equals("") || this.tfVE.getText().equals("") || this.tfVG.getText().equals(""))
		{
			this.isOk = false;
			fehler = true;

			if (this.tfKennzeichen.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this, "Sie haben kein Kennzeichen angegeben", "fehlende Eingabe", JOptionPane.ERROR_MESSAGE);
			}
			else if (this.tfVE.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this, "Sie haben nicht die erlaubte Fahrteschwindigkeit angegeben", "fehlende Eingabe", JOptionPane.ERROR_MESSAGE);
			}
			else if (this.tfVG.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this, "Sie haben nicht die Fahrtgeschwindigkeit angegeben", "fehlende Eingabe", JOptionPane.ERROR_MESSAGE);
			}
		}
		else
		{
			try
			{
				if (Integer.parseInt(this.tfVE.getText()) <= 0)
				{
					fehler = true;
					JOptionPane.showMessageDialog(this, "Es gibt leider keine erlaubte Negativgeschwindigkeit", "Negativgeschwindigkeit", JOptionPane.INFORMATION_MESSAGE);
				}
				else if (Integer.parseInt(this.tfVG.getText()) <= 0)
				{
					fehler = true;
					JOptionPane.showMessageDialog(this, "Welcher Idiot fährt bei der Polizei rückwärts vorbei?", "Ein Idiot", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			catch (Exception ex)
			{
				JOptionPane.showMessageDialog(this, "Sie haben in einem Geschwindigkeitsfeld keine Zahl angegeben", "Keine Zahl", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (!fehler)
		{
			this.isOk = true;
			fehler = false;
		}
		setVisible(fehler);
  }//GEN-LAST:event_onOk

  private void onCancel(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onCancel
  {//GEN-HEADEREND:event_onCancel
		isOk = false;
		setVisible(false);
  }//GEN-LAST:event_onCancel

  private void tfDatumActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tfDatumActionPerformed
  {//GEN-HEADEREND:event_tfDatumActionPerformed
		// TODO add your handling code here:
  }//GEN-LAST:event_tfDatumActionPerformed

  private void tfVEActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tfVEActionPerformed
  {//GEN-HEADEREND:event_tfVEActionPerformed
		// TODO add your handling code here:
  }//GEN-LAST:event_tfVEActionPerformed

	public static void main(String args[])
	{
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
			java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(VelocityDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				VelocityDlg dialog = null;
				try
				{
					dialog = new VelocityDlg(new javax.swing.JFrame(), true);
				}
				catch (InterruptedException ex)
				{
					Logger.getLogger(VelocityDlg.class.getName()).log(Level.SEVERE, null, ex);
				}
				dialog.addWindowListener(new java.awt.event.WindowAdapter()
				{
					@Override
					public void windowClosing(java.awt.event.WindowEvent e)
					{
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel ln;
  private javax.swing.JTextField tfDatum;
  private javax.swing.JTextField tfKennzeichen;
  private javax.swing.JTextField tfUhrzeit;
  private javax.swing.JTextField tfVE;
  private javax.swing.JTextField tfVG;
  // End of variables declaration//GEN-END:variables
}
