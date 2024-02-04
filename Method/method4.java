/* method with Arguement and No returnValue*/

import java.util.Scanner;

class method4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        voteAge(age);   // method call
    }

    // method definition
    static void voteAge(int a) {
        if (a > 18) {
            System.out.print("You are eligible to vote");
        }
        else {
            System.out.print("You are not eligible to vote");
        }
    }
}
