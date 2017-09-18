/**
 * 
 */
package Assignment1;

/**
 * @author kumarpr
 *
 */
import java.util.Scanner;  

	public class Assignment1_4                     // Name of the class
	{

		public static void main(String[] args)     // Main methods starts
		{
			byte b;                                // Declare byte variable
			short s;                               // Declare short variable
			int i,m;                               // Declare int variable 
			long l;                                // Declare long variable
			float f;                               // Declare float variable
			double d;                              // Declare double variable
			
			/*
			 Accept Different type of input variables from user and print the sum
			 */
			Scanner input=new Scanner(System.in);   // object initialized for user input
			System.out.print("Please enter byte variable: ");  //This will print argument at the end of the line
			b=input.nextByte();                                //taking value of b as byte from user
			System.out.print("Please enter short variable: ");
			s=input.nextShort();                               //taking value of s as short from user
			
			i=(int)(b+s);	                                   //sum of value of b and value of s and storing it in integer variable i
			System.out.println("Sum of Byte and short variables is integer : "+i);  // print the value of i as integer
			System.out.println("Integer Number : "+i);
			
			l=(long)(i+s);                  //sum of value of i and value of s and storing it in long variable l
			
			System.out.println("Sum of Integer and short variables is long : "+l); // print the value of l as long
			System.out.println("Long Number : "+l);
			
			f=(float)(i+l);                //sum of value of i and value of l and storing it in float variable f
			
			System.out.println("Sum of Integer and long variables is float : "+f);   // print the value of i as integer
			System.out.println("Float Number : "+f);
			
			d=(double)(f+l);              //sum of value of f and value of l and storing it in double variable d
			
			System.out.println("Sum of Float and long variables is double : "+d);
			System.out.println("Double Number : "+d);
			
			m=(int)(f+d);                 //sum of value of f and value of d and storing it in integer variable m  
			
			System.out.println("Sum of Float and double variables is integer m : "+m);
		
			
			
			input.close();                                         //scanner class closed

	}

}
