package exersice;

public class StringBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name  = "Vijay Dinanath Chouhan";
System.out.println("String Lenthe"+name.length());
System.out.println("7 th charactor"+name.charAt(6));
System.out.println("Dina index is"+name.indexOf("Dina"));
System.out.println("first i position"+name.indexOf("i"));
System.out.println("last i position"+ name.lastIndexOf("i"));
System.out.println("n is replaced by b"+name.replace("n","b"));
System.out.println("All a is replaced by b:-mmmmmmm "+name.replaceAll("a", "b"));
	}

}
