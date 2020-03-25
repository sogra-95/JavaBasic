package PacSu;

public class Proje {
	public static void main (String a[])
	{
	Add obj = new Add();
	obj.setvalue(5,6);
	obj.sum();
	obj.showResult();
	}
}
class Add
{
	int num1,num2,result;
	public void setvalue(int n1,int n2)
	{
		num1=n1;
		num2=n2;
	}
	public void sum()
	{
		result = num1+num2;
	}
	public void showResult()
	{
		System.out.println("Result is:"+ result);
	}
}
