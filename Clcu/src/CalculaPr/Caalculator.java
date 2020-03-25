package CalculaPr;

public class Caalculator {
	public static void main(String a[])
	{
		Calc obj = new Calc();
		obj.setvalues(4,3);
		obj.sum();
		obj.sub();
		obj.showResult();
	}

}
class Add
{
	int i,j,k;
	public void setvalues(int a,int b)
	{
		i =a;j=b;
	}
	public void sum()
	{
		k=i+j;
	}
	public void showResult()
	{
		System.out.println(k);
	}
}
	class Calc extends Add
	{
		public void sub()
		{
			k=i-j;
		}
	}

