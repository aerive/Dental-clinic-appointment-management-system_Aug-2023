package projectskip1103;

public class AppointmentArray {

	private int count = 0;
	private Appointment[] array;
	private int location = 0;
	
	public AppointmentArray() {
		array = new Appointment[3];
	}

	public int getCount() {
		return count;
	}

	public Appointment[] getArray() {
		return array;
	}

	public void addAppointment(Appointment appointment) {
		array[count] = appointment;count++;
	}

	public Appointment searchPatient(String searchID) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && searchID.equals(array[i].getAppointmentId())) {
				System.out.println("Appointment has been found.");
				return array[i];
			}
		}
		return null;
	}

	public void deletePatient(Appointment appointment) {
		for(int i=0; i<array.length; i++){
			if(array[i]==appointment){
				array[i] = null;
				System.out.println("Appointment has been deleted from records.");
			}
		}
	}

	public String displayAll() {
		String display = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				display += array[i].toString(); //first dia display array yg appointment[0], then update i
				display += "\n\n";
			}
		}
		return display;
	}
}
