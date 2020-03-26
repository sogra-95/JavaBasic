package PacSu;

public class anonymo {
public static void main (String a[])
{
	//Abc obj = new Abc();//reference
	new Abc().show();//anonymous => called constructor only once
	//obj.show();
}
}
class Abc
{
	
	public void show()
	{
		System.out.println("in constructor");
	}
}
