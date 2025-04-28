package hierarchy;

public class ChildB extends parentA {
	public void display1()
	{
		System.out.println("child classB");
	}
	public static void main(String args[])
	{
		ChildB obj=new ChildB();
		obj.display1();
		obj.display();

}
}
