package PacSu;

public class overloading {

	public static void main (String a[])
	{
		Ab obj = new Ab();
		obj.show ();
	}
}
class Ab
{
	public void show()
	{
		System.out.println("default");
	}
	public void show(int a)
	{
		System.out.println("hello int");
	}
	public void show(float b)
	{
		System.out.println("hell float");
	}
}