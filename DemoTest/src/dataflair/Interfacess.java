package dataflair;

public class Interfacess {
	public static void main (String a[])
	{
		Atm obj = new card();
		obj.atm();
		
		Debit obj1 = new card();
		obj1.debit();
		Credit obj2=new card();
		obj2.credit();
		
		AtmCumDebit obj3 = new card();
		obj3.atm();
		obj3.debit();
	}
	

}
interface Atm
{
	 void atm();
}

interface Debit
{
	void debit();
}
interface Credit
{
	 void credit();
}
interface AtmCumDebit extends Atm,Debit
{
	
}

class card implements Atm,Debit,Credit,AtmCumDebit
{
	public void atm() {
		System.out.println("Atm");
	}
	public void debit()
	{
		System.out.println("debit");
	}
	public void credit()
	{
		System.out.println("credit");
	}
}
