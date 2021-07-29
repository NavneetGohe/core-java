package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonPattern {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		 Date d = new Date();
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
	 String str =  sdf.format(d);
	 System.out.println("today's date is "+ str);
	 Date str1 = sdf.parse("2021.07.13");
	 System.out.println(str1);

	}

}
