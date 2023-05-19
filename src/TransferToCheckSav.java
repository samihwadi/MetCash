/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author jessicamorcos
 */
public class TransferToCheckSav extends javax.swing.JFrame {
    private User user;
    private List<User> users;

    private int money;

    /**
     * Creates new form TransferToCheckSav1
     */
    public TransferToCheckSav(User user, List<User> users) {
        this.user = user;
        this.users = users;

        initComponents();
        SavingsText.setText("$" + user.getSavingsBalance());
        CheckbalanceText1.setText("$" + user.getCheckingsBalance());
    }
    public TransferToCheckSav(List<User> users){
        this.users = users;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CheckingToSavingsButtons = new javax.swing.JButton();
        AmountToTransferPanel = new javax.swing.JPanel();
        AmountTransferTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TransferFromTextField = new javax.swing.JLabel();
        SavingsToCheckingsButtons = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        CheckingBalanceLabel = new javax.swing.JLabel();
        BalanceNumberPanel1 = new javax.swing.JPanel();
        CheckbalanceText1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        SavingsBalanceLabel = new javax.swing.JLabel();
        BalanceNumberPanel = new javax.swing.JPanel();
        SavingsText = new javax.swing.JLabel();
        TransferFundsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MetCash");
        setResizable(false);

        jPanel2.setMaximumSize(new java.awt.Dimension(734, 394));
        jPanel2.setMinimumSize(new java.awt.Dimension(734, 394));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("TRANSFER FUNDS: CHECKING/SAVINGS");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/titoosemobor/TMU-ComputerSci/JAVA/ATMProject/assets/rsz_4rsz_1rsz_metcash-high-resolution-logo-black-on-transparent-background.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        CheckingToSavingsButtons.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        CheckingToSavingsButtons.setText("Checking To Savings > ");
        CheckingToSavingsButtons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        CheckingToSavingsButtons.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CheckingToSavingsButtons.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        CheckingToSavingsButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckingToSavingsButtonsActionPerformed(evt);
            }
        });

        AmountToTransferPanel.setBackground(new java.awt.Color(232, 232, 232));
        AmountToTransferPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(222, 222, 222)));

        AmountTransferTextField.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        AmountTransferTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountTransferTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel2.setText("Amount to Transfer:");

        javax.swing.GroupLayout AmountToTransferPanelLayout = new javax.swing.GroupLayout(AmountToTransferPanel);
        AmountToTransferPanel.setLayout(AmountToTransferPanelLayout);
        AmountToTransferPanelLayout.setHorizontalGroup(
            AmountToTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AmountToTransferPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AmountToTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AmountTransferTextField)
                    .addGroup(AmountToTransferPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AmountToTransferPanelLayout.setVerticalGroup(
            AmountToTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AmountToTransferPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmountTransferTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        TransferFromTextField.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        TransferFromTextField.setText("Transfer From:");

        SavingsToCheckingsButtons.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SavingsToCheckingsButtons.setText("Savings To Checking > ");
        SavingsToCheckingsButtons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        SavingsToCheckingsButtons.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SavingsToCheckingsButtons.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        SavingsToCheckingsButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingsToCheckingsButtonsActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(235, 235, 235));

        CheckingBalanceLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CheckingBalanceLabel.setText("Checking Balance ");

        BalanceNumberPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 153, 153)));
        BalanceNumberPanel1.setPreferredSize(new java.awt.Dimension(142, 66));

        CheckbalanceText1.setBackground(new java.awt.Color(204, 204, 204));
        CheckbalanceText1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        CheckbalanceText1.setForeground(new java.awt.Color(51, 51, 51));
        CheckbalanceText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout BalanceNumberPanel1Layout = new javax.swing.GroupLayout(BalanceNumberPanel1);
        BalanceNumberPanel1.setLayout(BalanceNumberPanel1Layout);
        BalanceNumberPanel1Layout.setHorizontalGroup(
            BalanceNumberPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BalanceNumberPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CheckbalanceText1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        BalanceNumberPanel1Layout.setVerticalGroup(
            BalanceNumberPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BalanceNumberPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CheckbalanceText1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(CheckingBalanceLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BalanceNumberPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(CheckingBalanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BalanceNumberPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(235, 235, 235));

        SavingsBalanceLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        SavingsBalanceLabel.setText("Savings Balance ");

        BalanceNumberPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(153, 153, 153)));

        SavingsText.setBackground(new java.awt.Color(204, 204, 204));
        SavingsText.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SavingsText.setForeground(new java.awt.Color(51, 51, 51));
        SavingsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout BalanceNumberPanelLayout = new javax.swing.GroupLayout(BalanceNumberPanel);
        BalanceNumberPanel.setLayout(BalanceNumberPanelLayout);
        BalanceNumberPanelLayout.setHorizontalGroup(
            BalanceNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BalanceNumberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SavingsText, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );
        BalanceNumberPanelLayout.setVerticalGroup(
            BalanceNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BalanceNumberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SavingsText, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(SavingsBalanceLabel))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(BalanceNumberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(SavingsBalanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BalanceNumberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TransferFundsButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        TransferFundsButton.setText(" <  Back     ");
        TransferFundsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        TransferFundsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferFundsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AmountToTransferPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TransferFromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckingToSavingsButtons)
                    .addComponent(SavingsToCheckingsButtons, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TransferFundsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(TransferFromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CheckingToSavingsButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SavingsToCheckingsButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(AmountToTransferPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TransferFundsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CheckingToSavingsButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckingToSavingsButtonsActionPerformed
        // TODO add your handling code here:
        String moneyS = AmountTransferTextField.getText();

        if (moneyS.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Missing Information");

        }
        else if (!moneyS.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid Input");
        }
        else {
            // input is all digits
            money = Integer.parseInt(moneyS);
            String[] balances = checkingToSavings(user,money);
            if(balances[2].equals("Insufficient Funds")) {
                JOptionPane.showMessageDialog(this,"Insufficient Funds" );
            }
            else{
                user.setCheckingsBalance(Integer.parseInt(balances[0]));
                user.setSavingsBalance(Integer.parseInt(balances[1]));
                addToTransactionHistoryCheckings("$"+moneyS);
                SavingsText.setText("$" + user.getSavingsBalance());
                CheckbalanceText1.setText("$" + user.getCheckingsBalance());
            }

        }

    }//GEN-LAST:event_CheckingToSavingsButtonsActionPerformed

    public String[] checkingToSavings (User user , Integer Amount){
        Integer balanceCheck = user.getCheckingsBalance();
        Integer balanceSav = user.getSavingsBalance();
        String[] balancesArr ={"","",""};
        if(balanceCheck - Amount >= 0) {
            balanceCheck = balanceCheck - Amount;
            balanceSav = balanceSav + Amount;
            balancesArr[0]=String.valueOf(balanceCheck);
            balancesArr[1]=String.valueOf(balanceSav);
        }else {
            balancesArr[2] = "Insufficient Funds";

        }
        return balancesArr;
    }

    private void SavingsToCheckingsButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavingsToCheckingsButtonsActionPerformed
        // TODO add your handling code here:
        String moneyS = AmountTransferTextField.getText();
        if (moneyS.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else if (!moneyS.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid Input");
        }
        else {
            // input is all digits
            money = Integer.parseInt(moneyS);
            String[] balances = savingsToCheckings(user,money);
            if(balances[2].equals("Insufficient Funds")) {
                JOptionPane.showMessageDialog(this,"Insufficient Funds" );
            }
            else{
                user.setCheckingsBalance(Integer.parseInt(balances[0]));
                user.setSavingsBalance(Integer.parseInt(balances[1]));
                addToTransactionHistorySavings("$"+moneyS);
                SavingsText.setText("$" + user.getSavingsBalance());
                CheckbalanceText1.setText("$" + user.getCheckingsBalance());
            }
            // do something with the account number
        }

    }//GEN-LAST:event_SavingsToCheckingsButtonsActionPerformed
    public String[] savingsToCheckings (User user , Integer Amount){
        Integer balanceCheck = user.getCheckingsBalance();
        Integer balanceSav = user.getSavingsBalance();
        String[] balancesArr ={"","",""};
        if(balanceSav - Amount >= 0) {
            balanceCheck = balanceCheck + Amount;
            balanceSav = balanceSav - Amount;
            balancesArr[0]=String.valueOf(balanceCheck);
            balancesArr[1]=String.valueOf(balanceSav);
        }else {
            balancesArr[2] = "Insufficient Funds";

        }
        return balancesArr;
    }
    private void TransferFundsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferFundsButtonActionPerformed
        // TODO add your handling code here:
        TransferFunds transferMenu = new TransferFunds(user,users);
        transferMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TransferFundsButtonActionPerformed

    private void AmountTransferTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountTransferTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountTransferTextFieldActionPerformed

    public void addToTransactionHistoryCheckings(String value){
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date and time as a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDateTime = now.format(formatter);

        try {
            // Open the file in append mode
            FileWriter fw = new FileWriter(user.getTransactionPaper(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Append some data to the file
            bw.write("Savings Transfer/"+value+"/Checkings/"+formattedDateTime+"\n");

            // Close the writers
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addToTransactionHistorySavings(String value){
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date and time as a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDateTime = now.format(formatter);

        try {
            // Open the file in append mode
            FileWriter fw = new FileWriter(user.getTransactionPaper(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Append some data to the file
            bw.write("Checkings Transfer/"+value+"/Savings/"+formattedDateTime+"\n");

            // Close the writers
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AmountToTransferPanel;
    private javax.swing.JTextField AmountTransferTextField;
    private javax.swing.JPanel BalanceNumberPanel;
    private javax.swing.JPanel BalanceNumberPanel1;
    private javax.swing.JLabel CheckbalanceText1;
    private javax.swing.JLabel CheckingBalanceLabel;
    private javax.swing.JButton CheckingToSavingsButtons;
    private javax.swing.JLabel SavingsBalanceLabel;
    private javax.swing.JLabel SavingsText;
    private javax.swing.JButton SavingsToCheckingsButtons;
    private javax.swing.JLabel TransferFromTextField;
    private javax.swing.JButton TransferFundsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}