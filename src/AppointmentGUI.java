package GUI;

import javax.swing.JOptionPane; 
import javax.swing.event.DocumentEvent; 
import javax.swing.event.DocumentListener; 
import projectskip1103.Appointment; 
import projectskip1103.AppointmentArray; 
import projectskip1103.Patient; 

public class AppointmentGUI extends javax.swing.JFrame { 
  Patient patient; 
  Appointment appointment; 
  MainGUI mainGui; 
  AppointmentArray appointmentArray; 
  String scallingType; 
  int fillingCount, extractionCount; 
  int count=0; 

  public AppointmentGUI(MainGUI mainGui, AppointmentArray appointmentArray) { 
    initComponents(); 
    this.patient = new Patient(); 
    this.appointment = new Appointment(patient); 
    this.mainGui = mainGui; 
    this.appointmentArray = appointmentArray; 
    rdMinor.setEnabled(false); 
    rdMajor.setEnabled(false); 
    txtFillingCount.setEnabled(false); 
    txtExtractionCount.setEnabled(false); 
  } 

  public void updateTotalPayment(){ 
    appointment.calculateServicePayments(scallingType, fillingCount, extractionCount); 
    appointment.calculateDiscount(appointmentArray); 
    appointment.calculateTotalPayment(); 
    txtPayment.setText(Double.toString(appointment.getTotalPayment())); 
  }
  @SuppressWarnings("unchecked") 
  // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
  private void initComponents() { 

    buttonGroup1 = new javax.swing.ButtonGroup(); 
    jPanel1 = new javax.swing.JPanel(); 
    lblAppointmentDetails = new javax.swing.JLabel(); 
    txtName = new javax.swing.JTextField(); 
    lblName = new javax.swing.JLabel(); 
    lblIcNum = new javax.swing.JLabel(); 
    txtIcNum = new javax.swing.JTextField(); 
    lblPhoneNum = new javax.swing.JLabel(); 
    txtPhoneNum = new javax.swing.JTextField(); 
    txtAppointmentId = new javax.swing.JTextField(); 
    lblAppointmentId = new javax.swing.JLabel();
    lblDate = new javax.swing.JLabel();
    txtDate = new javax.swing.JTextField();
    lblTime = new javax.swing.JLabel();
    txtTime = new javax.swing.JTextField(); 
    cmbDay = new javax.swing.JComboBox<>(); 
    lblDay = new javax.swing.JLabel(); 
    jPanel2 = new javax.swing.JPanel(); 
    lblService = new javax.swing.JLabel(); 
    cbScalling = new javax.swing.JCheckBox(); 
    cbFilling = new javax.swing.JCheckBox(); 
    cbExtraction = new javax.swing.JCheckBox(); 
    rdMinor = new javax.swing.JRadioButton(); 
    rdMajor = new javax.swing.JRadioButton(); 
    lblFillingCount = new javax.swing.JLabel(); 
    lblExtractionCount = new javax.swing.JLabel(); 
    txtExtractionCount = new javax.swing.JTextField(); 
    txtFillingCount = new javax.swing.JTextField(); 
    lblPayment = new javax.swing.JLabel(); 
    txtPayment = new javax.swing.JTextField(); 
    btnConfirm = new javax.swing.JButton(); 
    btnReset = new javax.swing.JButton(); 
    btnBack = new javax.swing.JButton(); 

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
    
    lblAppointmentDetails.setText("APPOINTMENT DETAILS"); 

    lblName.setText("Name :");
    lblIcNum.setText("IC Number :"); 
    lblPhoneNum.setText("Phone Number :"); 
    lblAppointmentId.setText("Appointment ID :"); 
    lblDate.setText("Date :"); 
    lblTime.setText("Time :"); 
      
      cmbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" })); 
    cmbDay.addActionListener(new java.awt.event.ActionListener() { 
      public void actionPerformed(java.awt.event.ActionEvent evt) { 
        cmbDayActionPerformed(evt); 
      } 
    }); 

    lblDay.setText("Day :"); 
    
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1); 
    jPanel1.setLayout(jPanel1Layout); 
    jPanel1Layout.setHorizontalGroup( 
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap() 
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
          .addGroup(jPanel1Layout.createSequentialGroup() 
            .addComponent(lblAppointmentId) 
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
              .addComponent(txtAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)) 
            .addGroup(jPanel1Layout.createSequentialGroup() 
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false) 
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup() 
              .addComponent(lblPhoneNum) 
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
              .addComponent(txtPhoneNum)) 
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
              .addComponent(lblIcNum) 
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
              .addComponent(txtIcNum)) 
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup() 
              .addComponent(lblName) 
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
              .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))) 
          .addGap(18, 18, 18) 

    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
      .addGroup(jPanel1Layout.createSequentialGroup() 
        .addComponent(lblDate) 
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
         .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE) 
        .addGap(0, 0, Short.MAX_VALUE)) 
      .addGroup(jPanel1Layout.createSequentialGroup() 

    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
        .addComponent(lblTime) 
        .addComponent(lblDay)) 
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 

    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
        .addComponent(txtTime)
          .addComponent(cmbDay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))) 
        .addContainerGap()) 
      .addGroup(jPanel1Layout.createSequentialGroup() 
        .addGap(89, 89, 89) 
        .addComponent(lblAppointmentDetails) 
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) 
      ); 
      jPanel1Layout.setVerticalGroup( 
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
        .addGroup(jPanel1Layout.createSequentialGroup() 
          .addContainerGap() 
          .addComponent(lblAppointmentDetails) 
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 

    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
        .addComponent(lblName)
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
        .addComponent(lblDate) 
          .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
      .addGap(18, 18, 18) 
      
    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
        .addComponent(lblIcNum) 
          .addComponent(txtIcNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
        .addComponent(lblTime) 
          .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
      .addGap(18, 18, 18) 

    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
        .addComponent(lblPhoneNum) 
          .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
          .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
        .addComponent(lblDay)) 
      .addGap(18, 18, 18) 

    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
        .addComponent(lblAppointmentId) 
          .addComponent(txtAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) 
    ); 

    txtName.getDocument().addDocumentListener(new DocumentListener() { 
      @Override 
      public void insertUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override 
      public void removeUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override
      public void changedUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      private void processUserInput() { 
        patient.setName(txtName.getText()); 
      } 
    }); 
    txtIcNum.getDocument().addDocumentListener(new DocumentListener() { 
      @Override 
      public void insertUpdate(DocumentEvent e) { 
        processUserInput(); 
      }
      @Override 
      public void removeUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override 
      public void changedUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      private void processUserInput() { 
        patient.setIcNum(txtIcNum.getText()); 
      } 
    }); 
    txtPhoneNum.getDocument().addDocumentListener(new DocumentListener() { 
      @Override 
      public void insertUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override 
      public void removeUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override 
      public void changedUpdate(DocumentEvent e) { 
        processUserInput(); 
      }
      
      private void processUserInput() { 
        patient.setPhoneNum(txtPhoneNum.getText()); 
      } 
    }); 
    txtAppointmentId.getDocument().addDocumentListener(new DocumentListener() { 
      @Override 
      public void insertUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override 
      public void removeUpdate(DocumentEvent e) { 
        processUserInput(); 
      }
      @Override 
      public void changedUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      
      private void processUserInput() { 
        appointment.setAppointmentId(txtAppointmentId.getText()); 
      } 
    }); 
    txtDate.getDocument().addDocumentListener(new DocumentListener() { 
      @Override 
      public void insertUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override 
      public void removeUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override 
      public void changedUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 

      private void processUserInput() { 
        appointment.setDate(txtDate.getText()); 
      } 
    });
    txtTime.getDocument().addDocumentListener(new DocumentListener() { 
      @Override 
      public void insertUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override 
      public void removeUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override
      public void changedUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
    
      private void processUserInput() { 
        appointment.setTime(txtTime.getText()); 
      } 
    }); 
    
    lblService.setText("SERVICE"); 

    cbScalling.setText("Scalling"); 
    cbScalling.addActionListener(new java.awt.event.ActionListener() { 
      public void actionPerformed(java.awt.event.ActionEvent evt) { 
        cbScallingActionPerformed(evt); 
      } 
    }); 

    cbFilling.setText("Filling"); 
    cbFilling.addActionListener(new java.awt.event.ActionListener() { 
      public void actionPerformed(java.awt.event.ActionEvent evt) { 
        cbFillingActionPerformed(evt); 
      } 
    }); 

    cbExtraction.setText("Extraction"); 
    cbExtraction.addActionListener(new java.awt.event.ActionListener() { 
      public void actionPerformed(java.awt.event.ActionEvent evt) { 
        cbExtractionActionPerformed(evt); 
      } 
    });

    buttonGroup1.add(rdMinor); 
    rdMinor.setText("Minor"); 
    rdMinor.addActionListener(new java.awt.event.ActionListener() { 
      public void actionPerformed(java.awt.event.ActionEvent evt) { 
        rdMinorActionPerformed(evt); 
      } 
    }); 
    
    buttonGroup1.add(rdMajor); 
    rdMajor.setText("Major"); 
    rdMajor.addActionListener(new java.awt.event.ActionListener() { 
      public void actionPerformed(java.awt.event.ActionEvent evt) { 
        rdMajorActionPerformed(evt); 
      } 
    }); 
    
    lblFillingCount.setText("Teeth Count :"); 
      
    lblExtractionCount.setText("TeethCount :"); 

    lblPayment.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N 
    lblPayment.setText("Total Payment: RM"); 

    txtPayment.setEditable(false); 
    txtPayment.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N 
    txtPayment.setText("0.00"); 

    btnConfirm.setText("CONFIRM"); 
    btnConfirm.addActionListener(new java.awt.event.ActionListener() { 
      public void actionPerformed(java.awt.event.ActionEvent evt) { 
        btnConfirmActionPerformed(evt); 
      } 
    }); 

    btnReset.setText("RESET"); 
    btnReset.addActionListener(new java.awt.event.ActionListener() { 
      public void actionPerformed(java.awt.event.ActionEvent evt) { 
        btnResetActionPerformed(evt); 
      } 
    }); 

    btnBack.setText("BACK"); 
    btnBack.addActionListener(new java.awt.event.ActionListener() { 
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBackActionPerformed(evt); 
      } 
    }); 

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2); 
    jPanel2.setLayout(jPanel2Layout); 
    jPanel2Layout.setHorizontalGroup( 
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
        .addGroup(jPanel2Layout.createSequentialGroup() 

  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
      .addGroup(jPanel2Layout.createSequentialGroup() 
        .addGap(38, 38, 38) 
      .addComponent(btnBack) 
        .addGap(62, 62, 62) 
      .addComponent(btnReset) 
        .addGap(50, 50, 50) 
      .addComponent(btnConfirm)) 
    .addGroup(jPanel2Layout.createSequentialGroup() 
        .addGap(177, 177, 177) 
      .addComponent(lblService)) 
    .addGroup(jPanel2Layout.createSequentialGroup() 
      .addContainerGap() 
      .addComponent(rdMajor)) 
    .addGroup(jPanel2Layout.createSequentialGroup() 
      .addContainerGap() 
      .addComponent(cbFilling)) 
    .addGroup(jPanel2Layout.createSequentialGroup() 
      .addContainerGap() 
      .addComponent(lblExtractionCount) 
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtExtractionCount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)) 
      .addGroup(jPanel2Layout.createSequentialGroup() 
        .addContainerGap() 
        .addComponent(lblFillingCount) 
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
        .addComponent(txtFillingCount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)) 
        .addGroup(jPanel2Layout.createSequentialGroup() 
        .addContainerGap()

    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
        .addComponent(cbScalling)
        .addComponent(rdMinor))) 
      .addGroup(jPanel2Layout.createSequentialGroup() 
        .addContainerGap() 
        .addComponent(cbExtraction)) 
      .addGroup(jPanel2Layout.createSequentialGroup() 
        .addContainerGap() 
        .addComponent(lblPayment) 
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
        .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))) 
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) 
    ); 
    jPanel2Layout.setVerticalGroup( 
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
      .addGroup(jPanel2Layout.createSequentialGroup() 
        .addComponent(lblService) 
        .addGap(18, 18, 18) 
        .addComponent(cbScalling) 
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
        .addComponent(rdMinor) 
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
        .addComponent(rdMajor) .addGap(18, 18, 18) 
        .addComponent(cbFilling) 
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 

    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
        .addComponent(lblFillingCount) 
        .addComponent(txtFillingCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
      .addGap(18, 18, 18) 
      .addComponent(cbExtraction) 
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 

    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
        .addComponent(lblExtractionCount) 
          .addComponent(txtExtractionCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE) 
        
    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
        .addComponent(lblPayment)
          .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
        .addGap(23, 23, 23) 

    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
        .addComponent(btnReset) 
        .addComponent(btnBack)   
        .addComponent(btnConfirm)) 
      .addGap(29, 29, 29)) 
    ); 

    txtExtractionCount.getDocument().addDocumentListener(new DocumentListener() { 
      @Override 
      public void insertUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override 
      public void removeUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override 
      public void changedUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      private void processUserInput() { 
        if(txtExtractionCount.getText().isEmpty()) { 
          extractionCount = 0; 
        } 
        else { 
          extractionCount = Integer.parseInt(txtExtractionCount.getText()); 
        } 
        updateTotalPayment(); 
      } 
    }); 
    txtFillingCount.getDocument().addDocumentListener(new DocumentListener() { 
      @Override 
      public void insertUpdate(DocumentEvent e) { 
        processUserInput(); 
      }
      @Override 
      public void removeUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      @Override 
      public void changedUpdate(DocumentEvent e) { 
        processUserInput(); 
      } 
      private void processUserInput() { 
        if(txtFillingCount.getText().isEmpty()) { 
          fillingCount = 0; 
        } 
        else { 
          fillingCount = Integer.parseInt(txtFillingCount.getText()); 
        } 
        updateTotalPayment(); 
      } 
    }); 

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
    getContentPane().setLayout(layout); 
    layout.setHorizontalGroup( 
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 
      ); 
      layout.setVerticalGroup( 
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
        .addGroup(layout.createSequentialGroup() 
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) 
      );
      pack(); 
    }// </editor-fold> 

    private void cbScallingActionPerformed(java.awt.event.ActionEvent evt) { 
      // TODO add your handling code here: 
      if(cbScalling.isSelected()){ 
        rdMinor.setEnabled(true); 
        rdMajor.setEnabled(true); 
      } 
      else{ 
        rdMinor.setEnabled(false); 
        rdMajor.setEnabled(false); 
        scallingType = null; 
        updateTotalPayment(); 
      } 
    } 

    private void cbFillingActionPerformed(java.awt.event.ActionEvent evt) { 
      // TODO add your handling code here: 
      if(cbFilling.isSelected()){ 
        txtFillingCount.setEnabled(true); 
      } 
      else{ 
        txtFillingCount.setEnabled(false); 
      } 
    } 

    private void cbExtractionActionPerformed(java.awt.event.ActionEvent evt) { 
      // TODO add your handling code here: 
      if(cbExtraction.isSelected()){ 
        txtExtractionCount.setEnabled(true); 
      } 
      else{ 
        txtExtractionCount.setEnabled(false); 
      } 
    } 

    private void rdMinorActionPerformed(java.awt.event.ActionEvent evt) { 
      // TODO add your handling code here: 
      if(rdMinor.isSelected()){ 
        scallingType = "Minor"; updateTotalPayment(); 
      } 
    }

    private void rdMajorActionPerformed(java.awt.event.ActionEvent evt) { 
      // TODO add your handling code here: 
      if(rdMajor.isSelected()){ 
        scallingType = "Major"; updateTotalPayment(); 
      } 
    } 

    private void cmbDayActionPerformed(java.awt.event.ActionEvent evt) { 
      // TODO add your handling code here: 
      appointment.setDay(cmbDay.getItemAt(cmbDay.getSelectedIndex()));  
      updateTotalPayment(); 
    } 

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) { 
      // TODO add your handling code here: 
      mainGui.setVisible(true); 
      this.setVisible(false); 
    } 

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) { 
      // TODO add your handling code here: 
      txtName.setText(""); 
      txtIcNum.setText(""); 
      txtPhoneNum.setText(""); 
      txtAppointmentId.setText(""); 
      txtDate.setText(""); 
      txtTime.setText(""); 
      cmbDay.setSelectedIndex(0); 
      cbScalling.setSelected(false); 
      rdMajor.setSelected(false); 
      rdMajor.setEnabled(false); 
      rdMinor.setSelected(false); 
      rdMinor.setEnabled(false); 
      cbFilling.setSelected(false); 
      cbExtraction.setSelected(false); 
      txtFillingCount.setText(""); 
      txtExtractionCount.setText(""); 
      txtPayment.setText("0.00"); 
    } 

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) { 
      // TODO add your handling code here:
      appointmentArray.addAppointment(appointment); 
        JOptionPane.showMessageDialog(null,"Your Saved.","Information",JOptionPane.INFORMATION_MESSAGE); 
      mainGui.setVisible(true); 
      this.setVisible(false); 
    } 

    // Variables declaration- do not modify 
    private javax.swing.JButton btnBack; 
    private javax.swing.JButton btnConfirm; 
    private javax.swing.JButton btnReset; 
    private javax.swing.ButtonGroup buttonGroup1; 
    private javax.swing.JCheckBox cbExtraction; 
    private javax.swing.JCheckBox cbFilling; 
    private javax.swing.JCheckBox cbScalling; 
    private javax.swing.JComboBox<String> cmbDay; 
    private javax.swing.JPanel jPanel1; 
    private javax.swing.JPanel jPanel2; 
    private javax.swing.JLabel lblAppointmentDetails; 
    private javax.swing.JLabel lblAppointmentId; 
    private javax.swing.JLabel lblDate; 
    private javax.swing.JLabel lblDay; 
    private javax.swing.JLabel lblExtractionCount; 
    private javax.swing.JLabel lblFillingCount; 
    private javax.swing.JLabel lblIcNum; 
    private javax.swing.JLabel lblName; 
    private javax.swing.JLabel lblPayment; 
    private javax.swing.JLabel lblPhoneNum; 
    private javax.swing.JLabel lblService; 
    private javax.swing.JLabel lblTime; 
    private javax.swing.JRadioButton rdMajor; 
    private javax.swing.JRadioButton rdMinor; 
    private javax.swing.JTextField txtAppointmentId; 
    private javax.swing.JTextField txtDate; 
    private javax.swing.JTextField txtExtractionCount; 
    private javax.swing.JTextField txtFillingCount; 
    private javax.swing.JTextField txtIcNum; 
    private javax.swing.JTextField txtName; 
    private javax.swing.JTextField txtPayment; 
    private javax.swing.JTextField txtPhoneNum; 
    private javax.swing.JTextField txtTime; 
    // End of variables declaration 
}
