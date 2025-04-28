package Superkeyword;

public class Superkeyworldchild extends Supervariableparent  
{
String s="yellow";
public void display()
{
System.out.println(s);
System.out.println(super.s);
} 
	public static void main(String[] args) {
		
		Superkeyworldchild obj=new Superkeyworldchild();
		obj.display();

	}

}
