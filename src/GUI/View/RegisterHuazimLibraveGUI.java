/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Autori;
import BLL.HuazimiLibrit;
import BLL.KategoriaLibrit;
import BLL.Klienti;
import BLL.Libri;
import DAL.HuazimiRepository;
import DAL.KlientiRepository;
import DAL.LibraryException;
import GUI.Model.HuazimiLibritTableModel;
import GUI.Model.KlientiComboBoxModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static org.eclipse.persistence.internal.jpa.metadata.xml.XMLEntityMappingsReader.clear;

/**
 *
 * @author Alma
 */
public class RegisterHuazimLibraveGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterHuazimLibraveGUI
     */
    
    HuazimiRepository huazimiRepository = new HuazimiRepository();
    HuazimiLibritTableModel huazimiLibritTableModel = new HuazimiLibritTableModel();
    KlientiRepository klientiRepository = new KlientiRepository();
    
    
    KlientiComboBoxModel klientiComboBoxModel = new KlientiComboBoxModel();
    
    public RegisterHuazimLibraveGUI() {
        initComponents();
        loadComboBoxKlientet();
        loadTableKlientet();
    }
    
    
    public void loadComboBoxKlientet(){
        try{
            List<Klienti> lista = klientiRepository.findAll();
            klientiComboBoxModel.add(lista);
            klientetCmb.setModel(klientiComboBoxModel);
            klientetCmb.repaint();
            
        } catch (LibraryException ex) {
            Logger.getLogger(RegisterHuazimLibraveGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void loadTableKlientet(){
        try {
            List<HuazimiLibrit> lista = huazimiRepository.findAll();
            huazimiLibritTableModel.addList(lista);
            table.setModel(huazimiLibritTableModel);
            huazimiLibritTableModel.fireTableDataChanged();
        } catch (LibraryException ex) {
            Logger.getLogger(RegisterHuazimLibraveGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitelPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddClientPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PublishingYearLabel = new javax.swing.JLabel();
        isbnCodeTextField = new javax.swing.JTextField();
        QuantityLabel = new javax.swing.JLabel();
        AddClientButton = new javax.swing.JButton();
        DeleteClientButton = new javax.swing.JButton();
        AuthorLabel = new javax.swing.JLabel();
        NrAuthorsLabel = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        klientetCmb = new javax.swing.JComboBox<>();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitelPanel.setBackground(new java.awt.Color(153, 153, 153));
        TitelPanel.setMaximumSize(new java.awt.Dimension(800, 100));
        TitelPanel.setMinimumSize(new java.awt.Dimension(800, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Regjistro Huazuesin e librit");

        javax.swing.GroupLayout TitelPanelLayout = new javax.swing.GroupLayout(TitelPanel);
        TitelPanel.setLayout(TitelPanelLayout);
        TitelPanelLayout.setHorizontalGroup(
            TitelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitelPanelLayout.createSequentialGroup()
                .addContainerGap(556, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(431, 431, 431))
        );
        TitelPanelLayout.setVerticalGroup(
            TitelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitelPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        AddClientPanel.setBackground(new java.awt.Color(204, 204, 204));
        AddClientPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        AddClientPanel.setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        PublishingYearLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PublishingYearLabel.setText("Klienti");

        isbnCodeTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        isbnCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnCodeTextFieldActionPerformed(evt);
            }
        });

        QuantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QuantityLabel.setText("ISBN Kodi");

        AddClientButton.setBackground(new java.awt.Color(51, 255, 51));
        AddClientButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddClientButton.setText("Save");
        AddClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClientButtonActionPerformed(evt);
            }
        });

        DeleteClientButton.setBackground(new java.awt.Color(255, 51, 102));
        DeleteClientButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DeleteClientButton.setText("Delete");
        DeleteClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteClientButtonActionPerformed(evt);
            }
        });

        AuthorLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AuthorLabel.setText("Data kthimit");

        NrAuthorsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NrAuthorsLabel.setText("Data Leshimit");

        CancelButton.setBackground(new java.awt.Color(0, 153, 255));
        CancelButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        klientetCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AuthorLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NrAuthorsLabel)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AddClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(QuantityLabel)
                                            .addComponent(PublishingYearLabel))
                                        .addGap(89, 89, 89)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(isbnCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(klientetCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(66, 66, 66)
                                .addComponent(CancelButton)
                                .addGap(52, 52, 52)
                                .addComponent(DeleteClientButton)))
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PublishingYearLabel)
                    .addComponent(klientetCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantityLabel)
                    .addComponent(isbnCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(NrAuthorsLabel)
                        .addGap(53, 53, 53)
                        .addComponent(AuthorLabel)
                        .addGap(93, 260, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddClientButton)
                            .addComponent(CancelButton)
                            .addComponent(DeleteClientButton))
                        .addGap(160, 160, 160))))
        );

        table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(table);

        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("Search");

        javax.swing.GroupLayout AddClientPanelLayout = new javax.swing.GroupLayout(AddClientPanel);
        AddClientPanel.setLayout(AddClientPanelLayout);
        AddClientPanelLayout.setHorizontalGroup(
            AddClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddClientPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddClientPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(AddClientPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AddClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddClientPanelLayout.createSequentialGroup()
                                .addComponent(Search)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddClientPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        AddClientPanelLayout.setVerticalGroup(
            AddClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddClientPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(AddClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddClientPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AddClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 670, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(AddClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isbnCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnCodeTextFieldActionPerformed

    private void AddClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClientButtonActionPerformed
        try{
            int row = table.getSelectedRow();
            if(row == -1){
                Libri l = new Libri();
                l.setLTitulli(TitleTextField.getText());

                l.setLShtepiaBotuese(PublisherTextField.getText());
                l.setLVitiBotimit(PublishigYearDate.getValue());
                l.setLKategoriaId((KategoriaLibrit) CategoryComboBox.getSelectedItem());
                l.setLSasia(Integer.parseInt(isbnCodeTextField.getText()));
                l.setLCmimiMujor(Double.parseDouble(PriceTextField.getText()));
                l.setIsbn(IsbnTextField.getText());

                lrepo.create(l);

                Autori a1 = (Autori) AuthorComboBox.getSelectedItem();
                l.getAutoriCollection().add(a1);

                if(this.AuthorComboBox2.isVisible()){
                    Autori a2 = (Autori) AuthorComboBox2.getSelectedItem();
                    l.getAutoriCollection().add(a2);
                }

                if(this.AuthorComboBox3.isVisible()){
                    Autori a3 = (Autori) AuthorComboBox3.getSelectedItem();
                    l.getAutoriCollection().add(a3);
                }

            }else{
                Libri l = btm.getLibri(row);
                getNrAutorveFromSelected(l);
                l.setLTitulli(TitleTextField.getText());
                l.setLShtepiaBotuese(PublisherTextField.getText());
                l.setLVitiBotimit(PublishigYearDate.getValue());
                l.setLKategoriaId((KategoriaLibrit) CategoryComboBox.getSelectedItem());
                l.setLSasia(Integer.parseInt(isbnCodeTextField.getText()));
                l.setLCmimiMujor(Double.parseDouble(PriceTextField.getText()));

                l.getAutoriCollection().clear();
                Autori a1 = (Autori) AuthorComboBox.getSelectedItem();
                l.getAutoriCollection().add(a1);

                if(this.AuthorComboBox2.isVisible()){
                    Autori a2 = (Autori) AuthorComboBox2.getSelectedItem();
                    l.getAutoriCollection().add(a2);
                }

                if(this.AuthorComboBox3.isVisible()){
                    Autori a3 = (Autori) AuthorComboBox3.getSelectedItem();
                    l.getAutoriCollection().add(a3);
                }
                lrepo.edit(l);

            }
            //E krijojm ni metode per me i clear fieldat mbasi ti shtojme
            clear();
            this.loadBookTable();
        }catch(LibraryException ex){
            JOptionPane.showMessageDialog(this, "E dhena ekziston!");
        }

    }//GEN-LAST:event_AddClientButtonActionPerformed

    private void DeleteClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteClientButtonActionPerformed
        try{
            int row = table.getSelectedRow();
            if(row != -1){
                Libri l = btm.getLibri(row);
                lrepo.delete(l);

            }
            this.clear();
            this.loadBookTable();
        }
        catch (Exception ex){

        }
    }//GEN-LAST:event_DeleteClientButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.clear();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterHuazimLibraveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterHuazimLibraveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterHuazimLibraveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterHuazimLibraveGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterHuazimLibraveGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClientButton;
    private javax.swing.JPanel AddClientPanel;
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DeleteClientButton;
    private javax.swing.JLabel NrAuthorsLabel;
    private javax.swing.JLabel PublishingYearLabel;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JTextField Search;
    private javax.swing.JPanel TitelPanel;
    private javax.swing.JTextField isbnCodeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> klientetCmb;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
