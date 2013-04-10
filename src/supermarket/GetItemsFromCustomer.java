/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author SampritBiswas
 */
public class GetItemsFromCustomer extends javax.swing.JFrame {

    /**
     * Creates new form GetItemsFromCustomer
     */
    
    public GetItemsFromCustomer() {
        arrayItem = new ArrayList<>();
        item = new Item();
                      
        initComponents();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addMoreButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        manuText = new javax.swing.JTextField();
        numberText = new javax.swing.JTextField();
        typeText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        weightText = new javax.swing.JTextField();
        getDetailsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Item ID");

        jLabel2.setText("Name");

        jLabel3.setText("Manufacturer");

        jLabel4.setText("Number of items");

        jLabel5.setText("Type");

        jLabel6.setText("Price");

        jLabel7.setText("Weight");

        addMoreButton.setText("Add More");
        addMoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoreButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        weightText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTextActionPerformed(evt);
            }
        });

        getDetailsButton.setText("Give details");
        getDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDetailsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idText, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(nameText)
                            .addComponent(manuText)
                            .addComponent(numberText)
                            .addComponent(typeText)
                            .addComponent(priceText)
                            .addComponent(weightText))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addMoreButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(submitButton)
                        .addGap(83, 83, 83))))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(getDetailsButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(manuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(typeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(getDetailsButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMoreButton)
                    .addComponent(submitButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDetailsButtonActionPerformed
        String id = idText.getText();
        String numberOfItems = numberText.getText();
        String weight = weightText.getText();
        int temp = 0;
        ArrayList<Item> dataBase = new GetInfoFromFiles().getItems();

        if (id.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Give an ID");
            return;
        }
        /*if (numberOfItems.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Give number of items");
            return;
        }*/
        if(weight.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Give Weight");
            return;
        }

        for (Item i : dataBase) {

            if (i.getID().equalsIgnoreCase(id)) {
                float no =(Float.parseFloat(weight)/i.getWeight());
                if(no - (int)no > 0.5){
                    no = (int)no;
                    no++;
                }else if(no - (int)no < 0.5){
                    no = (int)no;
                }
                
                if((int)no == 0){
                    temp = 2;
                    JOptionPane.showMessageDialog(this, "Enter Valid Weight!!");
                    return;
                }
                
                numberOfItems =((int) no)+"";
                numberText.setText(numberOfItems);
                item = i;
                temp = 1;
                try {
                    item.setItemsBought(Integer.parseInt(numberOfItems));
                } catch (Exception ex) {
                    temp = 2;
                    JOptionPane.showMessageDialog(this, "Enter Valid Weight!!");
                    return;
                }
                break;
            }
        }
        if (temp == 0) {
            JOptionPane.showMessageDialog(this, "Incorrect Item-Id");
        } else if (temp == 2) {
        } else {
            manuText.setText(item.getManufacturer());
            nameText.setText(item.getItemName());
            priceText.setText(item.getSellPrice() + "");
            typeText.setText(item.getType());
            //weightText.setText(item.getWeight() + "");
        }
    }//GEN-LAST:event_getDetailsButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        submitButton.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        if (!idText.getText().equals("")) {
            item.setDateSold(new Date());
            arrayItem.add(item);
        } else {
            JOptionPane.showMessageDialog(this, "Give an ID");
            submitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            return;
        }
        item = new Item();
        manuText.setText("");
        nameText.setText("");
        priceText.setText("");
        typeText.setText("");
        weightText.setText("");
        idText.setText("");
        numberText.setText("");
        try {
            System.out.println(arrayItem.size());
            if (arrayItem.size() != 0) {
                try{
                    MakeChangesToOurData make = new MakeChangesToOurData(arrayItem);
                    
                }catch(Exception e){
                    arrayItem.clear();
                    submitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    return;
                }
            } else {
                throw new Exception();
            }
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No Items To Generate Bill!!");
        }
        submitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_submitButtonActionPerformed

    private void addMoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMoreButtonActionPerformed
        if (!idText.getText().equals("")) {
            item.setDateSold(new Date());
            arrayItem.add(item);
        } else {
            JOptionPane.showMessageDialog(this, "Give an ID");
            return;
        }

        item = new Item();
        manuText.setText("");
        nameText.setText("");
        priceText.setText("");
        typeText.setText("");
        weightText.setText("");
        idText.setText("");
        numberText.setText("");
    }//GEN-LAST:event_addMoreButtonActionPerformed

    private void weightTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTextActionPerformed
        getDetailsButtonActionPerformed(evt);
    }//GEN-LAST:event_weightTextActionPerformed

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
            java.util.logging.Logger.getLogger(GetItemsFromCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetItemsFromCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetItemsFromCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetItemsFromCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetItemsFromCustomer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addMoreButton;
    public javax.swing.JButton getDetailsButton;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField manuText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField numberText;
    private javax.swing.JTextField priceText;
    public javax.swing.JButton submitButton;
    private javax.swing.JTextField typeText;
    private javax.swing.JTextField weightText;
    // End of variables declaration//GEN-END:variables
    ArrayList<Item> arrayItem;
    Item item;
    Employee emp;
}