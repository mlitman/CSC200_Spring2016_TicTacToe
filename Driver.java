import java.util.Scanner;


public class Driver 
{
	static char[] row1 = {'_','_','_'};
	static char[] row2 = {'_','_','_'};
	static char[] row3 = {'_','_','_'};
	
	public static void main(String[] args)
	{
		Driver.displayBoard();
		System.out.print("Please enter a row:");
		int row = Driver.getIntFromUser();
		System.out.print("Please enter a column:");
		int column = Driver.getIntFromUser();
		Driver.makeMove(row, column, 'X');
		Driver.displayBoard();
	}
	static void playGame()
	{
		//toggle between the X and O player asking each one to make
		//moves indefinitely.  The new board should be shown after each
		//move
	}
	
	static void makeMove(int row, int column, char move)
	{
		char[] theRow = row1;
		if(row == 2)
		{
			theRow = row2;
		}
		else if(row == 3)
		{
			theRow = row3;
		}
		theRow[column-1] = move;
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
				System.out.print("_O_");
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
		 * 
 */
 
