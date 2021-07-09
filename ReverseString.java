package exersice;

public class ReverseString {

	public static void main(String[] args) {
		String name  = "Vijay Dinanath Chouhan";
		int a = name.length()-1;
		//System.out.println(a);
		for(int i=a;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	}

}
