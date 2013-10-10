package dk.kasper.simon;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class MainFrame extends javax.swing.JFrame {

    private Control control;
    private DefaultListModel model;
    private Person tmp;
    private boolean secret;
    private ArrHereBeSecrets pirate;
    
    public MainFrame() {
        initComponents();
        control = new Control();
        this.model = new DefaultListModel();
        pirate = new ArrHereBeSecrets();
        personList.setModel(model);
        control.loadFromFile();
        if(control.getPirateMode())this.secret = true;
        helpText.setText("File succesfully Loaded");
        activatePirate();
        refreshList();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createFrame = new javax.swing.JFrame();
        textLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        createNameField = new javax.swing.JTextField();
        adLabel = new javax.swing.JLabel();
        createAdminField = new javax.swing.JTextField();
        createAnalField = new javax.swing.JTextField();
        anLabel = new javax.swing.JLabel();
        creaLabel = new javax.swing.JLabel();
        createCreaField = new javax.swing.JTextField();
        finLabel = new javax.swing.JLabel();
        createFinField = new javax.swing.JTextField();
        newPersonCreate = new javax.swing.JButton();
        newPersonCancel = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        textLabel2 = new javax.swing.JLabel();
        editFrame = new javax.swing.JFrame();
        editText1 = new javax.swing.JLabel();
        editName = new javax.swing.JLabel();
        editNameField = new javax.swing.JTextField();
        editAdmin = new javax.swing.JLabel();
        editAdminField = new javax.swing.JTextField();
        editAnalField = new javax.swing.JTextField();
        editAnal = new javax.swing.JLabel();
        editCrea = new javax.swing.JLabel();
        editCreaField = new javax.swing.JTextField();
        editFin = new javax.swing.JLabel();
        editFinField = new javax.swing.JTextField();
        editPersonCreate = new javax.swing.JButton();
        editPersonCancel = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        editText2 = new javax.swing.JLabel();
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
        mainPanel = new javax.swing.JPanel();
        helpText = new javax.swing.JLabel();
        viewText = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        applicantsText = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewerTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        personList = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        quitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        createFrame.setMinimumSize(new java.awt.Dimension(328, 361));

        textLabel1.setText("Fill in name and numbers. Sum of numbers may not");

        nameLabel.setText("Name");

        adLabel.setText("Administrator");

        anLabel.setText("Analyst");

        creaLabel.setText("Creative");

        finLabel.setText("Finisher");

        createFinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFinFieldActionPerformed(evt);
            }
        });

        newPersonCreate.setText("Create");
        newPersonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPersonCreateActionPerformed(evt);
            }
        });

        newPersonCancel.setText("Cancel");
        newPersonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPersonCancelActionPerformed(evt);
            }
        });

        textLabel2.setText("exceed 30 in value.");

        javax.swing.GroupLayout createFrameLayout = new javax.swing.GroupLayout(createFrame.getContentPane());
        createFrame.getContentPane().setLayout(createFrameLayout);
        createFrameLayout.setHorizontalGroup(
            createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(createFrameLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(newPersonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newPersonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(createFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createFrameLayout.createSequentialGroup()
                        .addComponent(adLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(anLabel)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createFrameLayout.createSequentialGroup()
                        .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creaLabel)
                            .addComponent(createCreaField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(createFrameLayout.createSequentialGroup()
                                .addComponent(finLabel)
                                .addGap(73, 73, 73))
                            .addComponent(createFinField)))
                    .addGroup(createFrameLayout.createSequentialGroup()
                        .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(createAdminField))
                        .addGap(94, 94, 94)
                        .addComponent(createAnalField))
                    .addGroup(createFrameLayout.createSequentialGroup()
                        .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textLabel1)
                            .addComponent(nameLabel)
                            .addComponent(textLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        createFrameLayout.setVerticalGroup(
            createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adLabel)
                    .addComponent(anLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAdminField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAnalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creaLabel)
                    .addComponent(finLabel))
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

        editText1.setText("Edit name and number fields. Total number");

        editName.setText("Name");

        editAdmin.setText("Administrator");

        editAnal.setText("Analyst");

        editCrea.setText("Creative");

        editFin.setText("Finisher");

        editFinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFinFieldActionPerformed(evt);
            }
        });

        editPersonCreate.setText("Apply");
        editPersonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPersonCreateActionPerformed(evt);
            }
        });

        editPersonCancel.setText("Cancel");
        editPersonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPersonCancelActionPerformed(evt);
            }
        });

        editText2.setText("value may not exceed 30.");

        javax.swing.GroupLayout editFrameLayout = new javax.swing.GroupLayout(editFrame.getContentPane());
        editFrame.getContentPane().setLayout(editFrameLayout);
        editFrameLayout.setHorizontalGroup(
            editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(editFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editName)
                            .addGroup(editFrameLayout.createSequentialGroup()
                                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editCrea)
                                    .addComponent(editAdmin))
                                .addGap(91, 91, 91)
                                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editAnal)
                                    .addComponent(editAnalField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editFin)
                                    .addComponent(editFinField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28))
                    .addGroup(editFrameLayout.createSequentialGroup()
                        .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editText1)
                            .addComponent(editText2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editFrameLayout.createSequentialGroup()
                        .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(editCreaField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(editAdminField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(editNameField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(editFrameLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(editPersonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(editPersonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        editFrameLayout.setVerticalGroup(
            editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editAdmin)
                    .addComponent(editAnal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editAdminField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAnalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editCrea)
                    .addComponent(editFin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editCreaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editFinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPersonCreate)
                    .addComponent(editPersonCancel))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(aboutCloseButton)
                .addContainerGap())
        );

        jLabel15.setText("Changes have been made to the list. Do you want to save the new list?");

        yesButton.setText("Yes");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        noButton.setText("No");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

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
        yesDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesDeleteActionPerformed(evt);
            }
        });

        noDelete.setText("No");
        noDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noDeleteActionPerformed(evt);
            }
        });

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
        setBackground(new java.awt.Color(255, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(520, 360));
        setName("proManFrame"); // NOI18N

        helpText.setText("Help is displayed in this label.");
        helpText.setToolTipText("Helpful information displayed here");

        viewText.setText("Viewer");

        createButton.setText("Create Person");
        createButton.setToolTipText("Create a new person");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit Person");
        editButton.setToolTipText("Edit the selected person");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete Person");
        deleteButton.setToolTipText("Delete the selected person");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        applicantsText.setText("Applicants");

        viewerTextArea.setEditable(false);
        viewerTextArea.setColumns(20);
        viewerTextArea.setRows(5);
        viewerTextArea.setToolTipText("View your selected person");
        jScrollPane3.setViewportView(viewerTextArea);

        personList.setToolTipText("List of applicants");
        personList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                personListMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(personList);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(helpText)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(applicantsText))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewText)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(createButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(editButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteButton)))
                                .addGap(0, 31, Short.MAX_VALUE))
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applicantsText)
                    .addComponent(viewText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createButton)
                            .addComponent(editButton)
                            .addComponent(deleteButton)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(helpText)
                .addContainerGap())
        );

        fileMenu.setText("File");
        fileMenu.setToolTipText("File menu");

        loadMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        loadMenuItem.setText("Load list");
        loadMenuItem.setToolTipText("Load the name list");
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setText("Save list");
        saveMenuItem.setToolTipText("Save your work");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);
        fileMenu.add(jSeparator1);

        quitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quitMenuItem.setText("Quit program");
        quitMenuItem.setToolTipText("Exit the program safely");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenuItem);

        jMenuBar1.add(fileMenu);

        helpMenu.setText("Help");
        helpMenu.setToolTipText("Help menu");

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        aboutMenuItem.setText("About");
        aboutMenuItem.setToolTipText("Look closely");
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
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuItemActionPerformed
        control.loadFromFile();
        helpText.setText("File succesfully Loaded");
        refreshList();
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
        createAdminField.setText("");
        createAnalField.setText("");
        createCreaField.setText("");
        createNameField.setText("");
        createFinField.setText("");
        openWindows(createFrame);
    }//GEN-LAST:event_createButtonActionPerformed
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        Object selected = personList.getSelectedValue();
        if (selected != null) {
            openWindows(editFrame);
        } else {
            helpText.setText("No person selected.");
        }
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

    private void editPersonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPersonCreateActionPerformed
        String name = editNameField.getText();
        int ad = Integer.parseInt(editAdminField.getText());
        int an = Integer.parseInt(editAnalField.getText());
        int cr = Integer.parseInt(editCreaField.getText());
        int fi = Integer.parseInt(editFinField.getText());
        if (!control.checkInputs(name, ad, an, cr, fi, helpText)) {
            control.deletePerson(tmp, helpText);
            control.createPerson(name, ad, an, cr, fi);
            refreshList();
            editFrame.dispose();
            helpText.setText("Person was edited");
            viewerTextArea.setText("");
        }
    }//GEN-LAST:event_editPersonCreateActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        control.saveToFile(helpText);
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
        if (control.getSaveState()) {
            quitBox.pack();
            quitBox.setLocationRelativeTo(null);
            quitBox.setVisible(true);
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_quitMenuItemActionPerformed

    private void newPersonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPersonCancelActionPerformed
        createFrame.dispose();
    }//GEN-LAST:event_newPersonCancelActionPerformed

    private void newPersonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPersonCreateActionPerformed
        newPerson();
    }//GEN-LAST:event_newPersonCreateActionPerformed

    private void editPersonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPersonCancelActionPerformed
        editFrame.dispose();
    }//GEN-LAST:event_editPersonCancelActionPerformed

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        control.saveToFile(helpText);
        System.exit(0);
    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_noButtonActionPerformed

    private void yesDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesDeleteActionPerformed
        Object selected = personList.getSelectedValue();
        Person p = (Person) selected;
        control.deletePerson(p, helpText);
        refreshList();
        deleteBox.dispose();
    }//GEN-LAST:event_yesDeleteActionPerformed

    private void noDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noDeleteActionPerformed
        deleteBox.dispose();
    }//GEN-LAST:event_noDeleteActionPerformed

    private void personListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personListMousePressed
        Object selected = personList.getSelectedValue();
        Person p = ((Person) selected);
        viewerTextArea.setText(p.showPerson());
    }//GEN-LAST:event_personListMousePressed

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

    private void activatePirate(){
        if(secret==true){
            Person.getmode(secret);
            pirate.learnToWrite(personList, viewerTextArea, helpText);
            pirate.ArrChangeSomeTitles(nameLabel, adLabel, anLabel, finLabel,creaLabel, textLabel1, textLabel2, createButton, cancelButton);
            pirate.ArrChangeSomeEditTitles(editName, editAdmin, editAnal, editCrea, editFin, editText1, editText2, editPersonCreate, editPersonCancel);
            pirate.ArrWhatBecomeOfMeCrew(createButton, editButton, deleteButton, viewText, applicantsText, helpMenu, fileMenu);
            
        
        }
    }
    
    public void newPerson(){
    String name = createNameField.getText();
        String da = createAdminField.getText();
        String na = createAnalField.getText();
        String rc = createCreaField.getText();
        String fin = createFinField.getText();
        if (control.parserTest(da, na, rc, fin, name, helpText)) {
            int ad = Integer.parseInt(da);
            int an = Integer.parseInt(na);
            int cr = Integer.parseInt(rc);
            int fi = Integer.parseInt(fin);
            if (!control.checkInputs(name, ad, an, cr, fi, helpText)) {
                control.createPerson(name, ad, an, cr, fi);
                refreshList();
                helpText.setText("Person created");
                createFrame.dispose();
            }
        }
    }
    
    public void openWindows(JFrame v) {
        v.pack();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }

    private void refreshList() {
        model.clear();
        for (int x = 0; x < control.arraySize(); ++x) {
            model.addElement(control.giveArray(x));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutCloseButton;
    private javax.swing.JFrame aboutFrame;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel adLabel;
    private javax.swing.JLabel anLabel;
    private javax.swing.JLabel applicantsText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel creaLabel;
    private javax.swing.JTextField createAdminField;
    private javax.swing.JTextField createAnalField;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField createCreaField;
    private javax.swing.JTextField createFinField;
    private javax.swing.JFrame createFrame;
    private javax.swing.JTextField createNameField;
    private javax.swing.JDialog deleteBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel editAdmin;
    private javax.swing.JTextField editAdminField;
    private javax.swing.JLabel editAnal;
    private javax.swing.JTextField editAnalField;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel editCrea;
    private javax.swing.JTextField editCreaField;
    private javax.swing.JLabel editFin;
    private javax.swing.JTextField editFinField;
    private javax.swing.JFrame editFrame;
    private javax.swing.JLabel editName;
    private javax.swing.JTextField editNameField;
    private javax.swing.JButton editPersonCancel;
    private javax.swing.JButton editPersonCreate;
    private javax.swing.JLabel editText1;
    private javax.swing.JLabel editText2;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel finLabel;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel helpText;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton newPersonCancel;
    private javax.swing.JButton newPersonCreate;
    private javax.swing.JButton noButton;
    private javax.swing.JButton noDelete;
    private javax.swing.JList personList;
    private javax.swing.JDialog quitBox;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel textLabel1;
    private javax.swing.JLabel textLabel2;
    private javax.swing.JLabel viewText;
    private javax.swing.JTextArea viewerTextArea;
    private javax.swing.JButton yesButton;
    private javax.swing.JButton yesDelete;
    // End of variables declaration//GEN-END:variables
}
