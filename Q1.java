import java.util.Scanner;

class Q1
{
	public static void main(String args[]) 
	{
		int a;
		
		Scanner vsp=new Scanner(System.in);
		System.out.print("Enter value: ");
		a=vsp.nextInt();
	
		if(a<0)
		System.out.print("Negative value");
		else
		System.out.print("Positive Value");	 
	}
}