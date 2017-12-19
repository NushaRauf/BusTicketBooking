import java.util.Scanner;
public class Deatails
{
	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter Your Name : ");
		String Name	 = input.next();
		System.out.println(" Enter Your Age : ");
		int  Age   	 = input.nextInt();
		System.out.println(" Enter Your Phn : ");
		int  Phn   	 = input.nextInt();
		System.out.println(" Enter Your Address : ");
		String Address = input.next();
		System.out.println(" Enter Your Course of Study : ");
		String Course  = input.next();
		System.out.println(" Name :"+ Name + "\n Age : "+Age + "\n Address : "+Address + "\n Course of Study  : "+Course);
	}
	public void sum(double x,double y)
	{
		double result = x+y;
	}
}