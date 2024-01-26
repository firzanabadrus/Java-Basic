/*
This program is to calculate volume of cone
Student name : NUR FIRZANA BINTI BADRUS HISHAM
Matric number : MS2216110439
Practicum : F17 */

import java.util.Scanner;
class SetC{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in); //Create a scanner object
		double rad, height, length, vol; //Declare variable

		System.out.print("Enter radius: ");
		rad=sc.nextDouble();
		System.out.print("Enter height :");
		height=sc.nextDouble();
		System.out.print("Enter length :");
		length=sc.nextDouble();

		vol= (3.142*+rad*+length) + (3.142*(+rad*+rad)); //Calculate
		System.out.println("Area of cone :" +vol+ " square"); //Output
		}
	}