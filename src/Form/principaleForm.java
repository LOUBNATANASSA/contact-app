/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import entities.Contact;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.contactservice;

/**
 *
 * @author hp
 */
public class principaleForm extends javax.swing.JFrame {
    private contactservice contact=new contactservice();
 private List<Contact> lc=contact.findAll();

 
     private contactservice Cs;
     private DefaultTableModel model;
     private static int id;

    /**
     * Creates new form principaleForm
     */
    public principaleForm() {
        initComponents();
        Cs=new contactservice();
        //this.setBounds(100, 100, 800, 600);
         setResizable(false);
         model=(DefaultTableModel) LISTCONTACT.getModel();
         load();

    }
public void load(){
        model.setRowCount(0);
        for(Contact c:Cs.findAll()){
            model.addRow(new Object[] {
                c.getId(),
                c.getNom(),
                c.getTelephone(),
                c.getAdress(),
                
            });
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NOMBOX = new javax.swing.JTextField();
        TELEBOX = new javax.swing.JTextField();
        ADRESSBOX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AJOUTERBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LISTCONTACT = new javax.swing.JTable();
        recherchebox = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        LISTRECHERCHE = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        RECHERCHEBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 19)); // NOI18N
        jLabel1.setText("BIENVENUE DANS L'APPLICATION DE GESTION DES CONTACTES");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        NOMBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBOXActionPerformed(evt);
            }
        });

        ADRESSBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADRESSBOXActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("NOM");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("TELEPHONE");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("ADRESS");

        AJOUTERBTN.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        AJOUTERBTN.setText("AJOUTER");
        AJOUTERBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AJOUTERBTNActionPerformed(evt);
            }
        });

        LISTCONTACT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "NOM", "TELEPHONE", "ADRESS"
            }
        ));
        jScrollPane1.setViewportView(LISTCONTACT);

        recherchebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheboxActionPerformed(evt);
            }
        });

        LISTRECHERCHE.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        LISTRECHERCHE.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "NOM", "TELEPHONE", "ADRESSE" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LISTRECHERCHE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LISTRECHERCHEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(LISTRECHERCHE);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setText("PAR");

        RECHERCHEBTN.setText("RECHERCHE");
        RECHERCHEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RECHERCHEBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ADRESSBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TELEBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(NOMBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AJOUTERBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(RECHERCHEBTN)
                    .addComponent(recherchebox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NOMBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AJOUTERBTN))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TELEBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ADRESSBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(recherchebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RECHERCHEBTN)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(225, 225, 225))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOMBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBOXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBOXActionPerformed

    private void ADRESSBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADRESSBOXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADRESSBOXActionPerformed

    private void AJOUTERBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AJOUTERBTNActionPerformed
            // Vérifier si tous les champs sont remplis
    if (NOMBOX.getText().isEmpty() || TELEBOX.getText().isEmpty() || ADRESSBOX.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires.", "Erreur", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Vérifier si le numéro de téléphone est valide (10 chiffres)
    String telephoneText = TELEBOX.getText();
    if (!telephoneText.matches("\\d{10}")) {
        JOptionPane.showMessageDialog(null, "Le numéro de téléphone est invalide !");
        return;
    }

    // Convertir le numéro de téléphone en `long` et gérer les exceptions
    long telephone = 0;
    try {
        telephone = Long.parseLong(telephoneText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Erreur : Le numéro de téléphone n'est pas valide.", "Erreur", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Vérifier si le nom ou le téléphone existe déjà dans la liste
    boolean nomExiste = false;
    boolean telephoneExiste = false;

    for (Contact c : lc) {
        if (c.getNom().equals(NOMBOX.getText())) {
            nomExiste = true;
        }
        if (c.getTelephone() == telephone) {
            telephoneExiste = true;
        }
    }

    if (nomExiste) {
        JOptionPane.showMessageDialog(null, "Le nom choisi est déjà affecté à un contact !");
        return;
    }

    if (telephoneExiste) {
        JOptionPane.showMessageDialog(null, "Le numéro de téléphone choisi est déjà affecté à un contact !");
        return;
    }

    // Ajouter le nouveau contact
    Contact nouveauContact = new Contact(NOMBOX.getText(), telephone, ADRESSBOX.getText());
    if (Cs.create(nouveauContact)) {
        JOptionPane.showMessageDialog(null, "Contact ajouté !");
        // load(); // Si vous avez une méthode pour recharger l'interface, décommentez cette ligne.
    } else {
        JOptionPane.showMessageDialog(this, "Une erreur s'est produite lors de l'ajout du contact.", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_AJOUTERBTNActionPerformed

    private void rechercheboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechercheboxActionPerformed

    private void LISTRECHERCHEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LISTRECHERCHEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LISTRECHERCHEMouseClicked

    private void RECHERCHEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RECHERCHEBTNActionPerformed
         // Vérification si un élément de la liste est sélectionné
    if (LISTRECHERCHE.getSelectedValue() == null) {
        JOptionPane.showMessageDialog(this, "Choisissez un critère parmi la liste", "Erreur", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Vérification si la barre de recherche est vide
    if (recherchebox.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "La barre de recherche est vide", "Erreur", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String o = LISTRECHERCHE.getSelectedValue();
    boolean found = false; // Indique si un contact a été trouvé

    // Recherche par NOM
    if (o.equals("NOM")) {
        for (int i = 0; i < lc.size(); i++) {
            if (lc.get(i).getNom().equals(recherchebox.getText())) {
                NOMBOX.setText(lc.get(i).getNom());
                ADRESSBOX.setText(lc.get(i).getAdress());
                TELEBOX.setText(String.valueOf(lc.get(i).getTelephone()));
                found = true;
                break;
            }
        }
    }

    // Recherche par TELEPHONE
    else if (o.equals("TELEPHONE")) {
        try {
            long searchedPhone = Long.parseLong(recherchebox.getText());
            for (int i = 0; i < lc.size(); i++) {
                if (lc.get(i).getTelephone() == searchedPhone) {
                    NOMBOX.setText(lc.get(i).getNom());
                    ADRESSBOX.setText(lc.get(i).getAdress());
                    TELEBOX.setText(String.valueOf(lc.get(i).getTelephone()));
                    found = true;
                    break;
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Veuillez entrer un numéro de téléphone valide", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    // Recherche par ADRESSE
    else {
        for (int i = 0; i < lc.size(); i++) {
            if (lc.get(i).getAdress().equals(recherchebox.getText())) {
                NOMBOX.setText(lc.get(i).getNom());
                ADRESSBOX.setText(lc.get(i).getAdress());
                TELEBOX.setText(String.valueOf(lc.get(i).getTelephone()));
                found = true;
                break;
            }
        }
    }

    // Si aucun contact n'a été trouvé
    if (!found) {
        JOptionPane.showMessageDialog(this, "Contact introuvable", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_RECHERCHEBTNActionPerformed

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
            java.util.logging.Logger.getLogger(principaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principaleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADRESSBOX;
    private javax.swing.JButton AJOUTERBTN;
    private javax.swing.JTable LISTCONTACT;
    private javax.swing.JList<String> LISTRECHERCHE;
    private javax.swing.JTextField NOMBOX;
    private javax.swing.JButton RECHERCHEBTN;
    private javax.swing.JTextField TELEBOX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField recherchebox;
    // End of variables declaration//GEN-END:variables
}
