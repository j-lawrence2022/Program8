//Application: Program 8
//Name: Justin Lawrence 
//GitHub User: j-lawrence2022
//Date: Nov 15 2022
//Version: 1.0
//Description: Strings and String Methods
import java.util.Scanner;
public class program08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Create scanner to collect data from keyboard
Scanner keyboard = new Scanner(System.in);
		
		//Ask the user for the first string 
System.out.println("What is your favorite color?");
String first = keyboard.next();

String upper = first.toUpperCase();
System.out.println("Thank you your favorite color is " +upper);
//Print out to show answer for first question and add the based methods to answer.

//Ask the user for the second string 
System.out.println("What is your favorite food?");
String second = keyboard.next();

String lower = second.toLowerCase();
System.out.println("Thank you your favorite food is " +lower);
//Print out to show answer for second question and add the based methods to answer.


//Ask the user for the third string 
System.out.println("What is your favorite number(Spell the number)?");
String third = keyboard.next();


System.out.println("Thank you your favorite number has " +third.length()+ " letters");
//Print out to show answer for third question and add the based methods to answer.

//Ask the user for the fourth string 
System.out.println("What is your name?");
String fourth = keyboard.next();

System.out.println("Thank you the third letter of your name is " +fourth.charAt(2));

//Ask the user for the fifth string 
System.out.println("What is your favorite month?");
String fifth = keyboard.next();

//Use if statement to determine what happens if the answer for the fifth string contains an n.
if (fifth.contains("n"))
{
System.out.println("The month you have choosen contains an n.");	
} else
{
	System.out.println("Thank you your favorite month is " +fifth+ " which contains an n");
}
			
		
	}

}
