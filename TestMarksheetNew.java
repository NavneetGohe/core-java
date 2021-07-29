package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMarksheetNew extends MarksheetNew {

	public static void main(String[] args) {
     List l  = new ArrayList();
     MarksheetNew  m1 = new MarksheetNew();
     m1.setRolln("1");
     m1.setFname("mayank");
     m1.setLname("gohe"); 
     m1.setPhy(78);
     m1.setChy(88);
     m1.setMat(99);
     
     MarksheetNew m2 = new MarksheetNew();
     m2.setRolln("2");
     m2.setFname("lucky");
     m2.setLname("rajput");
     m2.setPhy(79);
     m2.setChy(87);
     m2.setMat(91);
     
     MarksheetNew m3 = new MarksheetNew();
     m3.setRolln("3");
     m3.setFname("mayank");
     m3.setLname("rays");
     m3.setPhy(71);
     m3.setChy(81);
     m3.setMat(91);
     
     MarksheetNew m4 = new MarksheetNew();
     m4.setRolln("4");
     m4.setFname("sourabh");
     m4.setLname("partyde");
     m4.setPhy(69);
     m4.setChy(67);
     m4.setMat(61);
	
     
     l.add(m1);
     l.add(m2);
     l.add(m3);
     l.add(m4);
     
     Collections.sort(l, new nameus());
     
     Iterator<MarksheetNew> it = l.iterator();
     while (it.hasNext()) {
		Object m = (Object)it.next();
		System.out.println(m);
		
	}
     
     
	
	}

}
