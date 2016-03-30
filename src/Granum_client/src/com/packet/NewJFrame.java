/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packet;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;


/**
 *
 * @author Kirs
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public static String port = null;
    
    static byte step = 1;
    static DataPacket pkt = new DataPacket();
    static int buf;
    
    private static SerialPort serialPort;

    
    public NewJFrame() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COM & Packet");

        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Open");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Port:");

        jLabel1.setText("Number:");

        jLabel2.setText("Time:");

        jLabel4.setText("Temperature:");

        jLabel5.setText("Pressure:");

        jLabel6.setText(" Humidity:");

        jLabel7.setText("Oxygen");

        jLabel8.setText("CO2");

        jLabel9.setText("Parachute");

        jLabel11.setText("Legs");

        jLabel12.setText("Fell");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        jLabel16.setText("jLabel16");

        jLabel17.setText("jLabel17");

        jLabel18.setText("jLabel18");

        jLabel19.setText("jLabel19");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(0, 69, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel13))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(serialPort.isOpened() == false) {
            port = jTextField1.getText();
            jTextField1.setEditable(false);
            try {
                serialPort = new SerialPort(jTextField1.getText());
                serialPort.openPort();
                serialPort.setParams(SerialPort.BAUDRATE_9600,
                                     SerialPort.DATABITS_8,
                                     SerialPort.STOPBITS_1,
                                     SerialPort.PARITY_NONE);
                serialPort.addEventListener(new PortReader(), SerialPort.MASK_RXCHAR);
                jButton2.setText("Close");
                /*try(FileOutputStream fos=new FileOutputStream("C://SomeDir//notes.txt")) {
                    fos.write(0xff);
                    File file = new File();
                    file.
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                } */

            }
            catch (SerialPortException ex) {
                JOptionPane.showMessageDialog(rootPane, "Can't open (" + ex + ")");
                jTextField1.setEditable(true);
            }
            
        }
        else {
            try {
                serialPort.closePort();
                jTextField1.setEditable(true);
                jButton2.setText("Open");
            }
            catch (SerialPortException ex) {
                JOptionPane.showMessageDialog(rootPane, "Can't close (" + ex + ")");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        serialPort = new SerialPort("null");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        
        });
    }
    
    public void display_packet(DataPacket packet) {
            jLabel13.setText(Integer.toString(packet.number));
            jLabel14.setText(Integer.toString(packet.time));
            float temperature = packet.temperature1/(float)16;
            jLabel15.setText(Float.toString(temperature));
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
     private class PortReader implements SerialPortEventListener {

        public void serialEvent(SerialPortEvent event) {
            if(event.isRXCHAR() && event.getEventValue() > 0){
                try {
                    while(serialPort.getInputBufferBytesCount()!=0) {
                        byte[] data = serialPort.readBytes(1);
                        int dataint = data[0] & 0xff;
                        pkt.truecntrl += dataint;
                        switch(step) {
                            case 1:
                                if(dataint == 0xff) {
                                    step++;
                                }
                                break;
                            case 2:
                                if(dataint == 0xff) {
                                    step++;
                                }
                                else {
                                    step = 1;
                                }
                                break;
                            case 3:
                                buf = dataint;
                                step++;
                                break;
                            case 4:
                                pkt.number = (int)((dataint<<8)| buf);
                                step++;
                                break;
                            case 5:
                                buf = dataint;
                                step++;
                                break;
                            case 6:
                                pkt.time = (int)(dataint<<8 | buf);
                                step++;
                                break;
                            case 7:
                                buf = dataint;
                                step++;
                                break;
                            case 8:
                                pkt.time_part = (int)(dataint<<8 | buf);
                                step++;
                                break;
                            case 9:
                                buf = dataint;
                                step++;
                                break;
                            case 10:
                                pkt.temperature1 = (int)(dataint<<8 | buf);
                                step++;
                                break;
                            case 11:
                                buf = dataint;
                                step++;
                                break;
                            case 12:
                                pkt.temperature2 = (int)(dataint<<8 | buf);
                                step++;
                                break;
                            case 13:
                                buf = dataint;
                                step++;
                                break;
                            case 14:
                                pkt.pressure = (int)(dataint<<8 | buf);
                                step++;
                                break;
                            case 15:
                                buf = dataint;
                                step++;
                                break;
                            case 16:
                                pkt.humidity = (int)(dataint<<8 | buf);
                                step++;
                                break;
                            case 17:
                                buf = dataint;
                                step++;
                                break;
                            case 18:
                                pkt.O2 = (int)(dataint<<8 | buf);
                                step++;
                                break;
                            case 19:
                                buf = dataint;
                                step++;
                                break;
                            case 20:
                                pkt.CO2 = (int)(dataint<<8 | buf);
                                step++;
                                break;
                            case 21:
                                buf = dataint;
                                step++;
                                break;
                            case 22:
                                pkt.rezistance12 = (int)(dataint<<8 | buf);
                                step++;
                                break;
                            case 23:
                                buf = dataint;
                                step++;
                                break;
                            case 24:
                                pkt.rezistance23 = (int)(dataint<<8 | buf);
                                step++;
                                break;
                            case 25:
                                buf = dataint;
                                step++;
                                break;
                            case 26:
                                pkt.rezistance13 = (int)(dataint<<8 | buf);
                                step++;
                                break;
                            case 27:
                                pkt.legs = dataint;
                                step++;
                                break;
                            case 28:
                                pkt.parachute = dataint;
                                step++;
                                break;
                            case 29:
                                buf = dataint;
                                pkt.truecntrl -= dataint;
                                step++;
                                break;
                            case 30:
                                pkt.truecntrl -= dataint;
                                pkt.cntrl = (int)(dataint<<8 | buf);
                                step = 1;
                                if(pkt.check()) {
                                    display_packet(pkt);
                                    System.out.println(pkt);
                                }
                                pkt = new DataPacket();
                                break;
                            
                        }
                    }
                }
                catch (SerialPortException ex) {
                    System.out.println(ex);
                }
            }
        }
    }

}
