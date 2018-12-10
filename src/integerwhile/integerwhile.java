/**
 * @author Hady Diab, integer while loop.(12/10/2018)
 */

package integerwhile;

import java.util.Scanner;

public class integerwhile 
{

	public static void main(String[] args) 
	{
		Scanner yeet=new Scanner(System.in);
		System.out.print("\nEnter in a number greater than 1: ");
		int number= yeet.nextInt();
		int loopnumber=0;
		
		while(number<=1)
		{
			System.out.print("\nPlease enter in a number greater than 1!: ");
			number= yeet.nextInt();
			
		}
		
		while(number>1&&number<=100)
		{
			number=number*2;
			loopnumber=loopnumber+1;
			
			
		}
		System.out.print("\nThe loop ran "+loopnumber+" times! Amazing!");

	}

}
