package booking;

public class SeasonBooking extends Booking{
	double roomBooking(int persons, int days, double traiff, String roomtype)

	{
		double total=super.roomBooking(persons, days, traiff, roomtype);
		return total;		
	}

}
