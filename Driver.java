import java.util.Scanner;


public class Driver 
{
	static char[] row1 = {'_','_','_'};
	static char[] row2 = {'_','_','_'};
	static char[] row3 = {'_','_','_'};
	
	public static void main(String[] args)
	{
		Driver.displayBoard();
		Driver.playGame();
	}
	
	//checks the current state of the board to see if there was a winner
	static boolean isWinner()
	{
		//rows
		boolean XwinnerRow1 = row1[0] == 'X' && row1[1] == 'X' && row1[2] == 'X';
		boolean OwinnerRow1 = row1[0] == 'O' && row1[1] == 'O' && row1[2] == 'O';
		boolean XwinnerRow2 = row2[0] == 'X' && row2[1] == 'X' && row2[2] == 'X';
		boolean OwinnerRow2 = row2[0] == 'O' && row2[1] == 'O' && row2[2] == 'O';
		boolean XwinnerRow3 = row3[0] == 'X' && row3[1] == 'X' && row3[2] == 'X';
		boolean OwinnerRow3 = row3[0] == 'O' && row3[1] == 'O' && row3[2] == 'O';
		
		//cols
		boolean XwinnerCol1 = row1[0] == 'X' && row2[0] == 'X' && row3[0] == 'X';
		boolean OwinnerCol1 = row1[0] == 'O' && row2[0] == 'O' && row3[0] == 'O';
		boolean XwinnerCol2 = row1[1] == 'X' && row2[1] == 'X' && row3[1] == 'X';
		boolean OwinnerCol2 = row1[1] == 'O' && row2[1] == 'O' && row3[1] == 'O';
		boolean XwinnerCol3 = row1[2] == 'X' && row2[2] == 'X' && row3[2] == 'X';
		boolean OwinnerCol3 = row1[2] == 'O' && row2[2] == 'O' && row3[2] == 'O';
		
		
		//diags
		boolean XwinnerDiag1 = row1[0] == 'X' && row2[1] == 'X' && row3[2] == 'X';
		boolean OwinnerDiag1 = row1[0] == 'O' && row2[1] == 'O' && row3[2] == 'O';
		boolean XwinnerDiag2 = row1[2] == 'X' && row2[1] == 'X' && row3[0] == 'X';
		boolean OwinnerDiag2 = row1[2] == 'O' && row2[1] == 'O' && row3[0] == 'O';
		
		return XwinnerRow1 || OwinnerRow1 ||
				XwinnerRow2 || OwinnerRow2 ||
				XwinnerRow3 || OwinnerRow3 ||
				XwinnerCol1 || OwinnerCol1 ||
				XwinnerCol2 || OwinnerCol2 ||
				XwinnerCol3 || OwinnerCol3 ||
				XwinnerDiag1 || OwinnerDiag1 ||
				XwinnerDiag2 || OwinnerDiag2;
	}
	
	static void playGame()
	{
		//toggle between the X and O player asking each one to make
		//moves indefinitely.  The new board should be shown after each
		//move
		char currMove = 'X';
		while(true)
		{
			System.out.print("Please enter a row:");
			int row = Driver.getIntFromUser();
			System.out.print("Please enter a column:");
			int column = Driver.getIntFromUser();
			if(Driver.makeMove(row, column, currMove))
			{
				//was there a winner?
				if(Driver.isWinner())
				{
					System.out.println(currMove + " is the Winner!!!");
					return;
				}
				else
				{
					if(currMove == 'X')
					{
						currMove = 'O';
					}
					else
					{
						currMove = 'X';
					}			
				}
			}
			else
			{
				System.out.println("Illegal Move!!!");
			}
			Driver.displayBoard();
		}
	}
	
	//returns true if a move was successfully made, and false otherwise
	static boolean makeMove(int row, int column, char move)
	{
		//determine which row array we are talking about
		char[] theRow = row1;
		if(row == 2)
		{
			theRow = row2;
		}
		else if(row == 3)
		{
			theRow = row3;
		}
		
		if(theRow[column-1] == '_')
		{
			theRow[column-1] = move;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static int getIntFromUser()
	{
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	static void displayRow(char[] row)
	{
		for(int i = 0; i < row.length; i = i + 1)
		{
			if(row[i] == '_')
			{
				System.out.print("___\t");
			}
			else if(row[i] == 'X')
			{
				System.out.print("_X_\t");
			}
			else
			{
				System.out.print("_O_\t");
			}
		}
		System.out.println("");
	}
	
	//static makes this function a class function
	static void displayBoard()
	{	
		Driver.displayRow(row1);
		Driver.displayRow(row2);
		Driver.displayRow(row3);
	}
}

//this is a single line comment

/*
 * 	//memory -> variables
		//type name = value;
		int a = 5; //alice whole number
		String s = "hello"; //alice text string
		boolean b = false; //alice boolean
		
		//java arrays -collections of variables
		//type[] name = new type[how many];
		int[] ar = new int[10]; //empty array that I can add 10 things to
		ar[0] = 5;
		ar[1] = 6;
		int[] ar2 = {1,2,7,14};
		ar2[1] = -5;
		
		//asking question - conditionals
		//if(boolean-expr){ 1 or more statements } else { 1 or more statements }
		if(a < 10)
		{
			System.out.println("Less than 10!");
			a = a * 2;
		}
		else
		{
			a = a / 2;
		}
		
		//repetition
		//loops
		//for(initial counter; boolean expr; change counter) { 1 or more statements }
		//while(boolean expr) { 1 or more statements }
		//do { 1 or more statements }while(boolean expr); post-check loop
		for(int i = 0; i < 10; i = i + 1) //counting problems
		{
			System.out.println(i);
		}
		
		int i = 0;
		while(i < 10) //problems where we do not know how many times we must repeat
		{
			System.out.println(i);
			i = i + 1;
		}
		
		i = 0;
		do //problems where the body must execute at least once
		{
			System.out.println(i);
			i = i + 1;
		}
		while(i < 10);
		
		//boolean operators
		 * == equivalence
		 * != not equal to
		 * &&  and
		 * ||  or
		 * & bitwise-and-operator
		 * | bitwise-or-operator
		 * 
 */
 
