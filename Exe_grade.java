package exersice;

public class Exe_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a = 75;
     if (a<100 && a>91) {
    	 System.out.println("Your grade A+ ");
     }
	
	else if(a<90 && a>81) {
		System.out.println("Your Grade A");
	}
	else if (a<80 && a>71) {
		System.out.println("Your grade B+");
	}
	else if(a<70 && a>61) {
		System.out.println("Your Grade B++");
		}
	else if (a< 60 && a>71) {
		System.out.println("Your Grade B");
	}
	else { 
		System.out.println("Your Grade Is Second Division");
	}
     
	}}
