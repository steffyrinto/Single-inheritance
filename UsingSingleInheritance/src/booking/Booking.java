package booking;

public class Booking {

	private int persons;
	private int days;
	private int traiff;
	private String roomtype;
	public int getPersons() {
		return persons;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getTraiff() {
		return traiff;
	}
	public void setTraiff(int traiff) {
		this.traiff = traiff;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	double roomBooking(int persons, int days, double traiff, String roomtype)
	{
		double totalamount=persons*days*traiff;
		return totalamount;
	}
}
