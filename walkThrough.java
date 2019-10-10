public class walkThrough
{

	public walkThrough ()
	{

	}	

	public void currentGen ()
	{
		 System.out.println("Current Generation");
	}

	public void futureGen ()
	{
		System.out.println("Next Generation");
	}
	
	public void gameOver()
	{

		System.out.println("Game Over");
	}
	

	public void selectPattern()
	{
		System.out.println("Please select:\t 1)Glider \t2)Exploder \t3)Oscillator\n \t4)Quit Game");

	}


	public void sleepMsg()
	{
		System.out.println("How fast should the game refresh?");		

	}

	public void spaceR()
	{
		System.out.println("");
	}

	public void howRows()
	{
		System.out.println("How many rows would you like to have?");
	}

	public void howCols()
	{
		System.out.println("How many columns would you like to have?");
	}

	public void numofGens()
	{
		System.out.println("How many generations would you like to have?");
	}

}