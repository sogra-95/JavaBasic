package SetProject;

public class Superche {
public static void main (String a[])
{
	x obj = new y();
	obj.show();
}
}
class x
{
	int i =1;
	public x()
	{
		//super();
		System.out.println("in con x");
	}
	public void show ()
	{
		System.out.println("in x para");
	}
}
class y extends x
{
	int i=5;
	public y()
	{
		//super();
		System.out.println("in con y");
	}
	public void show ()
	{
	  super.show();
		System.out.println("in y para"+super.i);
	}
}
