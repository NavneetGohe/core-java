package com;

public class Switch {
	public static void main(String[] args) {
		int size = args.length;
		switch (size) {
		case 0 :
			System.out.println("usage : helloAll n1 n2 n3..");
			break;
		case 1:
			System.out.println("hello "+ args);
			break;
			default :
	 for  (int i = 0; i<size; i ++ ) {
		 System.out.println(i + " = hello"+ args[i]);
		 
	 }
		}
		
	}

}
