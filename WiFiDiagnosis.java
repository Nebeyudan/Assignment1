/*
 * Class: CMSC203 
 * Instructor:
 * Description: (WiFi Diagnosis program)
 * Due: 2/09/2021
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Nebeyu Daniel
*/

import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) 
	{
		//create text output
	System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
	System.out.println("First step: reboot your computer");
	System.out.println("Are you able to connect with the internet? (yes/no)");
		// create text input
	Scanner input = new Scanner(System.in);
	String answer;
	answer = input.next();
		// conditional 
	if (answer.equalsIgnoreCase("no") )
		{
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			answer = input.next();
			   //conditional2
			if(answer.equalsIgnoreCase("no"))
			{
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				answer = input.next();
			}
			else 
			{
				System.out.println("Rebooting your router seems to work");
			}			
					//conditional3
				if(answer.equalsIgnoreCase("no"))
				{
					System.out.println("Fourth step: move your computer closer to your router");
					System.out.println("Now are you able to connect with the internet? (yes or no)");
					answer = input.next();	
				}
				else {
					System.out.println("Checking the router's cables seemed to work");
				}		
						//conditional4
					if(answer.equalsIgnoreCase("no"))
					{
						System.out.println("Fifth step: contact your ISP\n"
								+ "Make sure your ISP is hooked up to your router.");
					}
		}
	else 
	{
		System.out.println("Rebooting your computer seemed to work");
	}
	input.close();
	}
}
