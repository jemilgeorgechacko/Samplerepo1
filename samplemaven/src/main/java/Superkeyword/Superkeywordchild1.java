package Superkeyword;

public class Superkeywordchild1 extends Superkeywordparent1  {
	public void display1()
	{
		super.display();
		System.out.println("superkeywordchild1");
	}

	public static void main(String[] args) 
	{
		Superkeywordchild1 obj=new Superkeywordchild1();
		obj.display1();
		
		
		
	

	}

}
