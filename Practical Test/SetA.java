import java.util.Scanner;
class SetA{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		double sales, comm;

		System.out.print("Enter sales: ");
		sales=sc.nextDouble();
		System.out.println("Your sales for this month is RM"+sales+" net");

		if(sales<10000){
			System.out.println("No commission earned");
		}
		else if((sales>=10000)&&(sales<=39999)){
			comm=0.1*sales;
			System.out.println("Your comission is: RM"+comm );
		}
		else{
			comm=0.14*sales;
			System.out.println("Your comission is: RM"+comm);
		}
	}
}