package aer;


import java.time.*;
import java.time.format.*;

public class text5 {
	public static void main (String[] args)
	{
		LocalDate curDate=LocalDate.now();
		System.out.println(curDate);
		LocalTime curTime =LocalTime.now();
		System.out.println(curTime);
		LocalDateTime curDateTime=LocalDateTime.now(); 
		System.out.println(curDateTime);
		System.out.println(curDateTime.format(DateTimeFormatter 
					.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT))); 
		System.out.println(curDateTime.format(DateTimeFormatter 
				.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)));
		System.out.println(curDateTime.format(DateTimeFormatter 
				.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG)));
		System.out.println(curDateTime.format(DateTimeFormatter 
				.ofLocalizedDateTime(FormatStyle.FULL)));
		System.out.println(curDateTime.format(DateTimeFormatter 
				.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.LONG)));
		System.out.println(curDateTime.format(DateTimeFormatter 
				.ofPattern("yyyy-MM-dd-EEEE-hh-mm-ss")));
		System.out.println(curDateTime.format(DateTimeFormatter 
				.ofPattern("yyyy/MM/dd/EEEE/hh/mm/ss")));
		LocalDate myDate=LocalDate.parse("4-19-2019",DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		System.out.println(myDate);
		LocalDateTime myDateTime=LocalDateTime.parse("2019-4-19T23:08",DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(myDateTime);
				}

	
		
	}


 