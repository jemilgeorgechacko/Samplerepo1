package Agregation;

public class Agregationchild 
{
	String city;
	String state;
	Agregationparent ref;
	public Agregationchild(String city,String state,Agregationparent ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
public void diplay()
{
	System.out.println(ref.name+" "+ref.rollno+" "+city+" "+state);
}
	public static void main(String[] args) {
		Agregationparent obj=new Agregationparent("jemil",25,"arn");
		 Agregationchild obj1= new  Agregationchild("ptm","kerala",obj);
		 obj1.diplay();
		
		

	}

}
