/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfacesApplication;
import Core.*;



/**
 *
 * @author USER
 */
public class CreerContact extends javax.swing.JFrame {

    /**
     * Creates new form CreerContact
     */
    public CreerContact() {
        initComponents();
    }
   // public static Connection connection;
    
    private Repertoire rp = new Repertoire();
    private static final Repertoire repertoire  = new Repertoire();

    public Repertoire getRep() {
        return repertoire;
    }

   
    
     
   /* public void enregistrer() {
        for (Contacts contact : rp.getRepertoire()) {
            contact.insertContact(connection);
        }
    }*/
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        codeContact = new javax.swing.JTextField();
        addressContact = new javax.swing.JTextField();
        nomContact = new javax.swing.JTextField();
        dateContact = new javax.swing.JTextField();
        emailContact = new javax.swing.JTextField();
        telContact = new javax.swing.JTextField();
        cycleContact = new javax.swing.JTextField();
        statutContact = new javax.swing.JTextField();
        salaireContact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        indiceContact = new javax.swing.JTextField();
        categorieContact = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        occupationContact = new javax.swing.JTextField();
        saveContact = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        choixDuContact = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        niveauContact = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("   CREER UN NOUVEAU CONTACT");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("code");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Date de Naissance");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("address");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("email");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("telephone");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("cycle");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("statut");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("salaire");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("nom");

