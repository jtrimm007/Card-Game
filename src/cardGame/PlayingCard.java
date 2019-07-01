/*
 * Name: Joshua Trimm
 * Project 9
 * constructors file
 */

package cardGame;

public class PlayingCard
{
	//define globe variables 
	private int suit; 
	private int value;
	private String ValueAsAString;
	private String SuitAsString;
	
	//create the card object
	public PlayingCard(int suit, int value)
	{
		this.suit = suit;
		this.value = value;
		setSuitString();
		setValueString();
	}
	
	// getters and setters
	public int getSuit()
	{
		return suit;
	}

	public void setSuit(int suit)
	{
		this.suit = suit;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public String getValueAsAString()
	{
		return ValueAsAString;
	}

	public void setValueAsAString(String valueAsAString)
	{
		ValueAsAString = valueAsAString;
	}

	public String getSuitAsString()
	{
		return SuitAsString;
	}

	public void setSuitAsString(String suitAsString)
	{
		SuitAsString = suitAsString;
	}

	//define what ints turn into suits
	private void setSuitString()
	{
		
		
		switch(suit)
		{
			case 1: SuitAsString = "Clubs";
			break;
			case 2: SuitAsString = "Hearts";
			break;
			case 3: SuitAsString = "Diamonds";
			break;
			case 4: SuitAsString = "Spades";
			break;
			
		}
	}
	
	//define what ints represent card values
	private void setValueString()
	{
		
		switch(value)
		{
			case 1: ValueAsAString = "ace";
			break;
			case 2: ValueAsAString = "two";
			break;
			case 3: ValueAsAString = "three";
			break;
			case 4: ValueAsAString = "four";
			break;
			case 5: ValueAsAString = "five";
			break;
			case 6: ValueAsAString = "six";
			break;
			case 7: ValueAsAString = "seven";
			break;
			case 8: ValueAsAString = "eight";
			break;
			case 9: ValueAsAString = "nine";
			break;
			case 10: ValueAsAString = "ten";
			break;
			case 11: ValueAsAString = "jack";
			break;
			case 12: ValueAsAString = "queen";
			break;
			case 13: ValueAsAString = "king";
			break;	
		}
	
		
	}
	
	@Override
	public String toString()
	{
		return this.ValueAsAString + " " + this.SuitAsString;
		
	}
	
}
