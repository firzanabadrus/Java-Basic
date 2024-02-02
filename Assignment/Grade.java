import java.util.Scanner;
class Grade{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		String[]names=new String[10];
		int[]marks=new int[10];

		for(int i=0; i<names.length; i++){
			System.out.print("ENTER STUDENT'S NAME " +(i+1)+" : ");
			names[i]=sc.next();

			System.out.print("ENTER STUDENTS' MARKS "+(i+1)+" : ");
			marks[i]=sc.nextInt();
		}

	    String namesHigh=names[0];
		int highest=marks[0];
		for (int i=1; i<marks.length; i++){
			if(marks[i]>highest){
				highest=marks[i];
				namesHigh=names[i];
			}
		}
		System.out.println("The best student is "+namesHigh+" with "+highest+" marks");
	}
}