/* This program is to collect data of Puan Rohana student
(K1MD1) about vaccination and booster info.
NAME : NUR FIRZANA BINTI BADRUS HISHAM
MATRIC NO : MS2216110439
PRACTICUM : F17 */

import java.util.Scanner;
class Vaccine{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);

		String []name =new String[10];      //input
		char[] vaccineTaken= new char[10];
		char[] boosterTaken = new char[10];

		int bilVac =0, bilBoost =0, i=0;   //initialize

		System.out.print("STUDENT VACCINATION AND BOOSTER INFO\n\n");  //tajuk output

		for (i=0; i<name.length; i++){           //input name, vaccine taken, booster taken
			System.out.print("\nName : ");
			name[i] = sc.next();

			System.out.print("Done Vaccine taken ? ( Y/N) : ");
			vaccineTaken[i] = sc.next().charAt(0);

			System.out.print("Done Booster taken ? ( Y/N) : ");
			boosterTaken[i] = sc.next().charAt(0);

			if (vaccineTaken[i] == 'Y')              // calculate how many take vaccine
				bilVac = bilVac + 1;
			if (boosterTaken[i] == 'Y')            //calculate how many take booster
				bilBoost = bilBoost + 1;
		}

		System.out.println("\nCONCLUSION REPORT:");
		System.out.print("\nA)Number of students taken the vaccine : "+bilVac);    //display total vaccine taken
		System.out.print("\nB)Number of students taken the booster : "+bilBoost);   //display totaL booster taken

		System.out.println("\nC)List of student who have taken Booster : ");
		int num = 1;
		for ( i =0; i<name.length ; i++){                //display name list who taken booster
			if (boosterTaken[i] == 'Y'){
				System.out.println("\t" + num + ") "+name[i] );
				num= num + 1;
			}
		}
		if (num ==1)
			System.out.println("\tNone of student");


		System.out.println("\nD)List of student who not yet taken booster and their index : ");
        num=1;
		for( i=0 ; i<name.length; i++){                 //display name list who not taken booster
			if (boosterTaken[i]== 'N'){
				System.out.println("\t" + num + ") "+name[i]+ " , found at index : "+i );
		 		num = num + 1 ;
			}
		}
		if (num== 1)
			System.out.println("\tNone of student");
	}
}
