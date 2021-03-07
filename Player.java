//package project3;

/* 
 * 
 * Name: grivera64
 * CSC123-80
 * Project 3
 * 
 * Driver Class (Main Program): TriviaGame.java
 * Current Class: Player.java
 * -------------------------------------------------
 * Purpose: To store the data related to each player individual
 * 
 */

//imports for using the Scanner class
import java.util.Scanner;

public class Player
{
	
	//class fields
	private int playerNumber;
	private int points;
	private int currentAnswer;
	
	//constructor
	public Player(int playerNumber)
	{
		
		//initializing the player's fields
		this.setPlayerNumber(playerNumber);
		this.setPoints(0);
		
	}
	
	/* All of the methods below are self-explanatory by method names */
	
	//set which player this object represents
	public void setPlayerNumber(int playerNumber)
	{
		
		this.playerNumber = playerNumber;
		
	}
	
	//set the initial points each player has
	public void setPoints(int points)
	{
		
		this.points = points;
		
	}
	
	//ask Player to enter their current answer and save
	public void chooseAnswer(Scanner input)
	{
		
		System.out.printf("Enter the number of the correct answer: ");
		this.currentAnswer = input.nextInt();
		input.nextLine();
		
	}
	
	//returns the player the object represents
	public int getPlayerNumber()
	{
		
		return this.playerNumber;
		
	}
	
	//returns earned points
	public int getPoints()
	{
		
		return this.points;
		
	}
	
	//returns player's answer
	public int getCurrentAnswer()
	{
		
		return this.currentAnswer;
		
	}
	
	//adds 1 to the player's points
	public void incrementPoints()
	{
		
		this.points++;
		
	}
	
}