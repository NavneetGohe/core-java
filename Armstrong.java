package exersice;

public class Armstrong {
	public static void main(String[] args) {
		
		
		int a = 153;
		int b = 153;
		int i , z=0;
		while(a!=0) {
			i=a%10;
			i=i*i*i;
			z=z+i;
			a=a/10;
		}
		
		if (z==b) {
			System.out.println("armstrong yes");
		} else {
			System.out.println("armstrong no");
		}
	}

}
