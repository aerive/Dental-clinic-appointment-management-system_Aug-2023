package GUI;

import projectskip1103.AppointmentArray;
public class MainGUI extends javax.swing.JFrame {
  AppointmentArray appointmentArray;

  public MainGUI() {
    initComponents();
    appointmentArray = new AppointmentArray(); 
  } 
@SuppressWarnings("unchecked") 
// <editor-fold defaultstate="collapsed" desc="Generated Code"> 
private void initComponents() { 
  
  lblCClinicName = new javax.swing.JLabel(); 
  lblClinicAddress = new javax.swing.JLabel(); 
  btnAddAppointment = new javax.swing.JButton(); 
  btnViewRecords = new javax.swing.JButton();
  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
  
  lblCClinicName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N 
  lblCClinicName.setText("SERI MAJU DENTAL CLINIC"); 
  lblClinicAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N 
  lblClinicAddress.setText("NO 171, TAMAN LIMAN 33020 KUALA KANGSAR, PERAK"); 

  btnAddAppointment.setText("ADD APPOINTMENT"); 
  btnAddAppointment.addActionListener(new java.awt.event.ActionListener() { 
    public void actionPerformed(java.awt.event.ActionEvent evt) { 
      btnAddAppointmentActionPerformed(evt); 
    } 
  }); 

  btnViewRecords.setText("VIEW RECORDS"); 
  btnViewRecords.addActionListener(new java.awt.event.ActionListener() { 
    public void actionPerformed(java.awt.event.ActionEvent evt) { 
      btnViewRecordsActionPerformed(evt); 
    } 
  }); 

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
  getContentPane().setLayout(layout); 
  layout.setHorizontalGroup( 
  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
        .addGroup(layout.createSequentialGroup() 
          .addGap(66, 66, 66) 
            .addComponent(btnAddAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE) 
          .addGap(62, 62, 62) 
          .addComponent(btnViewRecords)) 
        .addGroup(layout.createSequentialGroup() 
          .addGap(120, 120, 120) 
          .addComponent(lblCClinicName)) 
        .addGroup(layout.createSequentialGroup() 
          .addGap(66, 66, 66) 
          .addComponent(lblClinicAddress))) 
        .addGap(83, 83, 83)) 
  ); 
  layout.setVerticalGroup(
  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
  .addGroup(layout.createSequentialGroup() 
    .addGap(72, 72, 72) 
    .addComponent(lblCClinicName) 
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(lblClinicAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE) 
    .addGap(53, 53, 53)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
      .addComponent(btnAddAppointment) 
      .addComponent(btnViewRecords)) 
    .addGap(102, 102, 102)) 
  ); 

  pack(); 
}// </editor-fold> 

private void btnAddAppointmentActionPerformed(java.awt.event.ActionEvent evt) { 
  // TODO add your handling code here: 
  this.setVisible(false); 
  AppointmentGUI appointmentFrame = new AppointmentGUI(this,appointmentArray); 
  //appointmentFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
  appointmentFrame.setVisible(true); 
} 

private void btnViewRecordsActionPerformed(java.awt.event.ActionEvent evt) { 
  // TODO add your handling code here: 
  this.setVisible(false); 
  ViewRecordGUI viewRecordFrame = new ViewRecordGUI(this,appointmentArray); 
  //viewRecordFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
  viewRecordFrame.setVisible(true); 
} 

public static void main(String args[]) { 
  java.awt.EventQueue.invokeLater(new Runnable() { 
    public void run() { 
      MainGUI mainFrame = new MainGUI(); 
      //mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      mainFrame.setVisible(true); 
    } 
  }); 
} 

// Variables declaration- do not modify
private javax.swing.JButton btnAddAppointment; 
private javax.swing.JButton btnViewRecords; 
private javax.swing.JLabel lblCClinicName; 
private javax.swing.JLabel lblClinicAddress; 
// End of variables declaration 
}
