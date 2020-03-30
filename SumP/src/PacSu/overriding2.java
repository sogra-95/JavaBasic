package PacSu;

public class overriding2 {
	public static void main (String a[])
	{
		A obj = new b();
		//obj.show();
	}
	

}
class A
{
public A()
{
	System.out.println("in A");
}
}
class b extends A
{
	public b()
	{
		System.out.println("in B");
	}
}