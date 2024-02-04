/* method with No Arguement and with no ReturnValue*/

import java.util.Scanner;
class method3{
	public static void main(String[]args){
		sumProduct();     //method call

	}
	static void sumProduct(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b=sc.nextInt();

		int sum =a+b;
		int product=a*b;
		System.out.println("Sum is: "+sum);
		System.out.println("Product is: "+product);
	}
}



