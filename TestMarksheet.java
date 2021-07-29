package practice;
import java.util.*;


public class TestMarksheet extends Marksheet{
	
	public static void main(String[] args) {
		List l = new ArrayList();
		Marksheet m1 = new Marksheet();
		m1.setRollNo("101");
		m1.setName("lol");
		m1.setPhysics(79);
		m1.setChemistry(89);
		m1.setMaths(99);
		
		Marksheet m2 = new Marksheet();
		m2.setRollNo("102");
		m2.setName("fox");
		m2.setPhysics(79);
		m2.setChemistry(88);
		m2.setMaths(98);
		
		
      l.add(m1);
      l.add(m2);
      System.out.println(l);
      System.out.println(l.contains(m2));
      System.out.println(l.remove(m2));
      
      HashMap map = new HashMap();
      map.put(m1,"m1");
      System.out.println(map);
		
	
	}
	

     
	}


