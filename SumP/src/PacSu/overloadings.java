package PacSu;

public class overloadings {
	public static void main(String a[])
	{
		BB obj = new BB(5.5f);
	}

}
class BB
{
	public BB()
	{
		System.out.println("default");
	}
	public BB(int a)
	{
		System.out.println("hi int");
	}
	public BB(float f)
	{
		System.out.println("hi float");
	}
	public BB(double d)
	{
		System.out.println("hidouble");
	}
}
