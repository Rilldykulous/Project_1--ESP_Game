/**
* Class: CMSC203 
* Instructor: Khandan Monshi
* Description: Requests a variety of information about the person running the program, then inputs 
* Due: 1/30/2024
* Platform/compiler: Eclipse IDE
* I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   
* any source. I have not given my code to any student.
* Print your Name here: Samantha Gosley Brodkin
*/
package project1ESPGame;

import java.util.Scanner;
import java.util.Random;
public class ESPGame {

	public static void main(String[] args) {
		//declarations
		String name;
		String aboutMe;
		String MCID;
		String dueDate;
		String color0 = "Blue";
		String color1 = "Red";
		String color2 = "Pink";
		String color3 = "Purple";
		String distressSignal = "Mauve";
		String userGuess;
		String correctAnswer;
		int numCorrect = 0;
		int colorGenerator = 0;
		boolean guessIsValid;
		Scanner userInput = new Scanner(System.in);
		Random numGenerator = new Random();
		//ask for name
		System.out.println("Please input your name.");
		name = userInput.nextLine();
		
		//ask for mcID
		System.out.println("Please input your M#");
		MCID = userInput.nextLine();
		
		//ask for stuff about you
		System.out.println("Please input a short description of yourself");
		aboutMe = userInput.nextLine();
		
		//ask for due date
		System.out.println("Please input a due date");
		dueDate = userInput.nextLine();
		
		//ESP start
		System.out.print("Let the games begin! \n");
		for (int i=0; i<11; i++) {
			//generate color
			colorGenerator = numGenerator.nextInt(5);
			if (colorGenerator==0) {
				correctAnswer = color0;
			}
			else if (colorGenerator==1) {
				correctAnswer = color1;
			}
			else if (colorGenerator==2) {
				correctAnswer = color2;
			}
			else if (colorGenerator==3) {
				correctAnswer = color3;
			}
			else {
				correctAnswer = distressSignal;
			}
			
			//hello color please
			System.out.println("Please guess a color from the following: Blue, Red, Pink, Purple, Mauve.");
			userGuess = userInput.nextLine();
			
			//verify it's an option
			if(userGuess.equalsIgnoreCase("Blue")||userGuess.equalsIgnoreCase("Red")||userGuess.equalsIgnoreCase("Pink")||userGuess.equalsIgnoreCase("Purple")||userGuess.equalsIgnoreCase("Mauve")) {
				guessIsValid = true;
			}
			else {
				guessIsValid = false;
				i--;
				System.out.print("Please enter a valid guess. \n");
			}
			
			//spit out (in)correct
			if(userGuess.equalsIgnoreCase(correctAnswer)&&guessIsValid==true) {
				System.out.println("Correct!");
				numCorrect++;
			}
			else if (guessIsValid==true) {
				System.out.println("Incorrect, the correct answer was " + correctAnswer);
			}
		}
		System.out.print("Game Over. \n");
		System.out.println("Your score: " + numCorrect + "/11");
		System.out.print("Your name: " + name);
		System.out.print("\nYour M#: " + MCID);
		System.out.print("\nYour Description: " + aboutMe);
		System.out.print("\nDue Date: " + dueDate);
	}

}
