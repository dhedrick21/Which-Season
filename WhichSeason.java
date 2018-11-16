/**
 * Dylan Hedrick
 * Which Season 
 */
import java.util.Scanner;

public class WhichSeason 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your birth month(1-12): ");
		int month = keyboard.nextInt();
		if(month != )
		{
			System.out.print("That is an invalid month");
		}
		int winter = 12 || 1 || 2;
		int spring = 3 || 4 || 5;
		int summer = 6 || 7 || 8;
		int autumn = 9 || 10 || 11;
		if(month == winter)
		{
			System.out.print("You were born in winter");
		}
		else if(month == spring)
		{
			System.out.print("You were born in spring");
		}
		else if(month == summer)
		{
			System.out.print("You were born in summer");
		}
		else if(month == autumn)
		{
			System.out.print("You were born in autumn");
		}
	}

}
