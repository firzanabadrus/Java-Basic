import java.util.Scanner;
class Price{
  public static void main(String[]args){
	  Scanner sc=new Scanner(System.in);
	  int quantity;
	  double price;
	  System.out.print("Enter quantity of the magazines:");
	  quantity=sc.nextInt();

	  if(quantity<=5)
	    price=quantity*5;
	  else
	    price=quantity*7;
	  System.out.println("The price is RM"+price);

   }
}