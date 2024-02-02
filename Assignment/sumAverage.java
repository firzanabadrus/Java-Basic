import java.util.Scanner;
class sumAverage {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 35; i <= 79; i=i+1) {
            if (i % 2 != 0) {
                sum =sum+ i;
                count=count+1;
            }
        }

        double average = (double) sum / count;

        System.out.println("Sum of odd numbers: " + sum);
        System.out.println("Average of odd numbers: " + average);
    }
}
