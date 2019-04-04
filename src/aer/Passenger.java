package aer;

public class Passenger  implements PassengerInterface 
{
   private String names;
   private int bookingNumber;
   private int rows;
   private int seatPosition;
   
   public Passenger(String names,int bookNumber,int rows,int seatPosition, int bookingNumber) 
   {
	   this.names=names;
	   this.bookingNumber=bookingNumber;
	   this.seatPosition=seatPosition;
   }
   public String getBookNumber() {
	   return names;
   }
   public int getRow()
   {
	   return rows;
   }
   public int getPosistion()
   {
	   return seatPosition;
   }
@Override
public String getName() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public int getBookingNumber() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public int getNow() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public int getSeatPosition() {
	// TODO Auto-generated method stub
	return 0;
}
}
