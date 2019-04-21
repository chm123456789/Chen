package aer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class text5 {
	public static void main (String[] args, CharSequence day4)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
				String s=sc.next(); 
		 		LocalDate s1 = LocalDate.parse(s); 
			LocalDate s2 = s1.plus(7,ChronoUnit.DAYS); 
			System.out.println(s2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))); 

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
		int year=curDateTime.getYear();
		int month=curDateTime.getMonthValue(); 
		int day=curDateTime.getDayOfMonth(); 

		String year1=year+"";
		String month1=month+"";
		String day1=day+"";
		System.out.println("修改年份为2017年：");
		String date2="2017-";
		if(month<10)
		{
			String date3=date2+"0"+month1;
			if(day<10)
			{ String date4=date3+"-0"+day1;
			LocalDate n1=LocalDate.parse(date4);
			System.out.println(n1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
			
			}else {
				String date4=date3+"-"+day1;
				LocalDate n1=LocalDate.parse(day4);
				System.out.println(n1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
			}}else {
				String date3=date2+""+month1;
				if(day<10) {
					String date4=date3+"-0"+day1;
					LocalDate n1=LocalDate.parse(date4);
					System.out.println(n1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
					
				}else {
					String date4=date3+"-"+day1;
					LocalDate n1=LocalDate.parse(date4);
					System.out.println(n1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
					
					
				}
			}
		System.out.println("修改年份为11月：");
		String date3=year1+"-";
		String date4=date3+"11-";
		if(day<10) {
			String date5=date4+"0"+day1;
			LocalDate n2=LocalDate.parse(date5);
			System.out.println(n2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
			
		}else {
			String date5=date4+""+day1;
			LocalDate n2=LocalDate.parse(date5);
			System.out.println(n2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
			
		}
		System.out.println("修改年份为11月：");
		String date6=year1+"-";
		if(month<10) {
			@SuppressWarnings("unused")
			String date7=date6+"0"+month1;
			String date8=date6+"-11";
			LocalDate n3=LocalDate.parse(date8);
			System.out.println(n3.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
			
		}else {
			String date7=date6+""+month1;
			String date8=date7+"-11";
			LocalDate n3=LocalDate.parse(date8);
			System.out.println(n3.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		}

		
		
		
				}

	
		
	}


 