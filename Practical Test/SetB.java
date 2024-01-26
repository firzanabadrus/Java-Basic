import java.util.Scanner;
class SetB{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number:" );
		int p=sc.nextInt();
		System.out.print("Enter 2nd number:" );
		int q=sc.nextInt();

		isNotDivisible(p,q);
	}
	static boolean isNotDivisible(int a, int b){
		if( a%b !=0)
			System.out.println(a+"is not divisible by"+b);

		else
			System.out.println(a+"is divisible by"+b);
	}
}