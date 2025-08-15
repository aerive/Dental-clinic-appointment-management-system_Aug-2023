package projectskip1103;

	public class Appointment {
		private Patient patient;
		private String date, time, day,appointmentId;
		private double payDay = 0.0, servicePayment = 0.0, discount = 0.0, totalPayment = 0.0;

		public Appointment(Patient patient){
			this.patient = patient;
		}

		public String getPatientName(){
			return patient.getName();
		}
		
		public String getPatientIC(){
			return patient.getIcNum();
		}

		public String getPatientNumber(){
			return patient.getPhoneNum();
		}

		public String getDate() {
			return date;
		}

		public String getTime() {
			return time;
		}

		public String getDay() {
			return day;
		}
		
		public String getAppointmentId() {
			return appointmentId;
		}
		
		public double getTotalPayment() {
			return totalPayment;
		}
		
		public void setDate(String date) {
			this.date = date;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public void setAppointmentId(String appointmentId) {
			this.appointmentId = appointmentId;
		}
		
		public void calculateServicePayments(String scallingType,int fillingCount, int extractionCount) {
			servicePayment=0.0;
			if(scallingType!=null){
				if (scallingType.equalsIgnoreCase("Minor")) {
					servicePayment+=40;
				}
				else if (scallingType.equalsIgnoreCase("Major")) {
					servicePayment+=50;
				}
			}
			servicePayment+=(fillingCount*5) + (extractionCount*10);
		}
		
		public void calculateDiscount(AppointmentArray appointmentArray) {
			boolean regularPatient = false;

			for (int i = 0; i < appointmentArray.getCount(); i++) {
				if (patient.getName().equalsIgnoreCase(appointmentArray.getArray()[i].getPatientName())) {
					regularPatient = true;
					discount = 0.1;
					break;
				}
				else
					discount = 0.0;
				}
		}

		public void calculateTotalPayment() {
			if (day.equalsIgnoreCase("Saturday") | day.equalsIgnoreCase("Sunday")) {
				payDay = 20.0;
			} else {
				payDay = 10.0;
			}
			totalPayment = (payDay + servicePayment)*(1-discount);
		}

		public String toString() {
			return "----Appoinment Details----\nAppointment ID:" + appointmentId + "\n Patient Name:" + patient.getName() + "\nPatient IC:" +patient.getIcNum()+ "\nDate:" + date + "\nTime" + time + "\nDay:" + day + "\nTotal Payment:RM"+totalPayment;
		}
}
