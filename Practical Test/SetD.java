/*
This program is to calculate volume of hemisphere
Student name: NUR FIRZANA BINTI BADRUS HISHAM
Matric number: MS2216110439
Practicum: F17 */

import java.util.Scanner;
class SetD{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in); //Create a scanner object
		double rad, vol; //Declare variable

		System.out.print("Enter radius :");
		rad=sc.nextDouble(); //Read user input

		vol= +rad*+rad*+rad *3.142 * 2/3; //Calculate the volume
		System.out.println("Volume of hemisphere :" +vol+" cubic"); //Output
		}
	}