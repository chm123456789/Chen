package aer;


public class Flight implements FlightInterface {
  private static boolean Status = false;
private String flighName;
  private int row;
  private int rowLength;
  private int[] fail= {-1};
  private Passenger[] passengerList;
private Object flightName;
  public Flight(String FlightName,int rowLength, int rowLength2)throws Exception{
	  if(FlightName==null||FlightName.trim().length()==0||row<=0||rowLength<=0)
	  {
		  this.flightName=flightName;
		  int rows = 0;
		this.row=rows;
		  this.rowLength=rowLength;
		  this.passengerList=new Passenger[row*rowLength];
		  for(int i=0;i<row*rowLength;i++)
			  passengerList[i]=null;
	  }
  }
  @Override
  public int[] reserver(String names[])
  {
	 if(names.length>rowLength)
		 return fail;
	 int i=0,j=0,k=0;
	 boolean flag=false;
	 babelA:for(i=0;i<row-1;i++)
	 {
		for(j=0;j<=rowLength-names.length;j++)
		{
			for(k=j;k<=j+names.length-1;k++)
			{
				if(passengerList[i*rowLength+k]!=null)
					break;
			}
			if(k>j+names.length-1) {
				flag=true;
		    	break babelA;
			}
			}
		}
	 
  if(!flag)
	  return fail;
  int[] bn=new int[names.length];
		  for(k=j;k<=j+names.length-1;k++)
		  {
			  bn[k-j]=i*rowLength+k+1;
			  passengerList[i*rowLength+k]=new Passenger(names[k-j],i*rowLength+k+1,i,k, k);
		  }
  return bn;
  
} 
@Override
public boolean cancel(int bookingNumber) 
{
	boolean Stanus=false;
	for(int i=0;i<row*rowLength;i++)
	{
		if(passengerList[i]!=null&&bookingNumber==passengerList[i].getBookingNumber())
		{
			Status=true;
			passengerList[i]=null;
		break;
		}
	}
	return Status;
	}
  
@Override
public Passenger[] getPassengerList() 
{
	return passengerList;
	}
@Override
public int[] reserve(String[] names) {
	// TODO Auto-generated method stub
	return null;
}
}
  
  
  
  
  
  
  
  