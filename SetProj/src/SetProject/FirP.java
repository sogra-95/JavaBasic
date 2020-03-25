package SetProject;

public class FirP {
	
	public static void main (String a[])
	{
		student s1 = new student();
		s1.setRollno(5);
		s1.setSname("tanzu");
		s1.getSname();
		System.out.println(s1.getRollno());
		System.out.println(s1.getSname());
	}
}
		class student
		{
			 int rollno;
			 String sname;
			
			public void setRollno(int r)
			{
				rollno =r;
			}
			public void setSname(String name)
			{
				sname = name;
			}
			public int getRollno()
			{
				return rollno;
			}
			public String getSname()
			{
				return sname;
			}
		}
	