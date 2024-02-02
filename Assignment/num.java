import java.util.Scanner;
class num{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		float[]height=new float[40];
		float shortest=height[0];

        System.out.println("Enter height of 40 students: ");
		for(int i=0; i<height.length;i++){
			height[i]=sc.nextFloat();
		}

		for(int i=0; i<height.length;i++){
			if(height[i]<shortest){
				shortest=height[i];
			}
		}
		System.out.print("The shortest student is "+shortest);
	}
}
