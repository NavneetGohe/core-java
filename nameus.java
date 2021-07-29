package practice;

import java.util.Comparator;

public class nameus extends MarksheetNew implements Comparator<MarksheetNew> {

	@Override
	public int compare(MarksheetNew o1, MarksheetNew o2) {
		
		if (o1.getFname().equals(o2.getFname())==true) {
			return o1.getLname().compareTo(o2.getLname());
			}
		
		else {
			return o1.getFname().compareTo(o2.getFname());
		}
		
		
		
				
	}
	

}
//class orderbymaths implements Comparator<MarksheetNew>{

	//@Override
	//public int compare(MarksheetNew o1, MarksheetNew o2) {
	//	return o1.getMat()-o2.getMat();
	//}
	
//}
