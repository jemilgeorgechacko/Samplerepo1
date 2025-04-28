package inheritance;

public class Sinlglechild  extends Singleparent{
	public void display1()
	{
	System.out.println("this is the child class");
	}
		public static void main(String args[])
		{
			Sinlglechild obj =new Sinlglechild();
			obj.display();
			obj.display1();
	}

}
