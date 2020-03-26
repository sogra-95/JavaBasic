package PacSu;

public class superclasses {

	public static void main(String a[]) {
		// TODO Auto-generated method stub
		x obj = new x();
		obj.show();

	}

}
class x
{
	public x()
	{
		System.out.println("in x con");
	}
	public void show()
	{
		System.out.println("in x show");
	}
}
class y extends x
{
	public y()
	{
		System.out.println("in y cons");
	}
	public void show() {
		System.out.println("in y show");
	}
}
