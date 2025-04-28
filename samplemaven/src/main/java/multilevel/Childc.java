package multilevel;

public class Childc extends ParentB {
	public void display2()
	{
		System.out.println("child class");
	}
	public static void main(String args[])
	{
	
	Childc obj=new Childc();
	obj.display();
	obj.display1();
	obj.display2();
	}

}
