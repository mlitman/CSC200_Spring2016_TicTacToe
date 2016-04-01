
public class Scene 
{
	MonkeyKing mk1 = new MonkeyKing();
	MonkeyKing mk2 = new MonkeyKing();
	MonkeyKing mk3 = new MonkeyKing();
	MonkeyKing mk4 = new MonkeyKing();
	MonkeyKing mk5 = new MonkeyKing();
	MonkeyKing mk6 = new MonkeyKing();
	MonkeyKing mk7 = new MonkeyKing();
	MonkeyKing mk8 = new MonkeyKing();
	MonkeyKing mk9 = new MonkeyKing();
	MadHatter madHatter = new MadHatter();
	
	//return-type method-name(parameter list) { body }
	void myFirstMethod()
	{
		MonkeyKing[] theMonkeyKings = {mk1,mk2,mk3,mk4,mk5,mk6,mk7,mk8,mk9};
		for(MonkeyKing mk : theMonkeyKings)
		{
			mk.setOriginalPaint(mk.getPaint());
		}
		
		//type var_name = initial_value;
		boolean keepPlaying = true;
		
		this.playTicTacToe();
		
	}
	
	void shrink(MonkeyKing mk)
	{
		mk.isShrunk = true;
		mk.whoMovedMe = -1;
	}
	
	void playTicTacToe()
	{
		MonkeyKing[] theMKs = {mk1,mk2,mk3,mk4,mk5,mk6,mk7,mk8,mk9};
		int pos = 0;
		
		this.madHatter.say("Let me setup the board!!!");
		while(pos < 9)
		{
			shrink(theMKs[pos]);
			pos = pos + 1;
		}
		
		int userInput = 0;
		int playerMover = 0;
		boolean moveSuccess = false;
		boolean isWinner = false;
		
		while(isWinner == false)
		{
			userInput = this.madHatter.getIntegerFromUser("Please enter a move");
			
		}
	}
}
