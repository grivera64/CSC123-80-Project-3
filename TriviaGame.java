//package project3;

/* 
 * 
 * Name: grivera64
 * CSC123-80
 * Project 3
 * 
 * Program: TriviaGame.java
 * Required Classes: Player.java and Question.java
 * Required Files: trivia.txt
 * ---------------------------------------------------
 * Purpose: To quiz two players about any information formatted in a text file
 * as the following:
 * 
 * (#) Question
 * Answer 1
 * Answer 2
 * Answer 3
 * Answer 4
 * Correct #
 * 
 */

//imports
import java.util.Scanner;		//for Scanner class
import java.util.ArrayList;		//for ArrayList<E> class
import java.io.IOException;		//for throwing IOExceptions with Files
import java.io.File;			//for File class

public class TriviaGame
{
	
	//static final keyboard
	public static final Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException
	{
		
		//local variables (unused variables are commented out)
		final int NUM_PLAYERS = 2;
		//int numQuestions = 0;		//this is not used in any action
		int playerTurn = 1;
		//int questionNum;			//purpose is unknown, because
									//such value is never used for any action
		//int playerAnswer;			//answer is stored in Player object
		//int player1Points = 0;	//points are stored in the player objects
		//int player2Points = 0;	//points are stored in the player objects
		
		//creating Player and Question objects for use
		Player[] players = new Player[NUM_PLAYERS];
		ArrayList<Question> questions = new ArrayList<Question>();
		
		//setting up players
		players[0] = new Player(1);
		players[1] = new Player(2);
		
		//setting up questions
		initQuestions(questions);
		
		/* Game starts here */
		
		//Iterate through each question and ask for and verify each question's answer
		for (Question question : questions)
		{
			
			//print Question
			System.out.printf("Question for Player %d:\n%s\n%s\n",
					playerTurn, "--------------", 
					question.getQuestionText());
			
			//print possible answers
			for (int index = 1; index <= 4; index++)
			{
				System.out.printf("%d. %s\n", index, 
						question.getPossibleAnswer(index));
			}
			
			//request for answer
			players[playerTurn - 1].chooseAnswer(keyboard);
			
			//verifying answer
			if (players[playerTurn - 1].getCurrentAnswer() 
					== question.getCorrectAnswerNumber())
			{
				
				System.out.printf("%s\n", "Correct!");
				players[playerTurn - 1].incrementPoints();
				
			}
			else
			{
				
				System.out.printf("%s%s\n%s\n", "Sorry, that's incorrect.",
						"The correct answer is:", question.getCorrectAnswerNumber());
				
			}
			
			//switching player turns
			playerTurn = (playerTurn % 2 == 0) ? 1 : 2;
			
		}
		
		//end game
		showGameResults(players);
		
		//closing the input and terminating program
		keyboard.close();
		
	}
	
	//reading the questions and storing them into the question ArrayList
	public static void initQuestions(ArrayList<Question> questAL) throws IOException
	{
		
		//requesting for a file to open and test
		System.out.printf("Please enter the name of the file with the questions: ");
		
		File inputFile = new File(keyboard.nextLine());
		
		//testing if file exists, otherwise, soft exit
		if (!inputFile.exists())
		{
			System.out.printf("The file is invalid! Soft Exiting...\n\n");
			System.exit(0);
		}
		
		//scan file for questions
		Scanner inFile = new Scanner(inputFile);
		Question tempQuestion;
		
		//look for all questions until no more
		while (inFile.hasNext())
		{
			
			//make question
			tempQuestion = new Question();
			
			//read question
			tempQuestion.setQuestionText(inFile.nextLine());
			
			//read possible answers
			for (int questionIndex = 1; questionIndex <= 4; questionIndex++)
			{
				tempQuestion.setPossibleAnswer(inFile.nextLine(), questionIndex);
			}
			
			//read correct answer
			tempQuestion.setCorrectAnswerNumber(Integer.parseInt(inFile.nextLine()));
			
			//add to arraylist for later use (as if it were a return)
			questAL.add(tempQuestion);
			
		}
		
		//close file reader
		inFile.close();
		
	}
	
	//prints question
	public static void displayQuestion(Question question, int playerNumber)
	{
		
		System.out.printf("Player #%d:\n%s\n", playerNumber, question.getQuestionText());
		
	}
	
	//prints game over screen, point breakdown, and winner
	public static void showGameResults(Player[] players)
	{
		
		//show game ended
		System.out.printf("Game Over!\n-------------\n");
		
		//display points
		System.out.printf("Player 1's Points: %d\nPlayer 2's Points: %d\n",
				players[0].getPoints(), players[1].getPoints());
		
		//display winner
		System.out.printf("%s", 
				(players[0].getPoints() > players[1].getPoints()) ? 
						"Player 1 wins!" : "Player 2 wins!");
		
	}
	
	
}