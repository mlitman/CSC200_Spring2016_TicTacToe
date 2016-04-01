
public class MonkeyKing extends Biped
{
	//Fields
	int whoMovedMe = -1;
	boolean isShrunk = false;
	String originalPaint = "NORMAL";
	
	void setOriginalPaint(String paintColor)
	{
		this.originalPaint = paintColor;
	}
}
