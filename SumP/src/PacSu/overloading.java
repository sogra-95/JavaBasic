package PacSu;

public class overloading {

	public static void main (String a[])
	{
		Ab obj = new Ab();
		obj.show (5.5f);
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
	public void show(double b)
	{
		System.out.println("hell double");
	}
}