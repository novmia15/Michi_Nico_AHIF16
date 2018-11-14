package gui;

import model.AnlagenModel;

public class AnlagenverzeichnisGUI extends javax.swing.JFrame
{
	private AnlagenModel model;
	public AnlagenverzeichnisGUI()
	{
		initComponents();
		model = new AnlagenModel();
		this.jtTable.setModel(model);
	}

	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {
    java.awt.GridBagConstraints gridBagConstraints;

    jScrollPane1 = new javax.swing.JScrollPane();
    jtTable = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jComboBox1 = new javax.swing.JComboBox<>();
    jButton1 = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(1000, 300));

    jtTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][]
      {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String []
      {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane1.setViewportView(jtTable);

    getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

    jPanel1.setLayout(new java.awt.GridBagLayout());

    jLabel1.setText("Year");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.4;
    gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
    jPanel1.add(jLabel1, gridBagConstraints);

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
    jPanel1.add(jComboBox1, gridBagConstraints);

    jButton1.setText("Update Table");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 0.9;
    gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
    jPanel1.add(jButton1, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 8.0;
    gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
    jPanel1.add(jLabel2, gridBagConstraints);

    getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

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
  private javax.swing.JButton jButton1;
  private javax.swing.JComboBox<String> jComboBox1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jtTable;
  // End of variables declaration//GEN-END:variables
}
