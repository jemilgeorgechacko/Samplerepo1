package Superconstructor;

public class Superconstructorchild extends Superconstructorparent
{
	public Superconstructorchild()
	{
		super("hello");
		System.out.println("default constructor");
	}
	

	public static void main(String[] args) 
	{
		Superconstructorchild obj=new Superconstructorchild();	

	}

}
