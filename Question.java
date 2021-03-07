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
	
	/* Class fields */
	
	//public
	public final int NUM_ANSWERS = 4;
	
	//private
	private String questionText;
	private String[] possibleAnswers = new String[NUM_ANSWERS];
	private int correctAnswerNumber;
	
	//constructor
	public Question()
	{
		
		//initialize the fields for the question object
		this.setQuestionText("");
		this.setCorrectAnswerNumber(0);
		
		for (int index = 1; index <= 4; index++)
		{
			this.setPossibleAnswer("", index);
		}
		
	}
	
	/* The methods below are self-explanatory by their names */
	
	//sets the question text field in the object
	public void setQuestionText(String questionText)
	{
		
		this.questionText = questionText;
		
	}
	
	//sets the correct answer number of possible answers of the question
	public void setCorrectAnswerNumber(int correctAnswerNumber)
	{
		
		this.correctAnswerNumber = correctAnswerNumber;
		
	}
	
	//sets a possible answers at a specific index of the question
	public void setPossibleAnswer(String possibleAnswer, int index)
	{
		
		this.possibleAnswers[index - 1] = possibleAnswer;
		
	}
	
	//returns the question text of the object
	public String getQuestionText()
	{
		
		return this.questionText;
		
	}
	
	//returns the correct answer for the question
	public int getCorrectAnswerNumber()
	{
		
		return this.correctAnswerNumber;
		
	}
	
	//returns an index-specified possible answer for the question
	public String getPossibleAnswer(int index)
	{
		
		return this.possibleAnswers[index - 1];
		
	}
	
}