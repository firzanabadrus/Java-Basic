import java.util.Scanner;
class NetSalary
{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int hours;
    double NetSalary;
    System.out.println("Enter your working hours");
    hours=sc.nextInt();
    NetSalary=5.5*+hours*0.89;
    System.out.println("Your monthly net salary is RM"+NetSalary);
  }
}