
public class Dice 
{
	private static int rollDice(int lowerBound, int upperBound)
	{
		return lowerBound + (int)(Math.random() * upperBound);
	}
	
	public static int throwDice(int dices)
	{
		int diceRoll;
		
		int upperBound = 6 * dices;
		int lowerBound = dices;
		
		diceRoll =  + rollDice(lowerBound,upperBound);
		
		return diceRoll;
	}
}
