package practice;

import java.util.Date;



import java.util.Calendar;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int dayofyear = cal.get(Calendar.DAY_OF_YEAR);
		cal.add(Calendar.DATE,-1);
		Date yesterday = cal.getTime();
		//get date after 30 days
		cal.add(Calendar.DATE,30);
		Date nextEvent = cal.getTime();
		System.out.println(nextEvent);		
		
	}
	

	
}
