package PacSu;

public class superclass {
/*public static void main (String a[])
{
	X obj = new Y();
}
}
class X
{
	public X()
	{
		System.out.println("in X cons");
	}
}
class Y extends X
{
	public Y()
	{
		System.out.println("in Y cons");
	}
}*/
	public static void main(String a[])
	{
		
		s obj = new t();
		obj.show(5);

	}

}
class s
{
	public s()
	{
		System.out.println("in s con");
	}
	public void show(int a)
	{
		System.out.println("in s show");
	}
}
class t extends s
{
	public t()
	{
		System.out.println("in t cons");
	}
	public void show(int a) {
		System.out.println("in t show");
	}
}

