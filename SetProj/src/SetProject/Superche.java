package SetProject;

public class Superche {
public static void main (String a[])
{
	x obj = new y(5);
}
}
class x
{
	public x()
	{
		super();
		System.out.println("in con x");
	}
	public  x(int i)
	{
		System.out.println("in x para");
	}
}
class y extends x
{
	public y()
	{
		//super();
		System.out.println("in con y");
	}
	public y(int i)
	{
		super (i);
		System.out.println("in y para");
	}
}
