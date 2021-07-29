package practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateClass {

	

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
      Date d = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
      String str = sdf.format(d);
      System.out.println("date "+str);
      String str1 = ("13/07/2021");
      Date d1 = sdf.parse(str1);
      System.out.println(d1);
	}
	

}
