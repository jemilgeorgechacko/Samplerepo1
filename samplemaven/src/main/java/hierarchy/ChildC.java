package hierarchy;

public class ChildC extends parentA  {
	public void display1()
	{
		System.out.println("child classC");
	}
	public static void main(String args[])
	{
		ChildC obj=new ChildC();
		obj.display1();
		obj.display();
		
		
	}

}
