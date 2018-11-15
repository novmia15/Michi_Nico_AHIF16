package gui;

import model.AnlagenModel;

public class AnlagenverzeichnisGUI extends javax.swing.JFrame
{
	private final AnlagenModel model;
        
	public AnlagenverzeichnisGUI()
	{
		initComponents();
		model = new AnlagenModel();
		this.jtTable.setModel(model);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jtTable = new javax.swing.JTable();
        paeingabe = new javax.swing.JPanel();
        lbjahr = new javax.swing.JLabel();
        cbauswahl = new javax.swing.JComboBox<>();
        btupdate = new javax.swing.JButton();
        lbleer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTable);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        paeingabe.setLayout(new java.awt.GridBagLayout());

        lbjahr.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        paeingabe.add(lbjahr, gridBagConstraints);

        cbauswahl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        paeingabe.add(cbauswahl, gridBagConstraints);

        btupdate.setText("Update Table");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        paeingabe.add(btupdate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 8.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        paeingabe.add(lbleer, gridBagConstraints);

        getContentPane().add(paeingabe, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
			java.util.logging.Logger.getLogger(AnlagenverzeichnisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(AnlagenverzeichnisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(AnlagenverzeichnisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(AnlagenverzeichnisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new AnlagenverzeichnisGUI().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btupdate;
    private javax.swing.JComboBox<String> cbauswahl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTable;
    private javax.swing.JLabel lbjahr;
    private javax.swing.JLabel lbleer;
    private javax.swing.JPanel paeingabe;
    // End of variables declaration//GEN-END:variables
}
