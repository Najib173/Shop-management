
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class NewJFrame3 extends javax.swing.JFrame {

    public NewJFrame3() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        sum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sum2 = new javax.swing.JTextField();
        discount = new javax.swing.JTextField();
        dicounted = new javax.swing.JTextField();
        vat = new javax.swing.JTextField();
        given = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        backm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        taka = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        taka1 = new javax.swing.JTextField();
        taka2 = new javax.swing.JTextField();
        taka3 = new javax.swing.JTextField();
        taka4 = new javax.swing.JTextField();
        taka5 = new javax.swing.JTextField();
        taka6 = new javax.swing.JTextField();
        taka7 = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        all = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        sumall = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        getContentPane().setLayout(null);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(10, 20, 120, 40);

        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 110, 110, 30);
        getContentPane().add(price);
        price.setBounds(20, 100, 100, 40);

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        getContentPane().add(amount);
        amount.setBounds(170, 20, 130, 40);

        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });
        getContentPane().add(sum);
        sum.setBounds(270, 100, 120, 40);

        jLabel1.setText("PRODUCT NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 120, 20);

        jLabel2.setText("PRODUCT AMOUNT");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 0, 170, 14);

        jLabel3.setText("PRICE/k.g");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 130, 20);
        getContentPane().add(sum2);
        sum2.setBounds(120, 190, 120, 40);
        getContentPane().add(discount);
        discount.setBounds(120, 250, 90, 30);
        getContentPane().add(dicounted);
        dicounted.setBounds(250, 250, 93, 42);
        getContentPane().add(vat);
        vat.setBounds(387, 249, 81, 40);

        given.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                givenActionPerformed(evt);
            }
        });
        getContentPane().add(given);
        given.setBounds(477, 249, 90, 30);

        jButton2.setText("discount");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 290, 90, 23);

        jLabel4.setText("Price:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 80, 80, 14);

        jLabel5.setText("TOTAL AMOUNT:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 210, 90, 14);

        jLabel6.setText("BACK");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(652, 286, 60, 14);

        jLabel7.setText("DISCOUNTED PRICE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 230, 120, 14);

        jLabel8.setText("PRICE+VAT");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(390, 230, 80, 20);

        jLabel9.setText("GIVEN");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(490, 290, 60, 14);

        jButton3.setText("amount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(565, 248, 69, 23);
        getContentPane().add(backm);
        backm.setBounds(652, 249, 220, 30);

        jLabel10.setText("GIVE DISCOUNT:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 260, 100, 14);
        getContentPane().add(taka);
        taka.setBounds(580, 300, 170, 30);

        jLabel11.setText("<=CURRENCY");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(790, 404, 70, 40);
        getContentPane().add(taka1);
        taka1.setBounds(580, 330, 170, 30);
        getContentPane().add(taka2);
        taka2.setBounds(580, 360, 170, 30);
        getContentPane().add(taka3);
        taka3.setBounds(580, 390, 170, 30);
        getContentPane().add(taka4);
        taka4.setBounds(580, 420, 170, 30);
        getContentPane().add(taka5);
        taka5.setBounds(580, 450, 170, 30);
        getContentPane().add(taka6);
        taka6.setBounds(580, 480, 170, 30);
        getContentPane().add(taka7);
        taka7.setBounds(580, 510, 170, 30);

        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(570, 120, 100, 40);

        jButton4.setText("CLEAR ALL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(300, 380, 150, 40);

        jButton5.setText("PRINT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(120, 380, 140, 40);

        jScrollPane1.setViewportView(all);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(690, 10, 170, 220);

        jLabel12.setText("CASH MEMO =>");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(590, 10, 140, 30);
        getContentPane().add(sumall);
        sumall.setBounds(120, 440, 130, 50);

        jLabel13.setText("All sum");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(160, 490, 70, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        
    }//GEN-LAST:event_amountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        File fm = new File("output.txt");
        File fn = new File("sum.txt");
        File fk = new File("szl.txt");
        File f = new File("input.txt");
        File fh = new File("saz.txt");
       

        double getsum = 0;
        double allsum=0;
        String s = name.getText();
        s=s.toLowerCase();
        double pr = 0;
        int amo=0,amou=0;
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String t = sc.nextLine();
                if (t.endsWith(s)) {

                    pr = sc.nextDouble();
                }
            }
        } catch (Exception exp) {

        }
        
        price.setText(String.valueOf(pr));
       
        double a = Double.parseDouble(amount.getText());
        productname p = new productname(s, pr, a);
        sum.setText(String.valueOf(p.sum()));
        try {
            Scanner sc = new Scanner(fh);
            
                String t = sc.nextLine();
                if (t.endsWith(s)) {

                    amo = sc.nextInt();
                     amou=amo-(int)a;
                   
                
                
            }
        } catch (Exception exp) {

        }
         try {
            Scanner sc = new Scanner(fh);
            while (sc.hasNextLine()) {
                String t = sc.nextLine();
                if (t.endsWith(s)) {
  while (sc.hasNextLine()){
                  
                   FileWriter f4 = new FileWriter(fh,true);
                  //f4.write("");
                   f4.append(String.valueOf(amou = sc.nextInt()));
                  f4.close();
                   break;
                }
                }
            }
        } catch (Exception exp) {

        }

        try {
            
            FileWriter fw = new FileWriter(fm, true);
            FileWriter f2 = new FileWriter(fn, true);
            FileWriter f3 = new FileWriter(fk, true);
            f2.write(String.valueOf(p.sum()));
            f2.write("\n");
            f3.write(String.valueOf(p.sum()));
            f3.write("\n");
            fw.write(s + " " + String.valueOf(a) + " " + String.valueOf(pr));
            fw.write("\n");
            fw.close();
            f2.close();
            f3.close();
        } catch (Exception ex) {

        }

        try {
            Scanner sc = new Scanner(fn);
            while (sc.hasNextLine()) {
                double t = sc.nextDouble();

                getsum = t + getsum;

               sum2.setText(String.valueOf(getsum));
            }
        } catch (Exception e) {

        }
        try {
            Scanner sc = new Scanner(fk);
            while (sc.hasNextLine()) {
                double t = sc.nextDouble();
                
                 allsum= t + allsum;

               sumall.setText(String.valueOf(allsum));
            }
        } catch (Exception e) {

        }
        
      
        all.setText(all.getText() + name.getText()+ "  "+ amount.getText()+" kg   = "+sum.getText()  +" taka" +"\n"  );
       
        name.setText("");
        
        amount.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double getsum2 = Double.parseDouble(sum2.getText()) - Double.parseDouble(discount.getText()) * Double.parseDouble(sum2.getText()) / 100;
        dicounted.setText(String.valueOf(getsum2));
        double getsum3 = getsum2 + (getsum2 * 5) / 100;
        vat.setText(String.valueOf(getsum3));

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double back = Double.parseDouble(given.getText()) - Double.parseDouble(vat.getText());
        backm.setText(String.valueOf(back));
        if (back != 0) {
            int r;

            if (back >= 500) {
                r = (int) (back / 500);
                back = back % 500;
                taka.setText("500 taka = " + String.valueOf(r));

            }
            if (back >= 100) {
                r = (int) (back / 100);
                back = (back % 100);
                taka1.setText("100 taka = " + String.valueOf(r));

            }
            if (back >= 50) {
                r = (int) (back / 50);
                back = (back % 50);
                taka2.setText("50 taka = " + String.valueOf(r));

            }
            if (back >= 20) {
                r = (int) (back / 20);
                back = (back % 20);
                taka3.setText("20 taka = " + String.valueOf(r));

            }
            if (back >= 10) {
                r = (int) (back / 10);
                back = (back % 10);
                taka4.setText("10 taka = " + String.valueOf(r));

            }
            if (back >= 5) {
                r = (int) (back / 5);
                back = (back % 5);
                taka5.setText("5 taka = " + String.valueOf(r));
            }
            if (back >= 2) {
                r = (int) (back / 2);
                back = (back % 2);
                taka6.setText("2 taka = " + String.valueOf(r));

            }
            if (back >= 1) {
                r = (int) (back / 1);
                back = (back % 1);
                taka7.setText("chocklet = " + String.valueOf(r));
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
       
    }//GEN-LAST:event_nameActionPerformed

    private void givenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_givenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_givenActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        name.setText("");
        price.setText("");
        amount.setText("");
        sum.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        name.setText("");
        price.setText("");
        amount.setText("");
        sum.setText("");
        sum2.setText("");
        discount.setText("");
        dicounted.setText("");
        vat.setText("");
        given.setText("");
        backm.setText("");
        taka.setText("");
        taka1.setText("");
        taka2.setText("");
        taka3.setText("");
        taka4.setText("");
        taka5.setText("");
        taka6.setText("");
        taka7.setText("");
        all.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            FileWriter fk = new FileWriter("receit.txt");
            fk.write("STS SUPER SHOP");
            fk.write("\n");
            fk.write("           (Shop):Arogra)");
            fk.write("\n");
            
             fk.write("\n");
            
            fk.write("---------------------------------------=");
            fk.write("\n");
                    
                    
             fk.write("\n");
            fk.write(all.getText());
            fk.write("---------------------------------------=");
            fk.write("\n");
            fk.write("Total amount    =     " + sum2.getText() + "taka");
            fk.write("\n");
            fk.write(" Discount     =       " + discount.getText() + " %");
            fk.write("\n");
            fk.write(" Discounted price =  " + dicounted.getText() + " taka");
            fk.write("\n");
            fk.write(" Price + Vat   =     " + vat.getText() + " taka");
            fk.write("\n");
            fk.write(" Given amount   =   " + given.getText() + " taka");
            fk.write("\n");
            fk.write("---------------------------------------=");
            fk.write("\n");
            fk.write(" Return amount  =     " + backm.getText() + " taka");
            fk.write("\n");
            fk.write("THANK YOU");
            fk.close(); 
            
        } catch (Exception expc) {}
        File fn = new File("sum.txt");
        try{
            FileWriter f2 = new FileWriter(fn);
            f2.write("");
            f2.close();
        }
        catch (Exception exce){
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame3().setVisible(true);
                //new NewJFrame3("");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane all;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField backm;
    private javax.swing.JButton clear;
    private javax.swing.JTextField dicounted;
    private javax.swing.JTextField discount;
    private javax.swing.JTextField given;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField sum;
    private javax.swing.JTextField sum2;
    private javax.swing.JTextField sumall;
    private javax.swing.JTextField taka;
    private javax.swing.JTextField taka1;
    private javax.swing.JTextField taka2;
    private javax.swing.JTextField taka3;
    private javax.swing.JTextField taka4;
    private javax.swing.JTextField taka5;
    private javax.swing.JTextField taka6;
    private javax.swing.JTextField taka7;
    private javax.swing.JTextField vat;
    // End of variables declaration//GEN-END:variables
}
