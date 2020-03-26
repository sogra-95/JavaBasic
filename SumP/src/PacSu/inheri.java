package PacSu;

public class inheri {
	public static void main (String a[])
	{
		calc obj = new calc();
		obj.setvalue(5,6);
		//obj.sum();
		obj.sub();
		obj.showresult();
	}
}
class Adds
{
	int i,j,k;
	public void setvalue(int a,int b)
	{
		i=a;j=b;
	}
	public void sum()
	{
		k=i+j;
	}
	public void showresult()
	{
		System.out.println(k);
	}
}
class calc extends Adds
{
	public void sub()
	{
		k=i-j;
	}
}



