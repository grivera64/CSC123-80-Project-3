//package project3;

/* 
 * 
 * Name: grivera64
 * CSC123-80
 * Project 3
 * 
 * Driver Class (Main Program): TriviaGame.java
 * Current Class: Question.java
 * -------------------------------------------------
 * Purpose: To store all of the questions and check answers
 * 
 */


public class Question
{
	
	//Class fields
	public final int NUM_ANSWERS = 4;
	
	private String questionText;
	private String[] possibleAnswers = new String[NUM_ANSWERS];
	private int correctAnswerNumber;
	
	//constructor
	public Question()
	{
		
		//initialize the fields for the question
		this.setQuestionText("");
		this.setCorrectAnswerNumber(0);
		
		for (int index = 1; index <= 4; index++)
		{
			this.setPossibleAnswer("", index);
		}
		
	}
	
	/* The methods below are self-explanatory by their names */
	//sets the question in the object
	public void setQuestionText(String questionText)
	{
		
		this.questionText = questionText;
		
	}
	
	//sets the correct answer index of possible answers
	public void setCorrectAnswerNumber(int correctAnswerNumber)
	{
		
		this.correctAnswerNumber = correctAnswerNumber;
		
	}
	
	//sets a possible answers at a specific index
	public void setPossibleAnswer(String possibleAnswer, int index)
	{
		
		this.possibleAnswers[index - 1] = possibleAnswer;
		
	}
	
	//returns the question
	public String getQuestionText()
	{
		
		return this.questionText;
		
	}
	
	//returns the correct answer
	public int getCorrectAnswerNumber()
	{
		
		return this.correctAnswerNumber;
		
	}
	
	//returns an index-specified possible answer
	public String getPossibleAnswer(int index)
	{
		
		return this.possibleAnswers[index - 1];
		
	}
	
}