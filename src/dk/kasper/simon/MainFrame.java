package dk.kasper.simon;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class MainFrame extends javax.swing.JFrame {

    private Control control;
    private DefaultListModel model;
    private Person tmp;
    

    public MainFrame() {
        initComponents();
        control = new Control();
        this.model = new DefaultListModel();
        personList.setModel(model);
        control.loadFromFile();
        helpText.setText("File succesfully Loaded");
        refreshList();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createFrame = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        createNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        createAdminField = new javax.swing.JTextField();
        createAnalField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createCreaField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        createFinField = new javax.swing.JTextField();
        newPersonCreate = new javax.swing.JButton();
        newPersonCancel = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        editFrame = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        editNameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        editAdminField = new javax.swing.JTextField();
        editAnalField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        editCreaField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        editFinField = new javax.swing.JTextField();
        newPersonCreate1 = new javax.swing.JButton();
        newPersonCancel1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        aboutFrame = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        aboutCloseButton = new javax.swing.JButton();
        quitBox = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        deleteBox = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        yesDelete = new javax.swing.JButton();
        noDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personList = new javax.swing.JList();
        createButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        helpText = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewerTextArea = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        quitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        jLabel1.setText("Fill in the fields with the persons name, and the appropriate scores.");

        jLabel2.setText("Name");

        jLabel3.setText("Administrator");

        jLabel4.setText("Analyst");

        jLabel5.setText("Creative");

        jLabel6.setText("Finisher");

        createFinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFinFieldActionPerformed(evt);
            }
        });

        newPersonCreate.setText("Create");

        newPersonCancel.setText("Cancel");

        javax.swing.GroupLayout createFrameLayout = new javax.swing.GroupLayout(createFrame.getContentPane());
        createFrame.getContentPane().setLayout(createFrameLayout);
        createFrameLayout.setHorizontalGroup(
            createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(createFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(createFrameLayout.createSequentialGroup()
                        .addComponent(createCreaField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(createFinField))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(createFrameLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel4))
                    .addGroup(createFrameLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel6))
                    .addGroup(createFrameLayout.createSequentialGroup()
                        .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(createAdminField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createAnalField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(createFrameLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(newPersonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newPersonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        createFrameLayout.setVerticalGroup(
            createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAdminField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAnalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCreaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createFinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPersonCreate)
                    .addComponent(newPersonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                editFrameWindowActivated(evt);
            }
        });

        jLabel7.setText("Edit the fields to change the persons name or scores.");

        jLabel8.setText("Name");

        jLabel9.setText("Administrator");

        jLabel10.setText("Analyst");

        jLabel11.setText("Creative");

        jLabel12.setText("Finisher");

        editFinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFinFieldActionPerformed(evt);
            }
        });

        newPersonCreate1.setText("Apply");
        newPersonCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPersonCreate1ActionPerformed(evt);
            }
        });

        newPersonCancel1.setText("Cancel");

        javax.swing.GroupLayout editFrameLayout = new javax.swing.GroupLayout(editFrame.getContentPane());
        editFrame.getContentPane().setLayout(editFrameLayout);
        editFrameLayout.setHorizontalGroup(
            editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(editFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editFrameLayout.createSequentialGroup()
                        .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(editAdminField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editAnalField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editFrameLayout.createSequentialGroup()
                        .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(editFrameLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(131, 131, 131)
                                .addComponent(jLabel10))
                            .addGroup(editFrameLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(154, 154, 154)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editFrameLayout.createSequentialGroup()
                        .addComponent(editCreaField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(editFinField)))
                .addContainerGap())
            .addGroup(editFrameLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(newPersonCreate1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newPersonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        editFrameLayout.setVerticalGroup(
            editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editAdminField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAnalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editCreaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editFinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPersonCreate1)
                    .addComponent(newPersonCancel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aboutFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        aboutFrame.setTitle("About");
        aboutFrame.setMinimumSize(new java.awt.Dimension(200, 300));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Promanager\nVersion 1.0.0.0\n\nMade by \nKasper Møller Hald\nand\nSimon Grønborg\n\nMade as part of a\nCPA Flow project.\n\n\n\nQuestion of the Day\n\nHave you ever\nwondered how much\nmore intersting your\nlife would be if you\nwere a\n\"Dread Pirate \"?");
        jScrollPane2.setViewportView(jTextArea2);

        aboutCloseButton.setText("Close");
        aboutCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutCloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aboutFrameLayout = new javax.swing.GroupLayout(aboutFrame.getContentPane());
        aboutFrame.getContentPane().setLayout(aboutFrameLayout);
        aboutFrameLayout.setHorizontalGroup(
            aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(aboutFrameLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(aboutCloseButton)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        aboutFrameLayout.setVerticalGroup(
            aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aboutCloseButton)
                .addContainerGap())
        );

        jLabel15.setText("Changes have been made to the list. Do you want to save the new list?");

        yesButton.setText("Yes");

        noButton.setText("No");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quitBoxLayout = new javax.swing.GroupLayout(quitBox.getContentPane());
        quitBox.getContentPane().setLayout(quitBoxLayout);
        quitBoxLayout.setHorizontalGroup(
            quitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quitBoxLayout.createSequentialGroup()
                .addGroup(quitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quitBoxLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15))
                    .addGroup(quitBoxLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(yesButton)
                        .addGap(18, 18, 18)
                        .addComponent(noButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quitBoxLayout.setVerticalGroup(
            quitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quitBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(quitBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesButton)
                    .addComponent(noButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deleteBox.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                deleteBoxWindowActivated(evt);
            }
        });

        jLabel16.setText("Are you sure you wish to delete this person?");

        yesDelete.setText("Yes");

        noDelete.setText("No");

        javax.swing.GroupLayout deleteBoxLayout = new javax.swing.GroupLayout(deleteBox.getContentPane());
        deleteBox.getContentPane().setLayout(deleteBoxLayout);
        deleteBoxLayout.setHorizontalGroup(
            deleteBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(deleteBoxLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(yesDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(noDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteBoxLayout.setVerticalGroup(
            deleteBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(deleteBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesDelete)
                    .addComponent(noDelete))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Team Manager");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(520, 360));
        setName("proManFrame"); // NOI18N

        personList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personList);

        createButton.setText("Create Person");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit Person");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete Person");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        helpText.setText("Help is displayed in this label.");

        viewerTextArea.setEditable(false);
        viewerTextArea.setColumns(20);
        viewerTextArea.setRows(5);
        jScrollPane3.setViewportView(viewerTextArea);

        jLabel13.setText("Applicants");

        jLabel14.setText("Viewer");

        fileMenu.setText("File");

        loadMenuItem.setText("Load list");
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadMenuItem);

        saveMenuItem.setText("Save list");
        fileMenu.add(saveMenuItem);
        fileMenu.add(jSeparator1);

        quitMenuItem.setText("Quit program");
        fileMenu.add(quitMenuItem);

        jMenuBar1.add(fileMenu);

        helpMenu.setText("Help");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(helpText)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(createButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(editButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteButton)))
                                .addGap(0, 43, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createButton)
                            .addComponent(editButton)
                            .addComponent(deleteButton)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(helpText)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuItemActionPerformed

        control.loadFromFile();
    }//GEN-LAST:event_loadMenuItemActionPerformed
    private void createFinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFinFieldActionPerformed
    }//GEN-LAST:event_createFinFieldActionPerformed
    private void editFinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFinFieldActionPerformed
    }//GEN-LAST:event_editFinFieldActionPerformed
    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        openWindows(aboutFrame);
    }//GEN-LAST:event_aboutMenuItemActionPerformed
    private void aboutCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutCloseButtonActionPerformed
        aboutFrame.dispose();

    }//GEN-LAST:event_aboutCloseButtonActionPerformed
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        quitBox.dispose();

    }//GEN-LAST:event_cancelButtonActionPerformed
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        openWindows(createFrame);
    }//GEN-LAST:event_createButtonActionPerformed
    private void personListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personListMouseClicked

        Object selected = personList.getSelectedValue();
        Person p = ((Person) selected);
        viewerTextArea.setText(p.showPerson());
    }//GEN-LAST:event_personListMouseClicked
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        openWindows(editFrame);
    }//GEN-LAST:event_editButtonActionPerformed
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (personList.getSelectedValue() != null) {
            deleteBox.pack();
            deleteBox.setLocationRelativeTo(null);
            deleteBox.setVisible(true);
        } else {
            helpText.setText("No person selected");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed
    private void deleteBoxWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_deleteBoxWindowActivated
        Object selected = personList.getSelectedValue();
        Person p = ((Person) selected);
        jLabel16.setText("Are you sure you wish to delete " + p.toString() + "?");
    }//GEN-LAST:event_deleteBoxWindowActivated
    private void editFrameWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_editFrameWindowActivated
        Object selected = personList.getSelectedValue();
        Person p = ((Person) selected);
        editNameField.setText(p.toString());
        editAdminField.setText("" + p.getAdmin());
        editAnalField.setText("" + p.getAnalyst());
        editCreaField.setText("" + p.getCreative());
        editFinField.setText("" + p.getFinisher());
        this.tmp = p;
    }//GEN-LAST:event_editFrameWindowActivated
    private void newPersonCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPersonCreate1ActionPerformed
        String name = editNameField.getText();
        int ad = Integer.parseInt(editAdminField.getText());
        int an = Integer.parseInt(editAnalField.getText());
        int cr = Integer.parseInt(editCreaField.getText());
        int fi = Integer.parseInt(editFinField.getText());
        control.editPerson(name, ad, an, cr, fi, tmp);
        

    }//GEN-LAST:event_newPersonCreate1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void editFrame() {
    }

    public void openWindows(JFrame v) {
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }

    private void refreshList() {
        for (int x = 0; x < control.arraySize(); ++x) {
            model.addElement(control.giveArray(x));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutCloseButton;
    private javax.swing.JFrame aboutFrame;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField createAdminField;
    private javax.swing.JTextField createAnalField;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField createCreaField;
    private javax.swing.JTextField createFinField;
    private javax.swing.JFrame createFrame;
    private javax.swing.JTextField createNameField;
    private javax.swing.JDialog deleteBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField editAdminField;
    private javax.swing.JTextField editAnalField;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField editCreaField;
    private javax.swing.JTextField editFinField;
    private javax.swing.JFrame editFrame;
    private javax.swing.JTextField editNameField;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel helpText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JButton newPersonCancel;
    private javax.swing.JButton newPersonCancel1;
    private javax.swing.JButton newPersonCreate;
    private javax.swing.JButton newPersonCreate1;
    private javax.swing.JButton noButton;
    private javax.swing.JButton noDelete;
    private javax.swing.JList personList;
    private javax.swing.JDialog quitBox;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextArea viewerTextArea;
    private javax.swing.JButton yesButton;
    private javax.swing.JButton yesDelete;
    // End of variables declaration//GEN-END:variables
}
