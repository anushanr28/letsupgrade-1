import java.util.Scanner;
public class Exam{
	public static void main(String args[]){
		int m1,m2,m3,m4,m5;
		float per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of maths:");
		m1=sc.nextInt();
		System.out.println("Enter marks of science:");
		m2=sc.nextInt();
		System.out.println("Enter marks of social:");
		m3=sc.nextInt();
		System.out.println("Enter marks of English:");
		m4=sc.nextInt();
		System.out.println("Enter marks of Kannada:");
		m5=sc.nextInt();
		System.out.println("Marks obtained are:");
		System.out.println("Maths:"+m1);
		System.out.println("Science:"+m2);
		System.out.println("Social:"+m3);
		System.out.println("English:"+m4);
		System.out.println("Kannada:"+m5);
		per=(m1+m2+m3+m4+m5)*100f/500;	
		if(per>=70)
			System.out.println("Your grade is 'A' and percentage is "+per);
		else if(per>=50 && per<70)
			System.out.println("Your grade is 'B'and percentage is "+per);
		else if(per>=40 && per<50)
			System.out.println("Your grade is 'C'and percentage is "+per);
		else
			System.out.println("You are Failed and You secured "+per+" percentage");

		}
}