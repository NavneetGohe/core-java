package exersice;


public class ReversePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "navneet gohe";
		String arr[]= name.split(" ");
		for(int i =0; i <arr.length;i++) {
			for(int j = arr[i].length()-1;j>=0;j--)
			{System.out.print(arr[i].charAt(j));
		}
			System.out.print(' ');
	}

	}}
