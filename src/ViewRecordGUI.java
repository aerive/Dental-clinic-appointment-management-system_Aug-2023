package GUI;

import projectskip1103.Appointment;
import projectskip1103.AppointmentArray;

public class ViewRecordGUI extends javax.swing.JFrame {
	AppointmentArray appointmentArray;
	MainGUI mainGui;

	public ViewRecordGUI(MainGUI mainGui,AppointmentArray appointmentArray) {
		initComponents();
		this.mainGui = mainGui;
		this.appointmentArray = appointmentArray;
		txtPatientRecord.setText(appointmentArray.displayAll());
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtPatientRecord = new javax.swing.JTextArea();
		lblPatientsRecord = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		txtSearchId = new javax.swing.JTextField();
		jScrollPane2 = new javax.swing.JScrollPane();
		txtSpecificPatient = new javax.swing.JTextArea();
		jLabel1 = new javax.swing.JLabel();
		btnBack = new javax.swing.JButton();
		btnDelete = new javax.swing.JButton();
		btnConfirm = new javax.swing.JButton();
		jScrollPane3 = new javax.swing.JScrollPane();
		txtOutput = new javax.swing.JTextArea();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		txtPatientRecord.setColumns(20);
		txtPatientRecord.setRows(5);
		jScrollPane1.setViewportView(txtPatientRecord);
		
		lblPatientsRecord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		lblPatientsRecord.setText("PATIENTS RECORD");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(30, 30, 30)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(80, 80, 80)
						.addComponent(lblPatientsRecord)))
				.addContainerGap(34, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addGap(23, 23, 23)
				.addComponent(lblPatientsRecord)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jScrollPane1)
				.addContainerGap())
		);

		jLabel2.setText("Search ID:");

		txtSpecificPatient.setColumns(20);
		txtSpecificPatient.setRows(5);
		jScrollPane2.setViewportView(txtSpecificPatient);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel1.setText("SPECIFIC PATIENT");
		btnBack.setText("BACK");
		btnBack.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBackActionPerformed(evt);
			}
		});

		btnDelete.setText("DELETE");
		btnDelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDeleteActionPerformed(evt);
			}
		});

		btnConfirm.setText("CONFIRM");
		btnConfirm.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnConfirmActionPerformed(evt);
			}
		});

		txtOutput.setColumns(20);
		txtOutput.setRows(5);
		jScrollPane3.setViewportView(txtOutput);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()

.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap()
							.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)) 
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(116, 116, 116)
						.addComponent(btnBack))
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(85, 85, 85)

.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jLabel1)
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(btnConfirm))))
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(122, 122, 122)
						.addComponent(btnDelete))
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(46, 46, 46)

.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(26, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
				.addGap(26, 26, 26)
				.addComponent(jLabel1)
				.addGap(18, 18, 18)

.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel2)
						.addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(btnConfirm))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(btnDelete)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(btnBack)
				.addGap(4, 4, 4))
		);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);

		pack();
	}// </editor-fold>

	private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String searchId = txtSearchId.getText();
		Appointment appointment = appointmentArray.searchPatient(searchId);
		if (appointment != null){
			txtSpecificPatient.setText(appointment.toString());
		}
		else { 
			txtSpecificPatient.setText("Patient not found");
		}
	}

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String searchId = txtSearchId.getText();
		Appointment appointment = appointmentArray.searchPatient(searchId);
		appointmentArray.deletePatient(appointment);
		txtOutput.setText("Patient appointment has been deleted");
		txtPatientRecord.setText(appointmentArray.displayAll());
	}
	
	private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		mainGui.setVisible(true);
		this.setVisible(false);
	}

	// Variables declaration- do not modify
	private javax.swing.JButton btnBack;
	private javax.swing.JButton btnConfirm;
	private javax.swing.JButton btnDelete;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JLabel lblPatientsRecord;
	private javax.swing.JTextArea txtOutput;
	private javax.swing.JTextArea txtPatientRecord;
	private javax.swing.JTextField txtSearchId;
	private javax.swing.JTextArea txtSpecificPatient;
	// End of variables declaration
}
