package accessmodifiers;

public class access1 {
	public static void main (String args[]) {
	access1 obj=new access1();
	obj.diplay();
	obj.diplay1();
	obj.diplay2();

}
public void diplay()
{
	System.out.println("public");
}
private void diplay1()
{
	System.out.println("private");
}
protected void diplay2()
{
	System.out.println("protected");
}
 void diplay3()
{
	System.out.println("default");

}
}