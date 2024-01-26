/* NAME : NUR FIRZANA BINTI BADRUS HISHAM
   MATRIC NUMBER : MS2216110439
   PRACTICUM : K4F17                       */

import java.util.Scanner;
class PT2{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		double salary, newSalary;

		System.out.print("Enter salary : ");
		salary=sc.nextDouble();
		System.out.println("\nYour salary is RM " +salary+ " only");

		if (salary<5000){
			newSalary = (0.1 * salary)+salary;
			System.out.println("The new salary is RM " +newSalary);
		}
		else if ((salary>=5000)&&(salary<=10000)){
			newSalary = (0.05 * salary)+salary ;
			System.out.println("The new salary is RM " +newSalary);
		}
		else{
			System.out.println("Your salary remains");
		}
	}
}