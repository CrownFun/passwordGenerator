package main;

import java.awt.HeadlessException;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JOptionPane;

public class PasswordGeneratorGui extends javax.swing.JFrame {

    public PasswordGeneratorGui() {
        initComponents();
    }

    public String selectedText;
    Clipboard clip = getToolkit().getSystemClipboard();

    // range of signs in ASCII board
    private final static int BIG_LETTERS_BEGIN = 65;
    private final static int BIG_LETTERS_END = 90;
    private final static int SMALL_LETTERS_BEGIN = 97;
    private final static int SMALL_LETTERS_END = 122;
    private final static int NUMBERS_BEGIN = 48;
    private final static int NUMBERS_END = 57;
    private final static int SPECIAL_SIGNS_BEGIN = 33;
    private final static int SPECIAL_SIGNS_END = 47;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonHome = new javax.swing.JToggleButton();
        panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkBoxSmallLetters = new javax.swing.JCheckBox();
        checkBoxCapitalLetters = new javax.swing.JCheckBox();
        chexBoxDigitals = new javax.swing.JCheckBox();
        checkBoxSpecialSigns = new javax.swing.JCheckBox();
        buttonExecute = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelPasswords = new javax.swing.JTextArea();
        buttonExit = new javax.swing.JToggleButton();
        buttonCopy = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        buttonClean = new javax.swing.JToggleButton();
        buttonAbout = new javax.swing.JToggleButton();
        ComboBoxNumberOfSigns = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 300));

        dialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialog.setTitle("History");
        dialog.setLocationByPlatform(true);
        dialog.setMinimumSize(new java.awt.Dimension(350, 350));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        buttonHome.setText("Home");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(buttonHome)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(buttonHome)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogLayout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(dialogLayout);
        dialogLayout.setHorizontalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        dialogLayout.setVerticalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Generator");
        setResizable(false);

        panel1.setBackground(new java.awt.Color(153, 153, 153));
        panel1.setPreferredSize(new java.awt.Dimension(500, 500));
        panel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ilość znaków hasła:");
        panel1.add(jLabel2);
        jLabel2.setBounds(20, 40, 120, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Zawartość hasła:");
        panel1.add(jLabel3);
        jLabel3.setBounds(20, 80, 98, 15);

        checkBoxSmallLetters.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        checkBoxSmallLetters.setSelected(true);
        checkBoxSmallLetters.setText("małe litery ");
        panel1.add(checkBoxSmallLetters);
        checkBoxSmallLetters.setBounds(16, 101, 90, 24);
        checkBoxSmallLetters.setOpaque(false);

        checkBoxCapitalLetters.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        checkBoxCapitalLetters.setText("wielkie litery");
        panel1.add(checkBoxCapitalLetters);
        checkBoxCapitalLetters.setBounds(16, 131, 99, 24);

        chexBoxDigitals.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chexBoxDigitals.setText("cyfry");
        panel1.add(chexBoxDigitals);
        chexBoxDigitals.setBounds(16, 161, 56, 24);

        checkBoxSpecialSigns.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        checkBoxSpecialSigns.setText("znaki specjalne");
        panel1.add(checkBoxSpecialSigns);
        checkBoxSpecialSigns.setBounds(16, 191, 116, 24);

        buttonExecute.setBackground(new java.awt.Color(255, 0, 0));
        buttonExecute.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonExecute.setForeground(new java.awt.Color(255, 255, 255));
        buttonExecute.setSelected(true);
        buttonExecute.setText("Generuj");
        buttonExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExecuteActionPerformed(evt);
            }
        });
        panel1.add(buttonExecute);
        buttonExecute.setBounds(60, 280, 94, 42);

        labelPasswords.setEditable(false);
        labelPasswords.setBackground(new java.awt.Color(255, 255, 255));
        labelPasswords.setColumns(20);
        labelPasswords.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelPasswords.setForeground(new java.awt.Color(0, 0, 0));
        labelPasswords.setLineWrap(true);
        labelPasswords.setRows(5);
        labelPasswords.setWrapStyleWord(true);
        labelPasswords.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasswords.setSelectedTextColor(new java.awt.Color(0, 0, 153));
        labelPasswords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelPasswordsMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(labelPasswords);
        labelPasswords.getAccessibleContext().setAccessibleName("");

        panel1.add(jScrollPane2);
        jScrollPane2.setBounds(230, 20, 240, 360);

        buttonExit.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        buttonExit.setText("Wyjście");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        panel1.add(buttonExit);
        buttonExit.setBounds(360, 400, 80, 32);

        buttonCopy.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        buttonCopy.setText("Kopiuj");
        buttonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCopyActionPerformed(evt);
            }
        });
        panel1.add(buttonCopy);
        buttonCopy.setBounds(140, 400, 80, 32);

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.add(jLabel4);
        jLabel4.setBounds(10, 20, 210, 220);

        buttonClean.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        buttonClean.setText("Czyść");
        buttonClean.setPreferredSize(new java.awt.Dimension(66, 30));
        buttonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCleanActionPerformed(evt);
            }
        });
        panel1.add(buttonClean);
        buttonClean.setBounds(250, 400, 80, 30);

        buttonAbout.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        buttonAbout.setText("O Programie");
        buttonAbout.setBorder(null);
        buttonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAboutActionPerformed(evt);
            }
        });
        panel1.add(buttonAbout);
        buttonAbout.setBounds(20, 400, 90, 30);

        ComboBoxNumberOfSigns.setBackground(new java.awt.Color(102, 102, 102));
        ComboBoxNumberOfSigns.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ComboBoxNumberOfSigns.setForeground(new java.awt.Color(0, 0, 0));
        ComboBoxNumberOfSigns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        ComboBoxNumberOfSigns.setSelectedIndex(7);
        ComboBoxNumberOfSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNumberOfSignsActionPerformed(evt);
            }
        });
        panel1.add(ComboBoxNumberOfSigns);
        ComboBoxNumberOfSigns.setBounds(150, 40, 50, 27);

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.add(jLabel5);
        jLabel5.setBounds(10, 390, 460, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyText() {
        selectedText = labelPasswords.getSelectedText();
        StringSelection clipSelection = new StringSelection(selectedText);
        clip.setContents(clipSelection, clipSelection);
    }

    private void about() throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Program : \"Password Generator\" służy do generowania ciągu znaków o wybranej długości,\nzłożonego ze znaków alfanumerycznych i znaków specjalnych.\nAutor: Grzegorz Filewicz\nLublin, 28.01.2018  ", "O Programie ", JOptionPane.INFORMATION_MESSAGE);
    }

    private void clearFields() {
        labelPasswords.setText("");
    }

    private void exitProgram() {
        this.dispose();
    }

    private void execute() throws NumberFormatException {
        if (checkBoxSmallLetters.isSelected() && checkBoxCapitalLetters.isSelected() && chexBoxDigitals.isSelected() && checkBoxSpecialSigns.isSelected()) {
            labelPasswords.setText(Logic.generateMultiPassword(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString())));
        } else if (checkBoxSmallLetters.isSelected() && chexBoxDigitals.isSelected() && checkBoxSpecialSigns.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfBigLettersNumbersAndSpecialSigns(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString()), SMALL_LETTERS_BEGIN, SMALL_LETTERS_END, NUMBERS_BEGIN, NUMBERS_END, SPECIAL_SIGNS_BEGIN, SPECIAL_SIGNS_END));
        } else if (checkBoxCapitalLetters.isSelected() && chexBoxDigitals.isSelected() && checkBoxSpecialSigns.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfBigLettersNumbersAndSpecialSigns(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString()), BIG_LETTERS_BEGIN, BIG_LETTERS_END, NUMBERS_BEGIN, NUMBERS_END, SPECIAL_SIGNS_BEGIN, SPECIAL_SIGNS_END));
        } else if (checkBoxSmallLetters.isSelected() && checkBoxCapitalLetters.isSelected() && checkBoxSpecialSigns.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfBigLettersNumbersAndSpecialSigns(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString()), SMALL_LETTERS_BEGIN, SMALL_LETTERS_END, BIG_LETTERS_BEGIN, BIG_LETTERS_END, SPECIAL_SIGNS_BEGIN, SPECIAL_SIGNS_END));
        } else if (checkBoxSmallLetters.isSelected() && checkBoxCapitalLetters.isSelected() && chexBoxDigitals.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfBigLettersNumbersAndSpecialSigns(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString()), SMALL_LETTERS_BEGIN, SMALL_LETTERS_END, BIG_LETTERS_BEGIN, BIG_LETTERS_END, NUMBERS_BEGIN, NUMBERS_END));
        } else if (checkBoxSmallLetters.isSelected() && checkBoxCapitalLetters.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfSmallAndBigLetters(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString()), SMALL_LETTERS_BEGIN, SMALL_LETTERS_END, BIG_LETTERS_BEGIN, BIG_LETTERS_END));
        } else if (checkBoxSmallLetters.isSelected() && chexBoxDigitals.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfSmallAndBigLetters(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString()), SMALL_LETTERS_BEGIN, SMALL_LETTERS_END, NUMBERS_BEGIN, NUMBERS_END));
        } else if (checkBoxSmallLetters.isSelected() && checkBoxSpecialSigns.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfSmallAndBigLetters(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString()), SMALL_LETTERS_BEGIN, SMALL_LETTERS_END, SPECIAL_SIGNS_BEGIN, SPECIAL_SIGNS_END));
        } else if (checkBoxCapitalLetters.isSelected() && chexBoxDigitals.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfSmallAndBigLetters(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString()), BIG_LETTERS_BEGIN, BIG_LETTERS_END, NUMBERS_BEGIN, NUMBERS_END));
        } else if (checkBoxCapitalLetters.isSelected() && checkBoxSpecialSigns.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfSmallAndBigLetters(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString()), BIG_LETTERS_BEGIN, BIG_LETTERS_END, SPECIAL_SIGNS_BEGIN, SPECIAL_SIGNS_END));
        } else if (chexBoxDigitals.isSelected() && checkBoxSpecialSigns.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfSmallAndBigLetters(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString()), NUMBERS_BEGIN, NUMBERS_END, SPECIAL_SIGNS_BEGIN, SPECIAL_SIGNS_END));
        } else if (checkBoxCapitalLetters.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfBigLetters(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString())));
        } else if (chexBoxDigitals.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfNumbers(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString())));
        } else if (checkBoxSpecialSigns.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfSpecialSigns(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString())));
        } else if (checkBoxSmallLetters.isSelected()) {
            labelPasswords.setText(Logic.generatePasswordMadeOfSmallLetters(Integer.parseInt(ComboBoxNumberOfSigns.getSelectedItem().toString())));
        } else {
            labelPasswords.setText("");
        }
    }


    private void buttonExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExecuteActionPerformed

        execute();
    }//GEN-LAST:event_buttonExecuteActionPerformed


    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        exitProgram();
    }//GEN-LAST:event_buttonExitActionPerformed


    private void buttonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCopyActionPerformed
        copyText();
    }//GEN-LAST:event_buttonCopyActionPerformed

    private void labelPasswordsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPasswordsMouseReleased

    }//GEN-LAST:event_labelPasswordsMouseReleased

    private void buttonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCleanActionPerformed
        clearFields();
    }//GEN-LAST:event_buttonCleanActionPerformed


    private void buttonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAboutActionPerformed

        about();
    }//GEN-LAST:event_buttonAboutActionPerformed


    private void ComboBoxNumberOfSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNumberOfSignsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxNumberOfSignsActionPerformed

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
            java.util.logging.Logger.getLogger(PasswordGeneratorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordGeneratorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordGeneratorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordGeneratorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordGeneratorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxNumberOfSigns;
    private javax.swing.JToggleButton buttonAbout;
    private javax.swing.JToggleButton buttonClean;
    private javax.swing.JToggleButton buttonCopy;
    private javax.swing.JToggleButton buttonExecute;
    private javax.swing.JToggleButton buttonExit;
    private javax.swing.JToggleButton buttonHome;
    private javax.swing.JCheckBox checkBoxCapitalLetters;
    private javax.swing.JCheckBox checkBoxSmallLetters;
    private javax.swing.JCheckBox checkBoxSpecialSigns;
    private javax.swing.JCheckBox chexBoxDigitals;
    private javax.swing.JDialog dialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea labelPasswords;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
