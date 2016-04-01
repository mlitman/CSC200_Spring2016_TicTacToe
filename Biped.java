
public class Biped extends Object
{
	String paint = "NORMAL";
	
	String getPaint()
	{
		return this.paint;
	}
	
	void say(String msg)
	{
		System.out.println(this.toString() + " -> " + msg);
	}
}
