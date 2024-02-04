/* Method with No Arguement and No Return Value*/

import java.util.Scanner;
class method2{
	public static void main(String[]args){
		printAmerican();                     //method call
	}
	static void printAmerican(){              //method def
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter day: ");
		String day= sc.next();
		System.out.print("Enter date: ");
		int date= sc.nextInt();
		System.out.print("Enter month(Jan-Dec): ");
		String month=sc.next();
		System.out.print("Enter year: ");
	    int year=sc.nextInt();

	    System.out.println(day+", " +month+ " "+date+", " +year);
	}
}