        codeContact.setBackground(new java.awt.Color(204, 204, 255));
        codeContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        codeContact.setForeground(new java.awt.Color(153, 153, 153));
        codeContact.setText("####");
        codeContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codeContactMouseClicked(evt);
            }
        });
        codeContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeContactActionPerformed(evt);
            }
        });

        addressContact.setBackground(new java.awt.Color(204, 204, 255));
        addressContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        addressContact.setForeground(new java.awt.Color(153, 153, 153));
        addressContact.setText("Entrez votre ville");
        addressContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressContactMouseClicked(evt);
            }
        });

        nomContact.setBackground(new java.awt.Color(204, 204, 255));
        nomContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        nomContact.setForeground(new java.awt.Color(153, 153, 153));
        nomContact.setText("Entrez votre nom");
        nomContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomContactMouseClicked(evt);
            }
        });
        nomContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomContactActionPerformed(evt);
            }
        });

        dateContact.setBackground(new java.awt.Color(204, 204, 255));
        dateContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        dateContact.setForeground(new java.awt.Color(153, 153, 153));
        dateContact.setText("yyy-MM-dd");
        dateContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateContactMouseClicked(evt);
            }
        });
        dateContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateContactActionPerformed(evt);
            }
        });

        emailContact.setBackground(new java.awt.Color(204, 204, 255));
        emailContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        emailContact.setForeground(new java.awt.Color(153, 153, 153));
        emailContact.setText("Entrez votre adresse mail");
        emailContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailContactMouseClicked(evt);
            }
        });

        telContact.setBackground(new java.awt.Color(204, 204, 255));
        telContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        telContact.setForeground(new java.awt.Color(153, 153, 153));
        telContact.setText("Numero de telephone");
        telContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telContactMouseClicked(evt);
            }
        });

        cycleContact.setBackground(new java.awt.Color(204, 204, 255));
        cycleContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cycleContact.setForeground(new java.awt.Color(153, 153, 153));
        cycleContact.setText("Licence, Ingenieur....");
        cycleContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cycleContactMouseClicked(evt);
            }
        });

        statutContact.setBackground(new java.awt.Color(204, 204, 255));
        statutContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        statutContact.setForeground(new java.awt.Color(153, 153, 153));
        statutContact.setText("Vacataire, stagiraire etc...");
        statutContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statutContactMouseClicked(evt);
            }
        });

        salaireContact.setBackground(new java.awt.Color(204, 204, 255));
        salaireContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        salaireContact.setForeground(new java.awt.Color(153, 153, 153));
        salaireContact.setText("XXXXXXX");
        salaireContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salaireContactMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("categorie");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("indice");

        indiceContact.setBackground(new java.awt.Color(204, 204, 255));
        indiceContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        indiceContact.setForeground(new java.awt.Color(153, 153, 153));
        indiceContact.setText("Pour Agent");
        indiceContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indiceContactActionPerformed(evt);
            }
        });

        categorieContact.setBackground(new java.awt.Color(204, 204, 255));
        categorieContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        categorieContact.setForeground(new java.awt.Color(153, 153, 153));
        categorieContact.setText("pour Agent");
        categorieContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categorieContactMouseClicked(evt);
            }
        });
        categorieContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieContactActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Occupation");

        occupationContact.setBackground(new java.awt.Color(204, 204, 255));
        occupationContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        occupationContact.setForeground(new java.awt.Color(153, 153, 153));
        occupationContact.setText("Poste ");
        occupationContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                occupationContactMouseClicked(evt);
            }
        });
        occupationContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationContactActionPerformed(evt);
            }
        });

        saveContact.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        saveContact.setText("Enregistrer le contact");
        saveContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveContactActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("type de contact");

        choixDuContact.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enseignant", "agent", "etudiant" }));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Niveau");

        niveauContact.setBackground(new java.awt.Color(204, 204, 255));
        niveauContact.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        niveauContact.setForeground(new java.awt.Color(153, 153, 153));
        niveauContact.setText("Niveau scolaire");
        niveauContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                niveauContactMouseClicked(evt);
            }
        });
        niveauContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niveauContactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomContact)
                                    .addComponent(dateContact)
                                    .addComponent(addressContact)
                                    .addComponent(emailContact)
                                    .addComponent(telContact)
                                    .addComponent(cycleContact)
                                    .addComponent(statutContact, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(salaireContact)
                                    .addComponent(codeContact, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel11))
                                                .addGap(46, 46, 46)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(categorieContact, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(indiceContact, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jLabel13))
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(occupationContact)
                                                    .addComponent(niveauContact, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(saveContact, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(32, 32, 32)
                                .addComponent(choixDuContact, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(choixDuContact, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(codeContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categorieContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(nomContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dateContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(indiceContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(addressContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(occupationContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(niveauContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(statutContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveContact, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(salaireContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cycleContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeContactActionPerformed

    private void indiceContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiceContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indiceContactActionPerformed

    private void categorieContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categorieContactActionPerformed

    private void occupationContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationContactActionPerformed

    private void saveContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveContactActionPerformed

        String choixContact = (String) choixDuContact.getSelectedItem();
        if(choixContact.equals("enseignant")){
            Contacts c1 = new Enseignant(codeContact.getText(), nomContact.getText(),dateContact.getText(),addressContact.getText(),emailContact.getText(),telContact.getText(),statutContact.getText());
            rp.ajouterContact(c1);
            repertoire.ajouterContact(c1);
            MainFrmApplication mfa = new MainFrmApplication();
            mfa.enregistrer(rp);
        }  
        if (choixContact.equals("agent")){
            Double salaire = Double.valueOf(salaireContact.getText());
            int categorie = Integer.parseInt(categorieContact.getText());
            int indiceSalaire = Integer.parseInt(indiceContact.getText());
            Contacts c1 = new Agent(codeContact.getText(), nomContact.getText(),dateContact.getText(),addressContact.getText(),emailContact.getText(),telContact.getText(), salaire , statutContact.getText(),categorie, indiceSalaire,occupationContact.getText());
            rp.ajouterContact(c1);
            repertoire.ajouterContact(c1);
            MainFrmApplication mfa = new MainFrmApplication();
            mfa.enregistrer(rp);
        }
        if(choixContact.equals("etudiant")){
            int niveau = Integer.parseInt(niveauContact.getText());
            Contacts c1 = new Etudiant(codeContact.getText(), nomContact.getText(),dateContact.getText(),addressContact.getText(),emailContact.getText(),telContact.getText(),cycleContact.getText(),niveau);
            rp.ajouterContact(c1);
            repertoire.ajouterContact(c1);
            MainFrmApplication mfa = new MainFrmApplication();
            mfa.enregistrer(rp);
        }
    }//GEN-LAST:event_saveContactActionPerformed

    private void niveauContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niveauContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niveauContactActionPerformed

    private void dateContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateContactActionPerformed

    private void codeContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeContactMouseClicked
        // TODO add your handling code here:
        String test = codeContact.getText();
        if(test.equals("####")){
            codeContact.setText("");
        }
    }//GEN-LAST:event_codeContactMouseClicked

    private void nomContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomContactMouseClicked
        // TODO add your handling code here:
         String test = nomContact.getText();
        if(test.equals("Entrez votre nom")){
            nomContact.setText("");
        }
    }//GEN-LAST:event_nomContactMouseClicked

    private void nomContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomContactActionPerformed

    private void dateContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateContactMouseClicked
        // TODO add your handling code here:
         String test = dateContact.getText();
        if(test.equals("yyy-MM-dd")){
            dateContact.setText("");
        }
        
    }//GEN-LAST:event_dateContactMouseClicked

    private void addressContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressContactMouseClicked
        // TODO add your handling code here:
         String test = addressContact.getText();
        if(test.equals("Entrez votre ville")){
            addressContact.setText("");
        }
    }//GEN-LAST:event_addressContactMouseClicked

    private void emailContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailContactMouseClicked
        // TODO add your handling code here:
         String test = emailContact.getText();
        if(test.equals("Entrez votre adresse mail")){
            emailContact.setText("");
        }
    }//GEN-LAST:event_emailContactMouseClicked

    private void telContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telContactMouseClicked
        // TODO add your handling code here:
         String test = telContact.getText();
        if(test.equals("Numero de telephone")){
            telContact.setText("");
        }
    }//GEN-LAST:event_telContactMouseClicked

    private void cycleContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cycleContactMouseClicked
        // TODO add your handling code here:
         String test = cycleContact.getText();
        if(test.equals("Licence, Ingenieur....")){
            cycleContact.setText("");
        }
    }//GEN-LAST:event_cycleContactMouseClicked

    private void statutContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statutContactMouseClicked
        // TODO add your handling code here:
         String test = statutContact.getText();
        if(test.equals("Vacataire, stagiraire etc...")){
            statutContact.setText("");
        }
    }//GEN-LAST:event_statutContactMouseClicked

    private void salaireContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaireContactMouseClicked
        // TODO add your handling code here:
          String test = salaireContact.getText();
        if(test.equals("XXXXXXX")){
            salaireContact.setText("");
        }
    }//GEN-LAST:event_salaireContactMouseClicked

    private void occupationContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_occupationContactMouseClicked
        // TODO add your handling code here:
          String test = occupationContact.getText();
        if(test.equals("Poste ")){
            occupationContact.setText("");
        }
    }//GEN-LAST:event_occupationContactMouseClicked

    private void niveauContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_niveauContactMouseClicked
        // TODO add your handling code here:
          String test = niveauContact.getText();
        if(test.equals("Niveau scolaire")){
            niveauContact.setText("");
        }
    }//GEN-LAST:event_niveauContactMouseClicked

    private void categorieContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorieContactMouseClicked
        // TODO add your handling code here:
           String test = categorieContact.getText();
        if(test.equals("Pour Agent")){
            categorieContact.setText("");
        }
    }//GEN-LAST:event_categorieContactMouseClicked
    
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
            java.util.logging.Logger.getLogger(CreerContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreerContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreerContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreerContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerContact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressContact;
    private javax.swing.JTextField categorieContact;
    private javax.swing.JComboBox<String> choixDuContact;
    private javax.swing.JTextField codeContact;
    private javax.swing.JTextField cycleContact;
    private javax.swing.JTextField dateContact;
    private javax.swing.JTextField emailContact;
    private javax.swing.JTextField indiceContact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField niveauContact;
    private javax.swing.JTextField nomContact;
    private javax.swing.JTextField occupationContact;
    private javax.swing.JTextField salaireContact;
    private javax.swing.JButton saveContact;
    private javax.swing.JTextField statutContact;
    private javax.swing.JTextField telContact;
    // End of variables declaration//GEN-END:variables
}
