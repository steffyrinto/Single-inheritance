package booking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int persons;
		int days;
		int traiff;
		String roomtype;
		
		double c=0;
		
		Booking b1=new Booking();
		SeasonBooking p1=new SeasonBooking();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Booking");
		System.out.println("Enter the number of persons");
		persons=Integer.parseInt(br.readLine());
		b1.setPersons(persons);
		System.out.println("Enter the number of days");
		days=Integer.parseInt(br.readLine());
		b1.setDays(days);
		System.out.println("Enter the room type");
		roomtype=br.readLine();
		b1.setRoomtype(roomtype);
		System.out.println("Enter the tariff for single person");
		traiff=Integer.parseInt(br.readLine());
		b1.setTraiff(traiff);
		c=p1.roomBooking(persons, days, traiff, roomtype);
		System.out.println("Total Tariff: "+Math.round(c)+"/-");
				
		
	}

}
