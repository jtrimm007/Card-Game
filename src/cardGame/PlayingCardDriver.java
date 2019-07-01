/*
 * Name: Joshua Trimm
 * Project 9
 * Shuffle cards
 * November 29, 2017
 * 
 */


package cardGame;

import java.util.ArrayList;
import java.util.Random;

/*
 * 
 */

public class PlayingCardDriver
{
	//create an array for all of the cards
	public static ArrayList<PlayingCard> cardList = new ArrayList<>();
	
	/*
	 * This is main where it prints the array shuffled and unshuffled
	 */
	
	public static void main(String[] args)
	{
	
	//loop to run through and make the cards
	for(int suit = 1; suit <= 4; suit++)
	{
		for(int value = 1; value <= 13; value++)
		{
			PlayingCard playingcard = new PlayingCard(suit, value);
			
			cardList.add(playingcard);
		}
	}
	System.out.println(cardList);
	
	
	//this is where the shuffle happens
	shuffle(10000);
	//print the shuffled list
	System.out.println(cardList);
	}
	
	//swap the card method
	public static void swap(int index1, int index2)
	{
		
		PlayingCard playincard =  cardList.get(index1);
		
		cardList.set(index1, cardList.get(index2));
		
		cardList.set(index2, playincard);
		
	}
	
	//now shuffle all the cards
	public static void shuffle(int numberOfSwaps)
	{
		//create random class
		Random random = new Random();

		
		for(int i = 0; i < numberOfSwaps; i++)
		{
			int index1 = random.nextInt(52);
			
			int index2 = random.nextInt(52);
			
			swap(index1, index2);
			
		}
	}
	
	
	
}
